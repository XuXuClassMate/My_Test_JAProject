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

package project;

import BaseFunction.ApiBaseFun;
import groovy.util.logging.Slf4j;
import okhttp3.Response;

import java.io.IOException;
@Slf4j
public class Project extends ApiBaseFun {
    ApiBaseFun api=new ApiBaseFun();
    public String CreateProject(String projectName, String userName,String description) throws IOException {
        String path = "/project";
        String form="projectName=" + projectName + "&userName=" + userName+"&description="+description;
        Response result=api.Post_form(path,form);
        if (result.code() == 201) {
            return result.body().string();
        }
        return result.body().string();
    }
    public String UpdateProject(String projectcode, String projectName, String userName,String description) throws IOException {
        String path = "/projects/"+ projectcode;
        String form="projectName=" + projectName + "&userName=" + userName+"&description="+description;
        Response result=api.Post_form(path,form);
        if (result.code() == 201) {
            return result.body().string();
        }
        return result.body().string();
    }

    public String SearchProject(String projectName) throws IOException {
        String path = "/projects?";
        String form="searchVal=" + projectName;
        Response result=api.Get(path+form);
        if (result.code() == 200) {
            return result.body().string();
        }
        return result.body().string();
    }

}