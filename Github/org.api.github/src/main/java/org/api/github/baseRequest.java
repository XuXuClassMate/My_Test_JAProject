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

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class baseRequest {
  public static RequestSpecification baseRequest = given();
  public static String Accept =null;
  public static String Token =null;
  public static String ApiVersion =null;
  public static String baseurl =null;

  public baseRequest() {
   api_init();
  }
  public void api_init(){
    Accept = githubconfig.getInstance().Accept;
    Token = githubconfig.getInstance().Token;
    ApiVersion =  githubconfig.getInstance().ApiVersion;
    baseurl = githubconfig.getInstance().BaseUrl;

    baseRequest = given()
            .log().all()
            .header("Accept", Accept)
            .header("Authorization", "Bearer " + Token)
            .header("X-GitHub-Api-Version", ApiVersion)
            .contentType(ContentType.JSON)
    ;
  }
}

