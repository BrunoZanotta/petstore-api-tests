package br.com.api.test.contract;

import br.com.api.base.BaseTest;
import br.com.api.client.UserApi;
import br.com.api.dataprovider.PutUserUsernameDataProvider;
import br.com.api.model.User;
import com.atlassian.oai.validator.restassured.OpenApiValidationFilter;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Validatable;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class ContractPutUserUsernameTest extends BaseTest {
    private static final String OPENAPI_SPEC_PATH = "specs/openapi.yaml";

    private static final OpenApiValidationFilter validationFilter = new OpenApiValidationFilter(OPENAPI_SPEC_PATH);

    private final UserApi userApi = UserApi.user(() -> new RequestSpecBuilder().addFilter(validationFilter));

    @Test(dataProvider = "updateUserSuccess", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateContractPutUserSuccess(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK);
    }
}
