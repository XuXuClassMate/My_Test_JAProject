package TestNgStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParamDataTestTest {
    @Test
    public void TestUserLogin1() {
        ParamDataTest login = new ParamDataTest();
        String result=login.UserLogin("admin", "");
        Assert.assertEquals("用户名或密码不能为空", result);
    }
    @Test
    public void TestUserLogin2(){
        ParamDataTest login = new ParamDataTest();
        String result=login.UserLogin("zhangsan", "zhangsan");
        Assert.assertEquals("欢迎zhangsan", result);
    }
}