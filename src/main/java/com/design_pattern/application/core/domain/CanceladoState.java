package com.design_pattern.application.core.domain;

public class CanceladoState implements State {

    public CanceladoState(Pedido pedido) {
        this.pedido = pedido;
    }
    private final Pedido pedido;

    /**
     *
     */
    @Override
    public void sucessoAoPagar() {
        throw new RuntimeException("Operação não suportada, o pedido se encontra cancelado");
    }

    /**
     *
     */
    @Override
    public void despacharPedido() {
        throw new RuntimeException("Operação não suportada, o pedido se encontra cancelado");
    }

    /**
     *
     */
    @Override
    public void cancelarPedido() {
        throw new RuntimeException("Operação não suportada, o pedido se encontra cancelado");
    }
}
