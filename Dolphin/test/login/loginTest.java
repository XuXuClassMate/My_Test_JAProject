package login;

import org.testng.annotations.Test;
import java.io.IOException;


public class loginTest {
    String Base_url="http://www.xuxuclassmate.xyz:12345/dolphinscheduler";
    login login = new login();
    @Test
    public void testLogin() throws IOException {

        String path="/login";
        String result = login.login(Base_url+path);
        System.out.println(result);
    }


    @Test
    public void TestLoginpost() throws IOException {
        String path="/login";
        String result = login.login2(Base_url+path,"admin","admin123");
        System.out.println(result);

    }
}