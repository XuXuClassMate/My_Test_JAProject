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

package org.xuxuclassmate.page.project;

import io.restassured.response.Response;
import org.xuxuclassmate.base.dolphin;

import static org.hamcrest.Matchers.equalTo;

public class project extends dolphin {
    public Long create(String projectName,String description){
        Response response= baseRequest
                .param("projectName",projectName)
                .param("description",description)
                .param("userName",userName)
                .when().post(baseUrl+"/projects");
        api_assert(response);
        api_init();
        return (Long) api_path(response, "data.code");

    }

    public Response update(Long projectCode,String projectName,String description){
        Response response= baseRequest
                .param("projectName",projectName).param("description",description)
                .param("userName",userName)
                .when().put(baseUrl+"/projects/"+ projectCode);
        api_assert(response);
        api_init();
        return response;
    }

    public Response delete(Long projectCode){
        Response response= baseRequest
                .when().delete(baseUrl+"/projects/"+ projectCode);
        api_assert(response);
        api_init();
        return response;
    }

    public Response search(Integer pageSize, Integer pageNo, String searchName){
        if (pageSize ==null | pageSize < 10){
            pageSize =10;
        }
        if (pageNo ==null | pageNo < 1) {
            pageNo =1;
        }
        Response response= baseRequest
                .param("pageSize",pageSize)
                .param("pageNo",pageNo)
                .param("searchVal",searchName)
                .when().get(baseUrl+"/projects");
        api_assert(response);
        api_init();
        return response;

    }
    public Response search(String searchName){
        Response response= baseRequest
                .param("pageSize",10)
                .param("pageNo",1)
                .param("searchVal",searchName)
                .when().get(baseUrl+"/projects");
        api_assert(response);
        api_init();
        return response;
    }
}
