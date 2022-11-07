package Project;

import groovy.util.logging.Slf4j;
import org.testng.annotations.Test;

import java.io.IOException;


public class projectTest {

    String Base_url="http://www.xuxuclassmate.xyz:12345/dolphinscheduler";
    Project api = new Project();

    @Test
    public void login() throws IOException {
        System.out.println(api.login(Base_url,"admin","admin123"));
    }
    @Test
    public void CreatePoject() throws IOException {
        System.out.println(api.CreateProject("XuXuTest","admin",""));
    }

}