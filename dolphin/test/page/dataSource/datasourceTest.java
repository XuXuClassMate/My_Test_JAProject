package page.dataSource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.project.project;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

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
}