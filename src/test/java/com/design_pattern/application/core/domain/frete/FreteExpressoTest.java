package com.design_pattern.application.core.domain.frete;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteExpressoTest {

    private static final double TAXA_DE_FRETE_EXPRESSO = 10.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO = 100.0;
    public static final double TAXA_DE_FRETE_EXPRESSO_ZERO = 0.0;
    public static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO_ZERO = 0.0;
    private FreteExpresso freteExpresso;

    @BeforeEach
    void setUp() {
        freteExpresso = new FreteExpresso();
    }

    @Test
    void calcularFreteExpresso() {
        assertEquals(TAXA_DE_FRETE_EXPRESSO,
                freteExpresso.calcula(VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO));
    }
    @Test
    void calcularFreteExpressoComValorPedidoZero() {
        assertEquals(TAXA_DE_FRETE_EXPRESSO_ZERO,
                freteExpresso.calcula(VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO_ZERO));
    }

    @Test
    void calcularFreteExpressoComValorPedidoNegativo() {
        assertEquals(-TAXA_DE_FRETE_EXPRESSO,
                freteExpresso.calcula(-VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO));
    }

    @Test
    void calcularFreteExpressoComValorPedidoVazio() {
        assertNotEquals(null,
                freteExpresso.calcula(-VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO));
    }

}