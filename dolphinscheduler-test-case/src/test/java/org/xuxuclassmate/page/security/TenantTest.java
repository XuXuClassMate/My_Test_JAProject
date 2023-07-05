package org.xuxuclassmate.page.security;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class tenantTest {
    static tenant tenant;

    @BeforeEach
    void setUp() {
        if (tenant == null) {
            tenant = new tenant();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create() {
        System.out.println("tenantCode" + tenant.create("Dolphin_ApiTest", null));
    }
}