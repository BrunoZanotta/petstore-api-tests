package br.com.api.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseTest {

    public RequestSpecification spec;

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        spec = new RequestSpecBuilder()
                .setRelaxedHTTPSValidation()
                .setContentType(ContentType.JSON)
                .build();

        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
