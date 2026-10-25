package org.example.Aula23102026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraSimplesTest {
    private CalculadoraSimples calculadora;

    @BeforeEach
    void criarObjeto() {
        calculadora = new CalculadoraSimples();
    }

    @Test
    void doisMaisDoisDeveSerQuatro() {
        assertEquals(4, calculadora.soma(2, 2));

    }

    @Test
    void tresMaisQuatroDeveSerSete() {
        assertEquals(7, calculadora.soma(3, 4));
    }

    @Test
    void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(10, 0));
    }
}
