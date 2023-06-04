package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoCreditoTest {

    private BigDecimal valor;
    private Gateway gateway;

    @BeforeEach
    void setup() {
        valor = new BigDecimal("1000");
        gateway = new Gateway();
    }

    @Test
    void calcularTaxa() {
        var pagamento = new PagamentoCredito(valor, gateway);
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("50.00"),
                pagamento.calcularTaxa());
    }

    @Test
    void calcularDesconto() {
        var pagamento = new PagamentoCredito(valor, gateway);
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("20.00"),
                pagamento.calcularDesconto());
    }

    @Test
    void calcularDescontoZero() {
        var pagamento = new PagamentoCredito(new BigDecimal("-500"), gateway);
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("0.00"),
                pagamento.calcularDesconto());
    }
}