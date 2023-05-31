package com.design_pattern.application.core.domain.pedido;

import com.design_pattern.application.core.domain.frete.Frete;
import com.design_pattern.application.core.domain.frete.FreteComum;
import com.design_pattern.application.core.domain.frete.FreteExpresso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEletronicosTest {

    private static final double TAXA_DE_FRETE_COMUM = 5.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM = 100.0;
    private static final double TAXA_DE_FRETE_COMUM_ZERO = 0.0;
    private static final double VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_ZERO = 0.0;
    private static final String PEDIDO_ELETRONICOS = "PedidoEletronicos";
    private static final String PEDIDO_MOVEIS = "PedidoMoveis";


    private PedidoEletronicos pedido;
    private FreteComum freteComum;

    @BeforeEach
    void setUp() {
        pedido = new PedidoEletronicos();
        freteComum = new FreteComum();
    }

    @Test
    void getNomeSetor() {
        assertEquals(PEDIDO_ELETRONICOS, pedido.getNomeSetor());
    }
    @Test
    void getNomeSetorDiferente() {
        assertNotEquals(PEDIDO_MOVEIS, pedido.getNomeSetor());
    }

    @Test
    void calcularFreteComun() {
        pedido.setValorPedido(VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM);
        pedido.setFrete(freteComum);
        assertEquals(TAXA_DE_FRETE_COMUM, pedido.calcularFrete());
    }
    @Test
    void calcularFreteComunComValorPedidoZero() {
        pedido.setValorPedido(VALOR_PEDIDO_CALCULAR_COM_FRETE_COMUM_ZERO);
        pedido.setFrete(freteComum);
        assertEquals(TAXA_DE_FRETE_COMUM_ZERO, pedido.calcularFrete());
    }
}