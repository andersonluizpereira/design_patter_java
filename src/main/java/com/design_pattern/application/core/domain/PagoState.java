package com.design_pattern.application.core.domain;

public class PagoState implements State {

    public PagoState(Pedido pedido) {
        this.pedido = pedido;
    }s
    private final Pedido pedido;

    /**
     *
     */
    @Override
    public void sucessoAoPagar() {
        throw new RuntimeException("Operação não suportada, o pedido já foi pago");
    }

    /**
     *
     */
    @Override
    public void despacharPedido() {
        this.pedido.setEstadoAtual(this.pedido.getEnviado());
    }

    /**
     *
     */
    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }
}
