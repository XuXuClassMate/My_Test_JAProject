package org.xuxuclassmate.page.security;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class workerGroupTest {
    static workerGroup workerGroup;
    static String addrList;
    static Integer workerid;
    static String workergroupName = "apitestworker";

    @BeforeEach
    void setUp() {
        if (workerGroup == null) {
            workerGroup = new workerGroup();
        }
        if (addrList == null) {
            workerGroup.get_addrList();
        }
    }

    @AfterEach
    void tearDown() {
        workerGroup.delete(workerid);
    }

    @Test
    @Order(0)
    @Disabled
    void get_addrList() {
        workerGroup.get_addrList();
    }

    @Test
    @Order(1)
    void create() {
        workerGroup.create(workergroupName, addrList);
    }

    @Test
    @Order(2)
    void search() {
        workerid = workerGroup.search(workergroupName);
    }

    @Test
    @Order(3)
    void update() {
        workerGroup.update(workerid, workergroupName, addrList);
    }

    @Test
    @Order(100)
    @Disabled
    void delete() {
        workerGroup.delete(workerid);
    }
}