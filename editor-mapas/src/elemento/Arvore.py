from elemento.Elemento import Elemento


class Arvore(Elemento):
    def __init__(self, nome, x, y, aparencia, altura):
        super().__init__(nome, x, y, aparencia)
        self.altura = altura

    def descrever(self):
        return f"{self.nome} em ({self.x}, {self.y}), altura: {self.altura} m"
