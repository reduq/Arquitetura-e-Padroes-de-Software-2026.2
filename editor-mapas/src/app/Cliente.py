from elemento.Arvore import Arvore
from elemento.Bau import Bau
from flyweight.FabricaAparencia import FabricaAparencia
from mapa.Mapa import Mapa


class Cliente:
    @staticmethod
    def main():
        # 1. Flyweight: a fábrica cria uma única aparência com uma textura de 1 MiB.
        # Pedidos com o mesmo tipo e textura devolvem exatamente a mesma instância.
        fabrica = FabricaAparencia()
        textura = b"\x2a" * (1024 * 1024)
        aparencia = fabrica.obter("carvalho", textura)
        arvore = Arvore("Carvalho A", 1, 2, aparencia, altura=8)
        outra = Arvore("Carvalho B", 5, 6,
                       fabrica.obter("carvalho", textura), altura=10)
        print("Aparência compartilhada:", arvore.aparencia is outra.aparencia)
        print("Textura compartilhada:", arvore.aparencia.textura is outra.aparencia.textura)
        print("Tamanho da textura compartilhada:", len(textura), "bytes")

        # 2. Prototype: o jogador cria uma árvore a partir de outra existente.
        # Nome e posição são individuais; a aparência imutável continua compartilhada.
        copia = arvore.clonar()
        copia.nome, copia.x, copia.y = "Carvalho C", 9, 3
        assert copia is not arvore and copia.aparencia is arvore.aparencia
        print("Protótipo:", arvore.descrever(), "->", copia.descrever())

        # 3. Memento: o mapa começa com um snapshot vazio. Cada adicionar chama
        # automaticamente o Caretaker, salvando clones Prototype em um novo memento.
        mapa = Mapa()
        caretaker = mapa.caretaker
        for elemento in (arvore, outra, copia):
            mapa.adicionar(elemento)
        bau = Bau("Tesouro", 4, 4, fabrica.obter("baú", b"madeira"), ["ouro"])
        mapa.adicionar(bau)
        mapa.exibir()

        # 4. A lista mutável de itens também é clonada: modificar o objeto de origem
        # não altera o mapa nem os snapshots. Só o Flyweight imutável é compartilhado.
        bau.itens.append("rubi")
        assert mapa.elementos[-1].itens == ["ouro"]
        print("Itens preservados no mapa:", mapa.elementos[-1].itens)

        # 5. Remover registra automaticamente o mapa sem o baú.
        # Undo restaura o snapshot anterior e Redo recupera a remoção.
        mapa.remover(3)
        print("Após remover o baú:")
        mapa.exibir()
        caretaker.undo()
        print("Após Undo (baú restaurado):")
        mapa.exibir()
        caretaker.redo()
        print("Após Redo (baú removido novamente):")
        mapa.exibir()

        # 6. Uma edição depois de Undo inicia outro caminho e invalida o antigo Redo.
        caretaker.undo()
        mapa.remover(0)
        assert not caretaker.redo()
        print("Nova edição após Undo: Redo anterior descartado.")

        # 7. Desfazemos até o estado vazio e refazemos até o estado final.
        # Nos limites, os métodos retornam False e mantêm o estado atual.
        while caretaker.undo():
            pass
        assert not mapa.elementos
        print("Todos os passos desfeitos:")
        mapa.exibir()
        while caretaker.redo():
            pass
        print("Todos os passos refeitos:")
        mapa.exibir()


if __name__ == "__main__":
    Cliente.main()
