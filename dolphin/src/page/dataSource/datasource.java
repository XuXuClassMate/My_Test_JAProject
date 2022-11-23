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

package page.dataSource;

import base.dolphin;
import base.dolphinConfig;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import javax.naming.Name;


public class datasource {
    public Response create(String projectName, String description){
        return null;
    }
    public Response connect(String Name){
        String body = JsonPath.parse(this.getClass().getResourceAsStream("/data/database.json"))
                .set("$.name",Name).jsonString();
        return RestAssured.given()
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN").body(body)
                .when().post(dolphinConfig.getInstance().baseUrl+"/datasources/connect")
                .then().log().all().statusCode(200).extract().response();
    }
    public Response update(String Name, String description){
        String JsonData = JsonPath.parse(this.getClass().getResourceAsStream("/data/database.json"))
                .set("$.name", Name).set("$.note","test").jsonString();
        return RestAssured.given()
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN").body(JsonData)
                .when().post(dolphinConfig.getInstance().baseUrl+"/datasources/connect")
                .then().log().all().statusCode(200).extract().response();
    }
}
