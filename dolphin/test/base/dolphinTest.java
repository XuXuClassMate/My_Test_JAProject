package base;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class dolphinloginTest {
    static dolphin dolphin;
    @BeforeEach
    void setUp() {
        if (dolphin == null){
            dolphin = new dolphin();
        }
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Link(name="login url", url = "http://150.158.189.11:12345/dolphinscheduler")
    @Links({@Link(name="admin url", url = "http://150.158.189.11"),
            @Link(name="login url", url = "http://150.158.189.11:12345/dolphinscheduler")})
    @Description("login Testcase，assert session Is it empty")
    void logIn() {
        String sessionId = dolphin.logIn();
        assertThat(sessionId,not(equalTo(null)));
        System.out.println("sessionId : " + sessionId);
    }
}