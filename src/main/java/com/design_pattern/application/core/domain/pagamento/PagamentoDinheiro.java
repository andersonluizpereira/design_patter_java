package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;

import java.math.BigDecimal;

public class PagamentoDinheiro extends Pagamento {

    public static final String valorDaTaxa = "0.1";

    public PagamentoDinheiro(BigDecimal valor, Gateway gateway) {
        super(valor, gateway);
    }

    //Calcula o desconto.
    /**
     * @return
     */
    @Override
    public BigDecimal calcularDesconto() {
        //Retorna o valor do pagamento com desconto de 10%.
        return this.valor.multiply(new BigDecimal(valorDaTaxa));
    }
}
