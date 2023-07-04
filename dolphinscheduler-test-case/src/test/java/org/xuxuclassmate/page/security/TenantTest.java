package org.xuxuclassmate.page.security;

import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class tenantTest {
    static  tenant tenant;
    @BeforeEach
    void setUp() {
        if (tenant == null){
            tenant=new tenant();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create() throws IOException {
        System.out.println("tenantCode"+tenant.create("Dolphin_ApiTest", null));


    }
}