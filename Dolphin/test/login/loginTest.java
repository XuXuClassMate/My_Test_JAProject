package login;

import org.testng.annotations.Test;
import java.io.IOException;


public class loginTest {
    String Base_url="http://www.xuxuclassmate.xyz:12345/dolphinscheduler";
    @Test
    public void testLogin() throws IOException {
        login login = new login();
        String path="/login";
        String result = login.login(Base_url+path);
        System.out.println(result);
    }
}