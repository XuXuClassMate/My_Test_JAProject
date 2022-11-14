package base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.project.project;

import static org.hamcrest.Matchers.equalTo;


class projectTest {
    project project;
    @BeforeEach
     void setUp() {
        if (project == null){
            project=new project();
        }
    }

    @Test
    void search(){

        project.search("123").body();
        project.search(null,null,"123");
    }

    @Test
    void create() {
        project.create("ApiTestCreateProject","")
                .then().body("code", equalTo(0));
        project.search("ApiTestCreateProject")
                .then().body("data.totalList[0].name",equalTo("ApiTestCreateProject"));
    }
}