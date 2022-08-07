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

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;


public class Wuwork {
    private static String token;
    private static RequestSpecification requestSpecification;
    private static ResponseSpecification responseSpecification;

    public static String getWuworkToken(String secret) {
        String token =  RestAssured.given().log().all()
                .queryParam("corpid", WeworkConfig.getInstance().corpid)
                .queryParam("corpsecret", secret)
                .when().get("https://qyapi.weixin.qq.com/cgi-bin/gettoken")
                .then().log().all().statusCode(200)
                .extract().path("access_token");
        System.out.println(token);
        return token;
    }

    //    public static String getWuworkTokenForContact(){
//        return token;
//    }
    public static String getToken() {
        //todo 支持两种形式的token
        if (token == null) {
            token = getWuworkToken(WeworkConfig.getInstance().corpsecret);

        }
        return token;
    }
    public static void Login(){
        requestSpecification = new RequestSpecBuilder().build();
        requestSpecification.port(80);
        requestSpecification.cookie("session_id","demo1");
        requestSpecification.header("User-Agent","Demo2");

        responseSpecification = new ResponseSpecBuilder().build();
        responseSpecification.statusCode(200);
        responseSpecification.body("code",equalTo(0));

    }
}
