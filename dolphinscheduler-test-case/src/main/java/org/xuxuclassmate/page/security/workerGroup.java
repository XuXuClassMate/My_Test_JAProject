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

public class workerGroup extends dolphin {

    public String get_addrList() {
        Response response = baseRequest
                .when().get(baseUrl + "/worker-groups/worker-address-list");
        api_assert(response);
        api_init();
        return (String) api_path(response, "data[0]");
    }

    public Response create(String name, String addrList) {
        Response response = baseRequest
                .param("name", name)
                .param("addrList", addrList)
                .when().post(baseUrl + "/worker-groups");
        api_assert(response);
        api_init();
        return response;
    }

    public Response update(Integer id, String name, String addrList) {
        Response response = baseRequest
                .param("id", id)
                .param("name", name)
                .param("addrList", addrList)
                .when().post(baseUrl + "/worker-groups");
        api_assert(response);
        api_init();
        return response;
    }

    public Integer search(String searchVal) {
        Response response = baseRequest
                .param("pageSize", 10)
                .param("pageNo", 1)
                .param("searchVal", searchVal)
                .when().get(baseUrl + "/worker-groups");
        api_assert(response);
        api_init();
        return (Integer) api_path(response, "data.totalList[0].id");
    }

    public Response delete(Integer id) {
        Response response = baseRequest
                .param("id", id)
                .when().delete(baseUrl + "/worker-groups/" + id);
        api_assert(response);
        api_init();
        return response;
    }
}
