package org.xuxuclassmate.page.project.workflowDefinition;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.xuxuclassmate.page.project.project;

@Feature("CreateWorkflowTest")
class CreateWorkflowTest {
    static project project;
    static CreateWorkflow CreateWorkflow;

    @BeforeEach
    void setUp() {
        if (project == null) {
            project = new project();
        } else if (CreateWorkflow == null) {
            CreateWorkflow = new CreateWorkflow();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Disabled
    void createShell() {
    }

    @Test
    @Order(1)
    @DisplayName("Shell工作流创建删除")
    void setCreateWorkflow() {
        project.create("CreateShellworkflowTest", null);
        Long projectcode = project.search("CreateShellworkflowTest").then().extract().path("data.totalList[0].code");
        Long workflowcode = CreateWorkflow.createShell(projectcode);
        CreateWorkflow.delete(projectcode, workflowcode);
        project.delete(projectcode);

    }

}