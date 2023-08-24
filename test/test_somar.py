import unittest
from somar import soma

class TestSoma(unittest.TestCase):

    def test_impares(self):
        resultado = soma(3,1)
        self.assertEqual(resultado,45)
