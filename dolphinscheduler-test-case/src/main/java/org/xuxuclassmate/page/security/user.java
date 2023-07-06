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
    public Integer create(String userName, String userPassword, Integer tenantId, String email, String phone) {
        /**
         * Phone : Not required
         * state : 0 close , 1 open
         */
        Response response = baseRequest
                .param("userName", userName)
                .param("userPassword", userPassword)
                .param("tenantId", tenantId)
                .param("email", email)
                .param("queue", "default")
                .param("phone", phone)
                .param("state", 1)
                .when().post(baseUrl + "/users/create");
        api_assert(response);
        api_init();
        return (Integer) api_path(response, "data.id");
    }

    public Response update(Integer id, String userName, Integer tenantId, String email, String phone) {
        /**
         * Phone : Not required
         * state : 0 close , 1 open
         * userPassword : default
         */
        Response response = baseRequest
                .param("id", id)
                .param("userName", userName)
                .param("tenantId", tenantId)
                .param("email", email)
                .param("queue", "default")
                .param("phone", phone)
                .param("state", 1)
                .param("userPassword", "")
                .when().post(baseUrl + "/users/update");
        api_assert(response);
        api_init();
        return response;
    }

    public Integer search(String searchVal) {
        Response response = baseRequest
                .param("pageNo", 1)
                .param("pageSize", 10)
                .param("searchVal", searchVal)
                .when().get(baseUrl + "/users/list-paging");
        api_assert(response);
        api_init();
        return (Integer) api_path(response, "data.totalList[0].id");
    }

    public Response delete(Integer id) {
        Response response = baseRequest
                .param("id", id)
                .when().post(baseUrl + "/users/delete");
        api_assert(response);
        api_init();
        return response;
    }

}
