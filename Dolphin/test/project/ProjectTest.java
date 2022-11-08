package Project;

import groovy.util.logging.Slf4j;
import org.testng.annotations.Test;
import cn.hutool.json.JSONUtil;

import baseFunction.BaseResponse;
import dto.LoginResponse;
import java.util.Objects;

import java.io.IOException;

public class ProjectTest {

    String Base_url="http://www.xuxuclassmate.xyz:12345/dolphinscheduler";
    Project api = new Project();

    @Test
    public void login() throws IOException {
        String logResponse = api.login(Base_url,"admin","admin123");
        BaseResponse baseResponse = JSONUtil.toBean(logResponse, BaseResponse.class);
        if (Objects.isNull(baseResponse)) {
            System.out.println(String.format("user %s login failed", "admin"));
        }
        LoginResponse loginResponse = baseResponse.getDataInstance(LoginResponse.class);
        if (Objects.isNull(loginResponse)) {
            System.out.println("LoginResponse parse error");
        }
        System.out.println("sessionId: " + loginResponse.getSessionId());
    }
    @Test
    public void CreatePoject() throws IOException {
        System.out.println(api.CreateProject("XuXuTest","admin",""));
    }

}