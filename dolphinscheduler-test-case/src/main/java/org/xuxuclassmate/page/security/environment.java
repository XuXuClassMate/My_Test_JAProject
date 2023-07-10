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

public class environment extends dolphin {
    public Long create(String name, String config,String description) {
        Response response = baseRequest
                .param("name", name)
                .param("addrList", config)
                .param("description", description)
                .param("workerGroups", "[\"default\"]")
                .when().post(baseUrl + "/environment/create");
        api_assert(response);
        api_init();
        return (Long)api_path(response,"data");
    }

    public Response update(Long code,String name, String config,String description) {
        Response response = baseRequest
                .param("code", code)
                .param("name", name)
                .param("addrList", config)
                .param("description", description)
                .param("workerGroups", "[\"default\"]")
                .when().post(baseUrl + "/environment/update");
        api_assert(response);
        api_init();
        return response;
    }

    public Long search(String searchVal) {
        Response response = baseRequest
                .param("pageSize", 10)
                .param("pageNo", 1)
                .param("searchVal", searchVal)
                .when().get(baseUrl + "/environment/list-paging");
        api_assert(response);
        api_init();
        return (Long) api_path(response, "data.totalList[0].code");
    }

    public Response delete(Long environmentCode) {
        Response response = baseRequest
                .param("environmentCode", environmentCode)
                .when().post(baseUrl + "/environment/delete");
        api_assert(response);
        api_init();
        return response;
    }
}
