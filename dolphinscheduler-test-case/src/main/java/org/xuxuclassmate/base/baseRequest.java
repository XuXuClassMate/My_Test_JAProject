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

package org.xuxuclassmate.base;

import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hamcrest.Matchers;


import static io.restassured.RestAssured.given;

public class baseRequest extends Restful{
    private static final Logger logger = LogManager.getLogger(baseRequest.class);


    public baseRequest() {
        api_init();
   }
    public static void api_init(){
         baseRequest = given()
                .log().all()
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN")
                .header("Content-Type","application/x-www-form-urlencoded")
                //.contentType(ContentType.JSON)
         ;
    }

    public static void api_assert(Response response, Integer StatusCode){
        if (response.getStatusCode() == StatusCode) {
            try {
                response.then().assertThat().body("code", Matchers.equalTo(0));
                response.then().assertThat().body("success", Matchers.equalTo(true));
                System.out.println("Validation passed. Code is 0 and success is true.");
                logger.info("Validation passed. Code is 0 and success is true.");
            } catch (AssertionError e) {
                logger.error("Validation failed. Error: " + e.getMessage());
            }
        }else {
            logger.error("StatusCode is not "+ StatusCode +".");
        }
    }
    public static Object api_path(Response response, String path){
        return response.then().extract().path(path);
    }
}
