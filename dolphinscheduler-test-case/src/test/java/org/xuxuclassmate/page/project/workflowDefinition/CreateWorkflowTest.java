package org.xuxuclassmate.page.project.workflowDefinition;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xuxuclassmate.page.project.project;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
@Feature("CreateWorkflowTest")
class CreateWorkflowTest {
    static project project;
    static CreateWorkflow CreateWorkflow;
    @BeforeEach
    void setUp() {
        if (project == null){
            project=new project();
        } else if (CreateWorkflow == null) {
            CreateWorkflow=new CreateWorkflow();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createShell() {
    }

    @Test
    void setCreateWorkflow() throws IOException {
        project.create("CreateShellworkflowTest",null);
        Long projectcode = project.search("CreateShellworkflowTest").then().extract().path("data.totalList[0].code");
        CreateWorkflow.createShell(projectcode).then().body("code", equalTo(0));

    }

}