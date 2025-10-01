package br.com.api.test.functional;

import br.com.api.base.BaseTest;
import br.com.api.client.UserApi;
import br.com.api.dataprovider.GetUserLoginDataProvider;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Validatable;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.matchesPattern;

public class FunctionalGetUserLoginTest extends BaseTest {
    private final UserApi userApi = UserApi.user(RequestSpecBuilder::new);

    @Test(dataProvider = "getLoginSuccess", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginSuccess(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithUserNotFound", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithUserNotFound(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithSpecialCharacters", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithSpecialCharacters(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithNull", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithNull(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithEmpty", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithEmpty(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithPasswordNotFound", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithPasswordNotFound(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithPasswordWithSpecialCharacters", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithPasswordWithSpecialCharacters(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithPasswordWithNull", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWithPasswordWithNull(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }

    @Test(dataProvider = "getLoginWithPasswordEmpty", dataProviderClass = GetUserLoginDataProvider.class)
    public void validateFunctionalGetUserLoginWWithPasswordEmpty(String username, String password) {
        userApi.loginUser()
                .usernameQuery(username)
                .passwordQuery(password)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", matchesPattern("logged in user session:\\d+"));
    }
}
