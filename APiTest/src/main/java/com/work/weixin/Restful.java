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

package com.work.weixin;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Restful {
    HashMap<String, Object> query = new HashMap<String, Object>();
    protected RequestSpecification requestSpecification = given();

    public Response send() {
        requestSpecification = given().log().all();
        query.entrySet().forEach(entry -> {
            requestSpecification.queryParam((entry.getKey()), entry.getValue());
        });
        return requestSpecification.when().request("get", "baidu.com");
    }

    public void reset() {
        requestSpecification = given().log().all();
    }
    public static String template(String path,HashMap<String ,Object>map){
        DocumentContext documentContext = JsonPath.parse(Restful.class
                .getResourceAsStream(path));
        map.entrySet().forEach(entry->{documentContext.set(entry.getKey(),entry.getValue());

        });
        return documentContext.jsonString();
    };
}
