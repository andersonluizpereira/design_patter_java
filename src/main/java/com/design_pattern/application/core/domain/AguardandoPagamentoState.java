package com.design_pattern.application.core.domain;

public class AguardandoPagamentoState implements State{

    public AguardandoPagamentoState(Pedido pedido) {
        this.pedido = pedido;
    }

    private final Pedido pedido;

    /**
     *
     */
    @Override
    public void sucessoAoPagar() {
        this.pedido.setEstadoAtual(this.pedido.getPago());
    }

    /**
     *
     */
    @Override
    public void despacharPedido() {
        throw new RuntimeException("Operação não suportada, o pedido ainda não foi pago");
    }

    /**
     *
     */
    @Override
    public void cancelarPedido() {
        this.pedido.setEstadoAtual(this.pedido.getCancelado());
    }
}
