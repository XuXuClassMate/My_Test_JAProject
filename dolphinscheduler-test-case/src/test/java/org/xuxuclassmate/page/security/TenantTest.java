package org.xuxuclassmate.page.security;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.*;


@Epic("tenantTest")
class tenantTest {
    static tenant tenant;
    static Integer tenantid;

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
    @Order(1)
    @DisplayName("Test Case ：create tenant")
    void create() {
        tenantid = tenant.create("Dolphin_ApiTest", null);
    }

    @Test
    @Order(2)
    @DisplayName("Test Case ：update tenant")
    void update() {
        tenant.update("Dolphin_ApiTest_update", null, tenantid);
    }

    @Test
    @Order(3)
    @DisplayName("Test Case ：search tenant")
    void search() {
        tenant.search("Dolphin_ApiTest");
    }

    @Test
    @Order(4)
    @DisplayName("Test Case ：delete tenant")
    void delete() {
        tenant.delete(tenantid);
    }

}