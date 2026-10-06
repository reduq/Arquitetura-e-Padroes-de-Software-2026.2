from elemento.Elemento import Elemento


class Bau(Elemento):
    def __init__(self, nome, x, y, aparencia, itens):
        super().__init__(nome, x, y, aparencia)
        self.itens = list(itens)

    def descrever(self):
        return f"{self.nome} em ({self.x}, {self.y}), itens: {self.itens}"
