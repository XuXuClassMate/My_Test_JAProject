package page.dataSource;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.hamcrest.Matchers.equalTo;
class datasourceTest {
    datasource datasource;

    @BeforeEach
    void setUp() {
        if (datasource == null){
            datasource=new datasource();
        }
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Description("create datasource Testcase")
    @Severity(SeverityLevel.CRITICAL)
    @Attachment
    void create() throws IOException {
        HashMap<String,Object> map=new HashMap<>();
        map.put("type","MYSQL");
        map.put("name","apiTestmysql");
        map.put("userName","root");
        map.put("password","root@123");
        datasource.create(map).then().body("code",equalTo(10033));
    }
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("connet datasource Testcase")
    @Attachment
    void connet() throws IOException {
        HashMap<String, Object> map=new HashMap<>();
        map.put("type","MYSQL");
        map.put("name","apiTestmysql");
        map.put("userName","root");
        map.put("password","root@123");
        map.put("database","xuxutestdb123");
        datasource.connect(map).then().body("code",equalTo(10036));
    }
}