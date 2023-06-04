package com.design_pattern.application.core.domain.pagamento;

import com.design_pattern.application.core.domain.gateway.Gateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoDinheiroTest {

    private BigDecimal valor;
    private Gateway gateway;

    @BeforeEach
    void setup() {
        valor = new BigDecimal("1000");
        gateway = new Gateway();
    }

    @Test
    void calcularDesconto() {
        var pagamento = new PagamentoDinheiro(valor, gateway);
        pagamento.realizarCobranca();
        assertEquals(new BigDecimal("100.0"),
                pagamento.calcularDesconto());
    }
}