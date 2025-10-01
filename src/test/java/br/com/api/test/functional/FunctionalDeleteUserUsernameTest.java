package br.com.api.test.functional;

import br.com.api.base.BaseTest;
import br.com.api.client.UserApi;
import br.com.api.dataprovider.DeleteUserUsernameDataProvider;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Validatable;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class FunctionalDeleteUserUsernameTest extends BaseTest {

    private final UserApi userApi = UserApi.user(RequestSpecBuilder::new);

    @Test(dataProvider = "deleteUserUsernameSuccess", dataProviderClass = DeleteUserUsernameDataProvider.class)
    public void validateFunctionalDeleteUserUsernameSuccess(String username) {
        userApi.deleteUser()
                .usernamePath(username)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(username));
    }

    @Test(dataProvider = "deleteUserUsernameNotFound", dataProviderClass = DeleteUserUsernameDataProvider.class)
    public void validateFunctionalDeleteUserUsernameNotFound(String username) {
        userApi.deleteUser()
                .usernamePath(username)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Test(dataProvider = "deleteUserUsernameWithSpecialCharacters", dataProviderClass = DeleteUserUsernameDataProvider.class)
    public void validateFunctionalDeleteUserUsernameWithSpecialCharacters(String username) {
        userApi.deleteUser()
                .usernamePath(username)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Test(dataProvider = "deleteUserUsernameEmpty", dataProviderClass = DeleteUserUsernameDataProvider.class)
    public void validateFunctionalDeleteUserUsernameEmpty(String username) {
        userApi.deleteUser()
                .usernamePath(username)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED)
                .body("code", equalTo(HttpStatus.SC_METHOD_NOT_ALLOWED))
                .body("type", equalTo("unknown"));
    }
}
