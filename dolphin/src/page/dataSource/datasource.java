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
import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;


public class datasource extends dolphin {
    public Response create(HashMap<String,Object> map) throws IOException {
        String body = template("dolphin/resource/data/database.json",map);
        Response response = baseRequest.body(body)
                .when().post(baseUrl+"/datasources")
                //this api http statuscode true is 201 ,error is 200
                .then().statusCode(200).extract().response();
        api_init();
        return response;
    }
    public Response connect(HashMap<String, Object> map) throws IOException {
        String body = template("dolphin/resource/data/database.json",map);
        Response response = baseRequest.body(body)
                .when().post(baseUrl+"/datasources/connect")
                .then().statusCode(200).extract().response();
        api_init();
        return response;
    }
    public Response update(int datasourceid,HashMap<String, Object> map) throws IOException {
        String body = template("/data/database.json",map);
        Response response = baseRequest.body(body)
                .when().put(baseUrl+"/datasources/"+ datasourceid)
                .then().statusCode(200).extract().response();
        api_init();

        return response;

    }
}
