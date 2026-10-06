from dataclasses import dataclass


@dataclass(frozen=True)
class Aparencia:
    """Flyweight: dados intrínsecos imutáveis compartilhados pelas ocorrências."""

    tipo: str
    textura: bytes

    def __deepcopy__(self, memo):
        # Copiar elementos não deve duplicar a textura pesada e imutável.
        return self
