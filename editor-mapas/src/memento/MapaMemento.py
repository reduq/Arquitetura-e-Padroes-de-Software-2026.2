class MapaMemento:
    def __init__(self, elementos):
        # Cada snapshot possui seus próprios elementos e atributos mutáveis.
        self.__elementos = tuple(elemento.clonar() for elemento in elementos)

    def restaurar_elementos(self):
        # Uma restauração também clona para preservar o snapshot nas próximas edições.
        return [elemento.clonar() for elemento in self.__elementos]
