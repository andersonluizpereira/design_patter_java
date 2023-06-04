package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;

import java.math.BigDecimal;

abstract class Pagamento {
    protected BigDecimal valor;
    protected Gateway gateway;

    public Pagamento(BigDecimal valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }
    abstract public BigDecimal calcularDesconto();

    public BigDecimal calcularTaxa() {
        return new BigDecimal("0");
    }

    public Boolean realizarCobranca() {
        var valorFinal = this.valor.add(calcularTaxa()).subtract(calcularDesconto());
        System.out.printf("Pagamento{" +
                "valor=" + this.valor +
                ", calcularTaxa=" + this.calcularTaxa() +
                ", calcularDesconto=" + this.calcularDesconto() +
                '}');
        return this.gateway.cobrar(valorFinal);
    }
}
