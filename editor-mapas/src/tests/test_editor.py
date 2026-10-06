import unittest

from elemento.Bau import Bau
from flyweight.FabricaAparencia import FabricaAparencia
from mapa.Mapa import Mapa


class TestEditor(unittest.TestCase):
    def setUp(self):
        self.fabrica = FabricaAparencia()
        self.aparencia = self.fabrica.obter("baú", b"textura")
        self.bau = Bau("Tesouro", 1, 2, self.aparencia, [["ouro"]])
        self.mapa = Mapa()

    def test_prototype_copia_profunda_e_flyweight(self):
        copia = self.bau.clonar()
        copia.itens[0].append("rubi")
        self.assertIsNot(copia, self.bau)
        self.assertEqual(self.bau.itens, [["ouro"]])
        self.assertIs(copia.aparencia, self.aparencia)
        self.assertIs(self.aparencia, self.fabrica.obter("baú", b"textura"))
        self.assertIsNot(self.aparencia, self.fabrica.obter("baú", b"outra"))

    def test_snapshot_isolado_em_restauracoes_repetidas(self):
        self.mapa.adicionar(self.bau)
        memento = self.mapa.criar_memento()
        self.bau.itens[0].append("rubi")
        primeira = memento.restaurar_elementos()
        primeira[0].itens[0].append("prata")
        segunda = memento.restaurar_elementos()
        self.assertIsNot(primeira[0], segunda[0])
        self.assertEqual(segunda[0].itens, [["ouro"]])
        self.assertIs(segunda[0].aparencia, self.aparencia)
        consulta = self.mapa.elementos
        consulta[0].itens.clear()
        self.assertEqual(self.mapa.elementos[0].itens, [["ouro"]])

    def test_adicionar_remover_undo_redo_e_limites(self):
        historico = self.mapa.caretaker
        self.assertFalse(historico.undo())
        self.assertFalse(historico.redo())
        self.mapa.adicionar(self.bau)
        self.mapa.remover(0)
        for _ in range(2):
            self.assertTrue(historico.undo())
            self.assertEqual(self.mapa.elementos[0].itens, [["ouro"]])
            self.assertTrue(historico.undo())
            self.assertEqual(self.mapa.elementos, ())
            self.assertFalse(historico.undo())
            self.assertTrue(historico.redo())
            self.assertEqual(len(self.mapa.elementos), 1)
            self.assertTrue(historico.redo())
            self.assertEqual(self.mapa.elementos, ())
            self.assertFalse(historico.redo())

    def test_nova_edicao_descarta_redo(self):
        self.mapa.adicionar(self.bau)
        self.mapa.remover(0)
        self.mapa.caretaker.undo()
        self.mapa.adicionar(self.bau)
        self.assertFalse(self.mapa.caretaker.redo())
        self.assertEqual(len(self.mapa.elementos), 2)

    def test_remocao_invalida_nao_registra_estado(self):
        with self.assertRaises(IndexError):
            self.mapa.remover(0)
        self.assertFalse(self.mapa.caretaker.undo())


if __name__ == "__main__":
    unittest.main()
