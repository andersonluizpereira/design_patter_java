package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;

import java.math.BigDecimal;

public class PagamentoCredito extends Pagamento {

    public static final String valorCalculoDaTaxa = "0.05";
    public static final String valorDescontoComZero = "0.00";
    public static final String valorParaCobrancaEComparacao = "300";
    public static final String valorDeMultiplicacaoDaTaxa = "0.02";
    public static final int valorComparativoParaValidarExpressao = 0;

    public PagamentoCredito(BigDecimal valor, Gateway gateway) {
        super(valor, gateway);
    }
    public BigDecimal calcularTaxa() {
        return this.valor.multiply(new BigDecimal(valorCalculoDaTaxa));
    }
    //Calcula o desconto.
    /**
     * @return
     */
    @Override
    public BigDecimal calcularDesconto() {
        if(eComparacaoDeValores())
            return this.valor.multiply(new BigDecimal(valorDeMultiplicacaoDaTaxa));
        return new BigDecimal(valorDescontoComZero);
    }

    private boolean eComparacaoDeValores() {
        return this.valor.compareTo(new BigDecimal(valorParaCobrancaEComparacao)) > valorComparativoParaValidarExpressao;
    }
}
