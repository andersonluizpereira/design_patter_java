package com.design_pattern.application.core.domain.frete;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteComumTest {

    private static final double TAXA_DE_FRETE_COMUM = 5.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM = 100.0;
    private static final double TAXA_DE_FRETE_COMUM_ZERO = 0.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_ZERO = 0.0;

    private FreteComum freteComum;

    @BeforeEach
    void setUp() {
        freteComum = new FreteComum();
    }

    @Test
    void calcularFreteComun() {
        assertEquals(TAXA_DE_FRETE_COMUM,
                freteComum.calcula(VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM));
    }

    @Test
    void calcularFreteComunComValorPedidoZero() {
        assertEquals(TAXA_DE_FRETE_COMUM_ZERO,
                freteComum.calcula(VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_ZERO));
    }

    @Test
    void calcularFreteComunComValorPedidoNegativo() {
        assertEquals(-TAXA_DE_FRETE_COMUM,
                freteComum.calcula(-VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM));
    }

    @Test
    void calcularFreteComunComValorPedidoVazio() {
        assertNotEquals(null,
                freteComum.calcula(-VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM));
    }
}