package br.com.api.dataprovider;

import org.testng.annotations.DataProvider;

import static br.com.api.factory.PutUserUsernameFactory.*;

public class PutUserUsernameDataProvider {

    @DataProvider(name = "updateUserSuccess")
    public static Object[][] providerUpdateUserSuccess() {
        return new Object[][]{
                {userName(), updateUserSuccess()}
        };
    }

    @DataProvider(name = "updateUserInvalid")
    public static Object[][] providerUpdateUserInvalid() {
        return new Object[][]{
                {userName(), updateUserInvalid()}
        };
    }

    @DataProvider(name = "updateUserNotFound")
    public static Object[][] providerUpdateUserNotFound() {
        return new Object[][]{
                {userName(), updateUserNotFound()}
        };
    }

    @DataProvider(name = "updateUserEmptyBody")
    public static Object[][] providerUpdateUserEmptyBody() {
        return new Object[][]{
                {userName(), updateUserEmptyBody()}
        };
    }

    @DataProvider(name = "userNameNotFound")
    public static Object[][] providerUserNameNotFound() {
        return new Object[][]{
                {userNameNotFound(), updateUserSuccess()}
        };
    }

    @DataProvider(name = "userNameInvalid")
    public static Object[][] providerUserNameInvalid() {
        return new Object[][]{
                {userNameInvalid(), updateUserSuccess()}
        };
    }

    @DataProvider(name = "userNameEmpty")
    public static Object[][] providerUserNameEmpty() {
        return new Object[][]{
                {userNameEmpty(), updateUserSuccess()}
        };
    }

    @DataProvider(name = "userNameSpecialChars")
    public static Object[][] providerUserNameSpecialChars() {
        return new Object[][]{
                {userNameSpecialChars(), updateUserSuccess()}
        };
    }

    @DataProvider(name = "userNameLong")
    public static Object[][] providerUserNameLong() {
        return new Object[][]{
                {userNameLong(), updateUserSuccess()}
        };
    }
}



