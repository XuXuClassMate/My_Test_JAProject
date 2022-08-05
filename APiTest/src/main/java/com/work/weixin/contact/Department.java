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

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;


public class Department extends Contact {
    public Response list(String id) {
        reset();
        Response response = requestSpecification
                .param("id", id)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/department/list")
                .then().extract().response();
        reset();
        return response;
    }


    public Response CreateByMap(HashMap<String, Object> map) {
        reset();
        DocumentContext documentContext = JsonPath.parse(this.getClass().getResourceAsStream("/data/create.json"));
        map.entrySet().forEach(entry -> {
            documentContext.set(entry.getKey(), entry.getValue());
        });
        return requestSpecification
                .body(documentContext.jsonString())
                .when().post("https://qyapi.weixin.qq.com/cgi-bin/department/create")
                .then().extract().response();

    }

    public Response create(String name, String name_en, int id) {
        reset();
        String createbody = JsonPath.parse(this.getClass().getResourceAsStream("/data/create.json"))
                .set("$.name", name)
                .set("$.name_en", name_en)
                .set("$.id", id).jsonString();
        return requestSpecification
                .body(createbody)
                .when().post("https://qyapi.weixin.qq.com/cgi-bin/department/create")
                .then().extract().response();
    }

    public Response delete(int id) {
        reset();
        return requestSpecification
                .queryParam("id", id).when()
                .get("https://qyapi.weixin.qq.com/cgi-bin/department/delete")
                .then().extract().response();
    }

    public Response update(String name, String name_en, int id) {
        reset();
        String createbody = JsonPath.parse(this.getClass().getResourceAsStream("/data/update.json"))
                .set("$.name", name)
                .set("$.name_en", name_en)
                .set("$.id", id).jsonString();

        return requestSpecification
                .body(createbody)
                .when().post("https://qyapi.weixin.qq.com/cgi-bin/department/update")
                .then().extract().response();
    }

    public Response deleteAll() {
        reset();
        List<Integer> idlist = list("").then().log().all().extract().path("department.id");

        System.out.println(idlist);
        idlist.forEach(id->delete(id));
        return null;
    }

}
