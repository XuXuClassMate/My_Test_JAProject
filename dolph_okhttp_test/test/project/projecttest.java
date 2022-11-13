package project;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.testng.annotations.Test;
import java.io.IOException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class projecttest {

    String Base_url="http://www.xuxuclassmate.xyz:12345/dolphinscheduler";
   private final project api =new project();
    @Test
    @Order(1)
    public void login() throws IOException {
        System.out.println(System.currentTimeMillis());
        System.out.println(api);
        String logResponse = api.login(Base_url,"admin","admin123");
        System.out.println(logResponse);

    }
    @Test
    @Order(609)
    public void CreatePoject() throws IOException {
        System.out.println(System.currentTimeMillis());
        System.out.println(api.CreateProject("XuXuTest","admin",""));
    }

}
