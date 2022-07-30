package com.work.weixin.contaact;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

class DepartmentTest {
    Department department;

    @BeforeEach
    void setUp() {
        if (department == null) {
            department = new Department();
        }
    }

    @Test
    void list() {

        department.list("").then().statusCode(200).body("department.name[0]", equalTo("字节跳不动"));
        department.list("1").then().statusCode(200).body("department.parentid[0]", equalTo(0));
    }

    @Test
    void create() {
        department.create();
    }
}