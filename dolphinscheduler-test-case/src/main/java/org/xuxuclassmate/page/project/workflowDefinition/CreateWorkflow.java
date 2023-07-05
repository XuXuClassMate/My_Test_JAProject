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

package org.xuxuclassmate.page.project.workflowDefinition;

import io.restassured.response.Response;
import org.xuxuclassmate.base.dolphin;

public class CreateWorkflow extends dolphin {
    public Long createShell(Long projectCode){
        Response response= baseRequest
                .param("taskDefinitionJson","[{\"id\":26,\"code\":10082172833504,\"name\":\"shell\",\"version\":1,\"description\":\"\",\"projectCode\":9684697677792,\"userId\":1,\"taskType\":\"SHELL\",\"taskParams\":{\"localParams\":[],\"rawScript\":\"date\",\"resourceList\":[]},\"taskParamList\":[],\"taskParamMap\":null,\"flag\":\"YES\",\"taskPriority\":\"MEDIUM\",\"userName\":null,\"projectName\":null,\"workerGroup\":\"default\",\"environmentCode\":-1,\"failRetryTimes\":0,\"failRetryInterval\":1,\"timeoutFlag\":\"CLOSE\",\"timeoutNotifyStrategy\":null,\"timeout\":0,\"delayTime\":0,\"resourceIds\":\"\",\"createTime\":\"2023-07-01 15:43:46\",\"updateTime\":\"2023-07-01 15:43:46\",\"modifyBy\":null,\"taskGroupId\":0,\"taskGroupPriority\":0,\"operator\":1,\"operateTime\":\"2023-07-01 15:43:46\",\"dependence\":\"\"}]")
                .param("taskRelationJson","[{\"name\":\"\",\"preTaskCode\":0,\"preTaskVersion\":0,\"postTaskCode\":10082172833504,\"postTaskVersion\":1,\"conditionType\":\"NONE\",\"conditionParams\":{}}]")
                .param("locations","[{\"taskCode\":10082172833504,\"x\":420,\"y\":180}]")
                .param("name","shellWorkflow")
                .param("tenantCode","default")
                .param("executionType","PARALLEL")
                .when().post(baseUrl+"/projects/"+ projectCode +"/process-definition");
        api_assert(response);
        api_init();
        return (Long) api_path(response, "data.code");
    }

    public Long search(Long projectCode,String searchVal){
        Response response= baseRequest
                .param("pageSize",10)
                .param("pageNo",1)
                .param("searchVal",searchVal)
                .when().get(baseUrl+"/projects/"+ projectCode +"/process-definition");
        api_assert(response);
        api_init();
        return (Long) api_path(response, "data.totalList[0].code");
    }

    public Response delete(Long projectCode,Long workflowcode){
        Response response= baseRequest
                .when().delete(baseUrl+"/projects/"+ projectCode +"/process-definition/"+ workflowcode);
        api_assert(response);
        api_init();
        return response;
    }

}
