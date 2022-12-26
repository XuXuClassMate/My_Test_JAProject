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
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
<<<<<<< HEAD
=======

>>>>>>> origin/master
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import static io.restassured.RestAssured.given;

public class Restful {
    HashMap<String, Object> query= new HashMap<String, Object>();
    public static RequestSpecification baseRequest = given();

    public Response send(){
        baseRequest=given().log().all();
        query.entrySet().forEach( entry->{
            baseRequest.queryParam(entry.getKey(),entry.getValue());
        });
        return baseRequest.when().request("get","baidu.com");
    }

    public static String template(String pathfile, HashMap<String, Object> map) throws IOException {
        Path path = Paths.get(pathfile);
        String jsonString = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        DocumentContext document = JsonPath.parse(jsonString);
        map.entrySet().forEach(entry->{
            document.set(entry.getKey(),entry.getValue());
        });
        return document.jsonString();
    }


}