package base;

import org.junit.jupiter.api.Test;
import page.project.project;



class projectTest {

    @Test
    void search(){
        project project=new project();
        project.search("123").body();
    }
}