package base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

class dolphinlogintest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void logIn() {
        dolphin dolphin=new dolphin();
        String sessionId =dolphin.logIn();
        System.out.println("sessionId : " + sessionId);
        assertThat(sessionId,not(equalTo(null)));
    }
}