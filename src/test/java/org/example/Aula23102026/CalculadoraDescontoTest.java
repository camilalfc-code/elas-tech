package org.example.Aula23102026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescontoTest {
    private CalculadoraDesconto calculadora;

    @BeforeEach
    void criarObjeto() {
        calculadora = new CalculadoraDesconto();
    }

    @Test
    void clienteComumComprandoMenosDe100NaoGanhaDesconto() {
        assertEquals(50.0, calculadora.aplicarDesconto(50.0, false), 0.001);
    }

    @Test
    void clienteVipGanha10PorCentoDeDesconto() {
        assertEquals(180.0, calculadora.aplicarDesconto(200.0, true), 0.001);
    }

    @Test
    void valorNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.aplicarDesconto(-10.0, false));
    }
}