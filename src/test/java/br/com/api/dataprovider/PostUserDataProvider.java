package br.com.api.dataprovider;

import org.testng.annotations.DataProvider;
import static br.com.api.factory.PostUserFactory.*;

public class PostUserDataProvider {

    @DataProvider(name = "createUserSuccess")
    public static Object[][] providerCreateUserSuccess() {
        return new Object[][]{
                {createUserSuccess()}
        };
    }

    @DataProvider(name = "createUserWithUserNameNull")
    public static Object[][] providerCreateUserWithUserNameNull() {
        return new Object[][]{
                {createUserWithUserNameNull()}
        };
    }

    @DataProvider(name = "createUserWithFirstNameNull")
    public static Object[][] providerCreateUserWithFirstNameNull() {
        return new Object[][]{
                {createUserWithFirstNameNull()}
        };
    }

    @DataProvider(name = "createUserWithLastNameNull")
    public static Object[][] providerCreateUserWithLastNameNull() {
        return new Object[][]{
                {createUserWithLastNameNull()}
        };
    }

    @DataProvider(name = "createUserWithEmailNull")
    public static Object[][] providerCreateUserWithEmailNull() {
        return new Object[][]{
                {createUserWithEmailNull()}
        };
    }

    @DataProvider(name = "createUserWithPasswordNull")
    public static Object[][] providerCreateUserWithPasswordNull() {
        return new Object[][]{
                {createUserWithPasswordNull()}
        };
    }

    @DataProvider(name = "createUserWithPhoneNull")
    public static Object[][] providerCreateUserWithPhoneNull() {
        return new Object[][]{
                {createUserWithPhoneNull()}
        };
    }

    @DataProvider(name = "createUserWithUserStatusNull")
    public static Object[][] providerCreateUserWithUserStatusNull() {
        return new Object[][]{
                {createUserWithUserStatusNull()}
        };
    }
}
