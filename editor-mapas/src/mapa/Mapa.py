from elemento.Elemento import Elemento
from memento.Caretaker import Caretaker
from memento.MapaMemento import MapaMemento


class Mapa:
    """Originator do Memento: controla a coleção e registra cada edição."""

    def __init__(self):
        self._elementos = []
        self.caretaker = Caretaker(self)

    @property
    def elementos(self):
        # Consultas não permitem alterar a coleção interna sem registrar a edição.
        return tuple(elemento.clonar() for elemento in self._elementos)

    def adicionar(self, elemento: Elemento):
        self._elementos.append(elemento.clonar())
        self.caretaker.registrar()

    def remover(self, indice: int):
        elemento = self._elementos.pop(indice)
        self.caretaker.registrar()
        return elemento

    def criar_memento(self):
        return MapaMemento(self._elementos)

    def restaurar(self, memento):
        # Undo/Redo navegam no histórico; não são novas edições.
        self._elementos = memento.restaurar_elementos()

    def exibir(self):
        print("\nMapa:")
        for indice, elemento in enumerate(self._elementos):
            print(f"  [{indice}] {elemento.descrever()}")
        if not self._elementos:
            print("  (vazio)")
