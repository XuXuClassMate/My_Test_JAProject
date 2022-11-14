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

package page.project;

import base.dolphin;
import base.dolphinConfig;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class project {
    public Response search(Integer pageSize, Integer pageNo, String searchName){
        if (pageSize ==null || pageSize >10){
            pageSize =10;
        }
        if (pageNo ==null || pageNo >1) {
            pageNo =1;
        }
        return given().param("pageSize",pageSize)
                .param("pageNo",pageNo)
                .param("searchVal",searchName)
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN")
                .when().get(dolphinConfig.getInstance().baseUrl+"/projects")
                .then().log().all().statusCode(200).extract().response();
    }
    public Response search(String searchName){
        return given().param("pageSize",10)
                .param("pageNo",1)
                .param("searchVal",searchName)
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN")
                .when().get(dolphinConfig.getInstance().baseUrl+"/projects")
                .then().log().all().statusCode(200).extract().response();
    }
}
