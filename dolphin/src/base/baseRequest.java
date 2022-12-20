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
/**
 * @ClassName:Contact
 * @Auther: YooAo
 * @Description:
 * @Date: 2022/11/27 11:25
 * @Version: v1.0
 */

package base;

import static io.restassured.RestAssured.given;

public class baseRequest extends Restful{
    public baseRequest() {
        api_init();
   }
    public void api_init(){
         baseRequest = given()
                .log().all()
                .header("sessionId", dolphin.session())
                .header("Accept","application/json, text/plain, */*")
                .header("language","zh_CN")
                .header("Content-Type","application/x-www-form-urlencoded")
                //.contentType(ContentType.JSON)
         ;
    }
}