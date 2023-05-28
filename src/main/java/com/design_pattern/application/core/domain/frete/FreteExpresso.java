package com.design_pattern.application.core.domain.frete;

public class FreteExpresso implements Frete{

    public static final double taxaFreteExepresso = 0.1;

    /**
     * @param valorPedido
     * @return
     */
    @Override
    public double calcula(double valorPedido) {
        return valorPedido * taxaFreteExepresso;
    }
}
