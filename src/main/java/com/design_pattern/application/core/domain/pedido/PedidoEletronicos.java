package com.design_pattern.application.core.domain.pedido;

public class PedidoEletronicos extends Pedido {
    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = this.getClass().getSimpleName();
    }
    public String getNomeSetor() {
        return nomeSetor;
    }
}
