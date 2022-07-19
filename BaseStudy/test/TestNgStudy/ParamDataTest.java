package TestNgStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParamDataTest {
    @Test
    public void TestUserLogin1() {
        ParamData login = new ParamData();
        String result=login.UserLogin("zhangsan", "");
        Assert.assertEquals("用户名或密码不能为空", result);
    }
    @Test
    public void TestUserLogin2(){
        ParamData login = new ParamData();
        String result=login.UserLogin("zhangsan", "zhangsan");
        Assert.assertEquals("欢迎zhangsan", result);
    }
    @Test
    public void TestUserLogin3(){
        ParamData login = new ParamData();
        String result=login.UserLogin("admin", "");
        Assert.assertEquals("用户名或密码不能为空", result);
    }
    @Test
    public void TestUserLogin4(){
        ParamData login = new ParamData();
        String result=login.UserLogin("admin", "admin");
        Assert.assertEquals("欢迎管理员", result);
    }
    @Test
    public void TestUserLogin5(){
        ParamData login = new ParamData();
        String result=login.UserLogin("", "admin");
        Assert.assertEquals("用户名或密码不能为空", result);
    }

}