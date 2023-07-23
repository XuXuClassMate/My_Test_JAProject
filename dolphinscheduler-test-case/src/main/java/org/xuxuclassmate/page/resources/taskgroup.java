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

package org.xuxuclassmate.page.resources;

import io.restassured.response.Response;
import org.xuxuclassmate.base.dolphin;

public class taskgroup extends dolphin {
    /*
    New task grouping opens StartTaskGroup by default
     */
    public Response create(String name, Long projectCode, Integer groupSize, String description) {
        Response response = baseRequest
                .param("id", 0)
                .param("name", name)
                .param("projectCode", projectCode)
                .param("groupSize", groupSize)
                .param("status", 1)
                .param("description", description)
                .when().post(baseUrl + "/task-group/create");
        api_assert(response);
        api_init();
        return response;
    }

    public Response update(Integer id, String name, Long projectCode, Integer groupSize, String description) {
        Response response = baseRequest
                .param("id", id)
                .param("name", name)
                .param("projectCode", projectCode)
                .param("groupSize", groupSize)
                .param("status", 1)
                .param("description", description)
                .when().post(baseUrl + "/task-group/update");
        api_assert(response);
        api_init();
        return response;
    }

    public Response StartTaskGroup(Integer id) {
        Response response = baseRequest
                .param("id", id)
                .when().post(baseUrl + "/task-group/start-task-group");
        api_assert(response);
        api_init();
        return response;
    }

    public Response CloseTaskGroup(Integer id) {
        Response response = baseRequest
                .param("id", id)
                .when().post(baseUrl + "/task-group/close-task-group");
        api_assert(response);
        api_init();
        return response;
    }

    public Integer search(String name) {
        Response response = baseRequest
                .param("pageSize", 10)
                .param("pageNo", 1)
                .param("name",name)
                .when().get(baseUrl + "/task-group/list-paging");
        api_assert(response);
        api_init();
        return (Integer) api_path(response,"data.totalList[0].id");
    }

}
