package org.xuxuclassmate.page.resources;

import org.junit.jupiter.api.*;
import org.xuxuclassmate.page.project.project;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
class taskgroupTest {
    static taskgroup taskgroup;
    static project project;
    static Integer taskgroupid;
    static Long projectcode;
    static String description = null;
    static String taskgroupname = "taskgroupTest";

    @BeforeEach
    void setUp() {
        if (taskgroup == null) {
            taskgroup = new taskgroup();
        }
        if (project == null) {
            project = new project();
        }
    }

    @AfterEach
    void tearDown() {
        project.delete(projectcode);
    }

    @Test
    @Order(0)
    void create() {
        projectcode = project.create("taskgroupprojectTest", "description");
        taskgroup.create("taskgroupname", projectcode, 5, description);
    }

    @Test
    @Order(2)
    void update() {
        taskgroup.update(taskgroupid,taskgroupname,projectcode,7,description);
    }

    @Test
    @Order(4)
    void startTaskGroup() {
        taskgroup.StartTaskGroup(taskgroupid);
    }

    @Test
    @Order(3)
    void closeTaskGroup() {
        taskgroup.CloseTaskGroup(taskgroupid);
    }

    @Test
    @Order(1)
    void search() {
        taskgroupid = taskgroup.search("taskgroupname");
    }
}