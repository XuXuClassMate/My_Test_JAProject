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
import com.jayway.jsonpath.JsonPath;
import com.work.weixin.Wuwork;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.given;


public class Department {
    public Response list(String id) {
        return given().log().all()
                .param("access_token", Wuwork.getToken())
                .param("id", id)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/department/list")
                .then().log().all().statusCode(200)
                .extract().response();
    }

    public Response create(String name, String name_en, int id) {
        String createbody = JsonPath.parse(this.getClass().getResourceAsStream("/data/create.json"))
                    .set("$.name", name)
                    .set("$.name_en", name_en)
                    .set("$.id", id).jsonString();

        return given().log().all()
                .queryParam("access_token", Wuwork.getToken())
                .body(createbody)
                .when().post("https://qyapi.weixin.qq.com/cgi-bin/department/create")
                .then().log().all().statusCode(200)
                .extract().response();
    }
}
