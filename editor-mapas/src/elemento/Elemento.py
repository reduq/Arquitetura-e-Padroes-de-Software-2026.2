from abc import ABC, abstractmethod
from copy import deepcopy

from flyweight.Aparencia import Aparencia


class Elemento(ABC):
    def __init__(self, nome: str, x: int, y: int, aparencia: Aparencia):
        self.nome = nome
        self.x = x
        self.y = y
        self.aparencia = aparencia

    def clonar(self):
        """Prototype: copia inclusive atributos mutáveis das subclasses."""
        return deepcopy(self)

    @abstractmethod
    def descrever(self) -> str:
        pass
