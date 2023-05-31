package com.design_pattern.application.core.domain.pedido;

import com.design_pattern.application.core.domain.frete.FreteExpresso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoMoveisTest {
    private static final double TAXA_DE_FRETE_EXPRESSO = 10.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO = 100.0;
    private static final double TAXA_DE_FRETE_COMUM_EXPRESSO = 0.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_EXPRESSO = 0.0;
    private static final String PEDIDO_MOVEIS = "PedidoMoveis";
    private static final String PEDIDO_ELETRONICOS = "PedidoEletronicos";
    private PedidoMoveis pedido;
    private FreteExpresso freteExpresso;

    @BeforeEach
    void setUp() {
        pedido = new PedidoMoveis();
        freteExpresso = new FreteExpresso();
    }
    @Test
    void getNomeSetor() {
        assertEquals(PEDIDO_MOVEIS, pedido.getNomeSetor());
    }
    @Test
    void getNomeSetorDiferente() {
        assertNotEquals(PEDIDO_ELETRONICOS, pedido.getNomeSetor());
    }
    @Test
    void calcularFreteExpresso() {
        pedido.setValorPedido(VALOR_PEDIDO_CALCULAR_COM_FRETE_EXPRESSO);
        pedido.setFrete(freteExpresso);
        assertEquals(TAXA_DE_FRETE_EXPRESSO, pedido.calcularFrete());
    }
    @Test
    void calcularFreteExpressoComValorPedidoZero() {
        pedido.setValorPedido(VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_EXPRESSO);
        pedido.setFrete(freteExpresso);
        assertEquals(TAXA_DE_FRETE_COMUM_EXPRESSO, pedido.calcularFrete());
    }
}