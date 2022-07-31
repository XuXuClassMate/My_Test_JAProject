/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package com.work.weixin.contact;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
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
    @Order(1)
    @Test
    void list() {
        department.list("").then().statusCode(200).
                body("errcode",equalTo(0)).
                body("department.name[0]", equalTo("字节跳不动"));
        department.list("1").then().statusCode(200)
                .body("errcode",equalTo(0))
                .body("department.parentid[1]",equalTo(1));
    }
    @Order(2)
    @Test
    void create() {
        //department.create("接口测试","ApiTest",2).then().body("errcode",equalTo(60009));
    }
    @Order(4)
    @Test
    void delete() {
        //department.create("接口测试1","ApiTest1",4);
        int id = department.list("").path("department.find{it.name=='接口测试1'}.id");
        department.delete(id).
                then().body("errcode",equalTo(0));
    }
    @Order(3)
    @Test
    void update() {
        //department.create("接口测试1","ApiTest1",4);
        int id = department.list("").path("department.find{it.name=='接口测试1'}.id");
        department.update("接口测试4","ApiTest4",id).
                then().body("errcode",equalTo(60009));
    }
}