package com.design_pattern.application.core.domain;

public class EnviadoState implements State {

    public EnviadoState(Pedido pedido) {
        this.pedido = pedido;
    }
    private final Pedido pedido;

    /**
     *
     */
    @Override
    public void sucessoAoPagar() {
        throw new RuntimeException("Operação não suportada, o pedido já foi pago e enviado");
    }

    /**
     *
     */
    @Override
    public void despacharPedido() {
        throw new RuntimeException("Operação não suportada, o pedido já enviado");
    }

    /**
     *
     */
    @Override
    public void cancelarPedido() {
        throw new RuntimeException("Operação não suportada, o pedido já enviado");
    }
}
