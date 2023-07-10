package org.xuxuclassmate.page.security;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class environmentTest {
    static environment environment;
    Long environmentCode;
    String environmentName = "Python";
    String environmentconfig = "export PYTHON_HOME=/usr/bin/python";

    @BeforeEach
    void setUp() {
        if (environment == null) {
            environment = new environment();
        }
    }

    @AfterEach
    void tearDown() {
        environment.delete(environmentCode);
    }

    @Test
    @Order(0)
    void create() {
        environmentCode=environment.create(environmentName,environmentconfig,environmentName);
    }

    @Test
    @Order(1)
    void update() {
        environment.update(environmentCode,environmentName,environmentconfig,environmentName);
    }

    @Test
    @Order(2)
    void search() {
        environment.search(environmentName);
    }

    @Test
    @Order(100)
    @Disabled
    void delete() {
        environment.delete(environmentCode);
    }
}