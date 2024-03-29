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

public class tenant extends dolphin {
    public Integer create(String TenantName, String description) {
        Response response = baseRequest
                .param("tenantCode", TenantName)
                .param("queueId", 1)
                .param("description", description)
                .when().post(baseUrl + "/tenants");
        api_assert(response);
        api_init();
        return (Integer) api_path(response, "data.id");
    }

    public Response update(String TenantName, String description, Integer tenantId) {
        Response response = baseRequest
                .param("tenantCode", TenantName)
                .param("queueId", 1)
                .param("description", description)
                .param("id", tenantId)
                .when().put(baseUrl + "/tenants/" + tenantId);
        api_assert(response);
        api_init();
        return response;
    }

    public Response search(String searchVal) {
        Response response = baseRequest
                .param("pageSize", 10)
                .param("pageNo", 1)
                .param("searchVal", searchVal)
                .when().get(baseUrl + "/tenants");
        api_assert(response);
        api_init();
        return response;
    }

    public Response delete(Integer tenantid) {
        Response response = baseRequest
                .when().delete(baseUrl + "/tenants/"+tenantid);
        api_assert(response);
        api_init();
        return response;
    }

}
