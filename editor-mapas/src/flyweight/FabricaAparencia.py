from flyweight.Aparencia import Aparencia


class FabricaAparencia:
    def __init__(self):
        self._aparencias = {}

    def obter(self, tipo: str, textura: bytes) -> Aparencia:
        chave = (tipo, textura)
        if chave not in self._aparencias:
            self._aparencias[chave] = Aparencia(tipo, textura)
        return self._aparencias[chave]
