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

package base;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.equalTo;

public class dolphin {
    private static String session;
    public static String logIn(){
         session = RestAssured.given().log().all().
                queryParam("userName",dolphinConfig.getInstance().userName)
                .queryParam("userPassword",dolphinConfig.getInstance().passWord)
                .post(dolphinConfig.getInstance().baseUrl+"/login")
                .then().log().all().statusCode(200)
                .body("code",  equalTo(0)).extract().path("data.sessionId");

        return session;

    }
    public String logIn(String baseUrl,String userName,String passWord){
        session = RestAssured.given().log().all().
                queryParam("userName",userName)
                .queryParam("userPassword",passWord)
                .post(baseUrl+"/login")
                .then().log().all().statusCode(200)
                .body("code",  equalTo(0)).extract().path("data.sessionId");

        return session;

    }
    public static String session(){
        if (session == null){
            session = logIn();
        }
        return session;
    }

}
