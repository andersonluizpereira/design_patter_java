package com.design_pattern.application.core.domain.pedido;


import com.design_pattern.application.core.domain.frete.Frete;

public abstract class Pedido {
    private double valorPedido;
    private Frete frete;

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public double calcularFrete() {
        return frete.calcula(valorPedido);
    }
}
