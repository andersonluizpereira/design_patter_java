package com.design_pattern.application.core.domain.frete;

public class FreteComum implements Frete{

    public static final double taxaFreteComum = 0.05;

    /**
     * @param valorPedido
     * @return
     */
    @Override
    public double calcula(double valorPedido) {
        return valorPedido * taxaFreteComum;
    }
}
