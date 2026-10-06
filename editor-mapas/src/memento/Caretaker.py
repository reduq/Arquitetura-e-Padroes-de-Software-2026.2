class Caretaker:
    """Guarda os mementos sem conhecer o conteúdo dos elementos."""

    def __init__(self, mapa):
        self._mapa = mapa
        self._historico = [mapa.criar_memento()]
        self._indice = 0

    def registrar(self):
        memento = self._mapa.criar_memento()
        # Uma nova edição após Undo descarta a linha de Redo anterior.
        del self._historico[self._indice + 1:]
        self._historico.append(memento)
        self._indice += 1

    def undo(self):
        if self._indice == 0:
            return False
        self._indice -= 1
        self._mapa.restaurar(self._historico[self._indice])
        return True

    def redo(self):
        if self._indice == len(self._historico) - 1:
            return False
        self._indice += 1
        self._mapa.restaurar(self._historico[self._indice])
        return True
