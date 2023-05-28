package com.design_pattern.application.core.domain.pedido;

public class PedidoMoveis extends Pedido{
    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = this.getClass().getSimpleName();
    }

    public String getNomeSetor() {
        return nomeSetor;
    }
}
