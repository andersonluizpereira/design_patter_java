package com.design_pattern.application.core.domain.gateway;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GatewayTest {

    @Test
    void cobrar() {
        //verify instance in test
        assertNotNull(new Gateway());
    }
}