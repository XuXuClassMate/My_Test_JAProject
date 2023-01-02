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

import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.Matchers.equalTo;

@Feature("project Testcase")
class projectTest {
    static project project;

    @BeforeAll
    static void setUp() {
        if (project == null){
            project=new project();
        }
    }

    @AfterAll
    @Story("all datasource delete")
    static void setDown(){
        int total = project.search("").then().log().all().extract().path("data.total");
        for (int i = 0; i < total; i++) {
            Long projectCode = project.search("").then().extract().path("data.totalList[0].code");
            project.delete(projectCode);
        }
    }
    @Test
    @Disabled
    @Severity(SeverityLevel.MINOR)
    @Story("search Testcase")
    void search(){
        project.search("").body();
        String code=String.valueOf(project.search("").path("data.totalList[0].find{ it.name == 'test666' }.code"));
        System.out.println("projectcode"+ code);
    }
    @ParameterizedTest
    @ValueSource(strings={"ApiTestCreateProject123","ApiTestCreateProject456","ApiTestCreateProject789"})
    @DisplayName("create project Testcase")
    @Story("Create project {name}")
    @Severity(SeverityLevel.BLOCKER)
    void create(String name) {
        project.create(name,"")
                .then().body("code", equalTo(0));
        project.search(name)
                .then().body("data.totalList[0].name",equalTo(name));
    }
    @Nested
    @DisplayName("update projectName Testcase")
    @Severity(SeverityLevel.BLOCKER)
    class update_delete{
        @Test
        void update() {
            Allure.step("Create 'ApiTestCreateProject_update_init' project");
            project.create("ApiTestCreateProject_update_init","ApiTestCreateProject_update_init")
                    .then().body("code", equalTo(0));
            Allure.step("Get 'ApiTestCreateProject_update_init' project code");
            Long projectCode = project.search("ApiTestCreateProject_update_init")
                    .then().log().all().body("data.totalList[0].name", equalTo("ApiTestCreateProject_update_init"))
                    .extract().path("data.totalList[0].code");
            Allure.step("Update project name 'ApiTestCreateProject_update_init' -> 'ApiTestCreateProject_update_now'");
            project.update(projectCode,"ApiTestCreateProject_update_now","ApiTestCreateProject_update_now")
                    .then().body("code", equalTo(0));
            Allure.step("Assert correct modification of project name ");
            project.search("ApiTestCreateProject_update_now")
                    .then().body("data.totalList[0].name",equalTo("ApiTestCreateProject_update_now"));
        }
        @Nested
        @DisplayName("delete project")
        @Severity(SeverityLevel.BLOCKER)
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