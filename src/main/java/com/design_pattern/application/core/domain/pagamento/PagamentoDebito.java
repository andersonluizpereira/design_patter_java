package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;

import java.math.BigDecimal;

public class PagamentoDebito extends Pagamento{
    public static final String valorCalculoDoDesconto = "0.05";
    public static final String valorCalculoDaTaxa = "4.00";
    public PagamentoDebito(BigDecimal valor, Gateway gateway) {
        super(valor, gateway);
    }

    public BigDecimal calcularTaxa() {
        return new BigDecimal(valorCalculoDaTaxa);
    }

    /**
     * @return
     */
    @Override
    public BigDecimal calcularDesconto() {
        return this.valor.multiply(new BigDecimal(valorCalculoDoDesconto));
    }
}
