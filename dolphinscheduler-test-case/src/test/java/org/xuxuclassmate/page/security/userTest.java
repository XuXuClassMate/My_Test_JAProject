package org.xuxuclassmate.page.security;

import org.junit.jupiter.api.*;

class userTest {
    static user user;
    static tenant tenant;
    static Integer tenantid;
    static Integer userid;

    @BeforeEach
    void setUp() {
        if (user == null) {
            user = new user();
        }
        if (tenant == null) {
            tenant = new tenant();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(0)
    void create() {
        tenantid = tenant.create("usertest", null);
        userid = user.create("xuxu", "xuxu123", tenantid, "xuxu@gamil.com", null);
        System.out.println("userid:" + userid);

    }

    @Test
    @Order(1)
    void update() {
        user.update(userid, "xuxu", tenantid, "xuxu@gamil.com", null);
    }

    @Test
    @Order(2)
    void search() {
        user.search("xuxu");
    }


    @Test
    @Order(100)
    void delete() {
        user.delete(userid);
        tenant.delete(tenantid);
    }


}