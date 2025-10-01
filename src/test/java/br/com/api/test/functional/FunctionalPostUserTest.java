package br.com.api.test.functional;

import br.com.api.base.BaseTest;
import br.com.api.client.UserApi;
import br.com.api.dataprovider.PostUserDataProvider;
import br.com.api.model.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Validatable;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class FunctionalPostUserTest extends BaseTest {
    private final UserApi userApi = UserApi.user(RequestSpecBuilder::new);

    @Test(dataProvider = "createUserSuccess", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserSuccess(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                    .body("code", equalTo(HttpStatus.SC_OK))
                    .body("type", equalTo("unknown"))
                    .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithUserNameNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithUserNameNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithFirstNameNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithFirstNameNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithLastNameNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithLastNameNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithEmailNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithEmailNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithPasswordNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithPasswordNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithPhoneNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithPhoneNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }

    @Test(dataProvider = "createUserWithUserStatusNull", dataProviderClass = PostUserDataProvider.class)
    public void validateFunctionalPostUserWithUserStatusNull(User requestUser) {
        userApi.createUser()
                .body(requestUser)
                .execute(Validatable::then)
                .statusCode(HttpStatus.SC_OK)
                .body("code", equalTo(HttpStatus.SC_OK))
                .body("type", equalTo("unknown"))
                .body("message", equalTo(String.valueOf(requestUser.getId())));
    }
}
