package page.dataSource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
    void connet_map(){
        HashMap<String, Object> map=new HashMap<>();
        map.put("type","MYSQL");
        map.put("name","apiTestmysql");
        map.put("userName","root");
        map.put("passWord","root@123");
        datasource.connect(map).then().body("code",equalTo(10037));
    }
}