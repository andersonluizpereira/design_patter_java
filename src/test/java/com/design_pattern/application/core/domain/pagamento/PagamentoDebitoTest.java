package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoDebitoTest {
    private BigDecimal valor;
    private Gateway gateway;

    @BeforeEach
    void setup() {
        valor = new BigDecimal("1000");
        gateway = new Gateway();
    }

    @Test
    void calcularTaxa() {
        var pagamento = new PagamentoDebito(valor, gateway);
        var taxa = pagamento.calcularTaxa();
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("4.00"), taxa);
    }

    @Test
    void calcularDesconto() {
        var pagamento = new PagamentoDebito(valor, gateway);
        pagamento.realizarCobranca();
        var desconto = pagamento.calcularDesconto();
        assertEquals(new BigDecimal("50.00"), desconto);
    }

    @Test
    void calcularDescontoZero() {
        var pagamento = new PagamentoDebito(new BigDecimal("-500"), gateway);
        pagamento.realizarCobranca();
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("-25.00"),
                pagamento.calcularDesconto());
    }
}