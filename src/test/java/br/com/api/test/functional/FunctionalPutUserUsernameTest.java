package br.com.api.test.functional;

import br.com.api.base.BaseTest;
import br.com.api.client.UserApi;
import br.com.api.dataprovider.PutUserUsernameDataProvider;
import br.com.api.model.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Validatable;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class FunctionalPutUserUsernameTest extends BaseTest {
    private final UserApi userApi = UserApi.user(RequestSpecBuilder::new);

    @Test(dataProvider = "updateUserSuccess", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserSuccess(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "updateUserInvalid", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserInvalid(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "updateUserNotFound", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNotFound(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "updateUserEmptyBody", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserEmptyBody(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(0)));
    }

    @Test(dataProvider = "userNameNotFound", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNameNotFound(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "userNameInvalid", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNameInvalid(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "userNameEmpty", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNameEmpty(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_METHOD_NOT_ALLOWED)
                .body("code", equalTo(HttpStatus.SC_METHOD_NOT_ALLOWED))
                .body("type", equalTo("unknown"));
    }

    @Test(dataProvider = "userNameSpecialChars", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNameSpecialChars(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "userNameLong", dataProviderClass = PutUserUsernameDataProvider.class)
    public void validateFunctionalPutUserNameLong(String username, User requestUser) {
        userApi.updateUser()
                .usernamePath(username)
                .body(requestUser)
                .execute(Validatable::then)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }
}
