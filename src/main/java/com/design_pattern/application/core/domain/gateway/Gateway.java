package com.design_pattern.application.core.domain.gateway;

import java.math.BigDecimal;

public class Gateway {
    public boolean cobrar(BigDecimal valor) {
        System.out.println("Cobrando " + valor);
            return isaBoolean();
    }

    private static boolean isaBoolean() {
        return Math.random() < 0.5;
    }
}
