package page.dataSource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void create() {

    }

    @Test
    void connet() {
        datasource.connect("MySqlDataTest").then().body("code",equalTo(10037));
    }

    @Test
    void connet_map(){
        HashMap<String, Object> map=new HashMap<String, Object>(){{
         put("type","MYSQL");
         put("name","apiTestmysql");
         put("userName","root");
         put("passWord","root@123");
        }};
        datasource.connect(map).then().body("code",equalTo(10037));
    }
}