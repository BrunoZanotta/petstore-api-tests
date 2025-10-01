package br.com.api.test.healthcheck;

import br.com.api.base.BaseTest;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class HealthCheckTest extends BaseTest {

    @Test
    public void healthCheckTest() {
        given().
            spec(spec).
        when().
            get("").
        then().
            statusCode(HttpStatus.SC_OK);
    }
}
