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

package page.project;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.Matchers.equalTo;


class projectTest {
    static project project;

    @BeforeAll
    static void setUp() {
        if (project == null){
            project=new project();
        }
    }

    @AfterAll
    static void setDown(){
        int total = project.search("").then().log().all().extract().path("data.total");
        for (int i = 0; i < total; i++) {
            Long projectCode = project.search("").then().extract().path("data.totalList[0].code");
            project.delete(projectCode);
        }
    }
    @Test
    @Disabled
    void search(){
        project.search("").body();
        String code=String.valueOf(project.search("").path("data.totalList[0].find{ it.name == 'test666' }.code"));
        System.out.println("projectcode"+ code);
    }
    @ParameterizedTest
    @ValueSource(strings={"ApiTestCreateProject123","ApiTestCreateProject456","ApiTestCreateProject789"})
    @DisplayName("create project Testcase")
    void create(String name) {
        String projectname =name;
        project.create(projectname,"")
                .then().body("code", equalTo(0));
        project.search(projectname)
                .then().body("data.totalList[0].name",equalTo(projectname));
    }
    @Nested
    @DisplayName("update projectName Testcase")
    class update_delete{
        @Test
        void update() {
            project.create("ApiTestCreateProject_update_init","ApiTestCreateProject_update_init")
                    .then().body("code", equalTo(0));
            Long projectCode = project.search("ApiTestCreateProject_update_init")
                    .then().log().all().body("data.totalList[0].name", equalTo("ApiTestCreateProject_update_init"))
                    .extract().path("data.totalList[0].code");
            project.update(projectCode,"ApiTestCreateProject_update_now","ApiTestCreateProject_update_now")
                    .then().body("code", equalTo(0));
            project.search("ApiTestCreateProject_update_now")
                    .then().body("data.totalList[0].name",equalTo("ApiTestCreateProject_update_now"));
        }
        @Nested
        @DisplayName("delete project")
        class delete{
            @Test
            void delete(){
                Long projectCode = project.search("ApiTestCreateProject_update_now")
                        .then().log().all().body("data.totalList[0].name", equalTo("ApiTestCreateProject_update_now"))
                        .extract().path("data.totalList[0].code");
                project.delete(projectCode);
            }
        }

    }
}