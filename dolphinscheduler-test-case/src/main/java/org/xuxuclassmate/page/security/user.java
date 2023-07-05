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

package org.xuxuclassmate.page.security;

import io.restassured.response.Response;
import org.xuxuclassmate.base.dolphin;

public class user extends dolphin {
    public static Integer create(String userName, String userPassword,Integer tenantId,String email,String queue,String phone) {
        /**
         * Phone : Not required
         * state : 0 close , 1 open
         */
        Response response = baseRequest
                .param("userName", userName)
                .param("userPassword", userPassword)
                .param("tenantId", tenantId)
                .param("email", email)
                .param("queue", queue)
                .param("phone", phone)
                .param("state", 1)
                .when().post(baseUrl + "/users/create");
        api_assert(response);
        api_init();
        return (Integer) api_path(response, "data.id");
    }

//    public static Integer create(String userName, String userPassword,Integer tenantId,String email,String queue,String phone,String state) {
//        /**
//         * Phone : Not required
//         * state : 0 close , 1 open
//         */
//        Response response = baseRequest
//                .param("userName", userName)
//                .param("userPassword", userPassword)
//                .param("tenantId", tenantId)
//                .param("email", email)
//                .param("queue", queue)
//                .param("phone", phone)
//                .param("state", state)
//                .when().post(baseUrl + "/users/create");
//        api_assert(response);
//        api_init();
//        return (Integer) api_path(response, "data.id");
//    }

}
