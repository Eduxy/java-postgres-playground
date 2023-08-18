package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static com.example.MathUtil.mdc;

public class MathUtilTest {
    @Test
    void testeBasico1() {
        int a = 6, b = 3;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeBasico2() {
        int a = 6, b = 2;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeNegativo() {
        int a = -6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testePositivo() {
        int a = 6, b = 0;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void teste5crescente() {
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void teste5decrescente() {
        int a = 2, b = 6;
        int esperado = MathUtil.mdc(b, a);
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeP7() {
        int a = 6, b = 2;
        int esperado = MathUtil.mdc(-a, b);
        int obtido = MathUtil.mdc(a, -b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeP8() {
        int a = 6, b = 2;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeP8Negativo() {
        int a = -6, b = 2;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, a);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeP12Primos() {
        int p = 7, a = p;
        int esperado = p;
        int obtido = MathUtil.mdc(p, a);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeP12Primo() {
        int p = 7, a = 2;
        int esperado = 1;
        int obtido = MathUtil.mdc(p, a);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeCasoGeral() {
        int a = 12, b = 9;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeMdcP4() {
        int m = 2, a = 6, b = 3;
        int esperado = MathUtil.mdc(m*a,m*b);
        int obtido = m * MathUtil.mdc(a, b);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeMdcP9() {
        int a = 6, b = 3, c = 2;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);

        assertTrue(mdc(a,mdc(b,c))== mdc(mdc(a,b),c));
    }

    @Test
    void testeMdc3Valores() {
        int a = 12, b = 6, c = 4;
        int esperado = 2;
        int obtido = mdc(a,b,c);
    
    assertEquals(esperado,obtido);
    }

    @Test
    void testeMdc3NenhumValor() {
        int obtido = mdc();

        assertThrows(ArrayIndexOutOfBoundsException.class, this::mdcSemParametros);
    }

    void mdcSemParametros(){
        mdc();
    }
}
