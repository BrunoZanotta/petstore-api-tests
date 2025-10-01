package br.com.api.dataprovider;

import org.testng.annotations.DataProvider;

import static br.com.api.factory.GetUserLoginFactory.*;

public class GetUserLoginDataProvider {

    @DataProvider(name = "getLoginSuccess")
    public static Object[][] providerGetLoginSuccess() {
        return new Object[][]{
                {getUserLoginSuccess(), getUserPasswordSuccess()}
        };
    }

    @DataProvider(name = "getLoginWithUserNotFound")
    public static Object[][] providerGetLoginWithUserNotFound() {
        return new Object[][]{
                {getUserLoginNotFound(), getUserPasswordSuccess()}
        };
    }

    @DataProvider(name = "getLoginWithSpecialCharacters")
    public static Object[][] providerGetLoginWithSpecialCharacters() {
        return new Object[][]{
                {getUserLoginWithSpecialCharacters(), getUserPasswordSuccess()}
        };
    }

    @DataProvider(name = "getLoginWithNull")
    public static Object[][] providerGetLoginWithNull() {
        return new Object[][]{
                {getUserLoginNull(), getUserPasswordSuccess()}
        };
    }

    @DataProvider(name = "getLoginWithEmpty")
    public static Object[][] providerGetLoginWithEmpty() {
        return new Object[][]{
                {getUserLoginEmpty(), getUserPasswordSuccess()}
        };
    }

    @DataProvider(name = "getLoginWithPasswordNotFound")
    public static Object[][] providerGetLoginWithPasswordNotFound() {
        return new Object[][]{
                {getUserLoginSuccess(), getUserPasswordNotFound()}
        };
    }

    @DataProvider(name = "getLoginWithPasswordWithSpecialCharacters")
    public static Object[][] providerGetLoginWithPasswordWithSpecialCharacters() {
        return new Object[][]{
                {getUserLoginSuccess(), getUserPasswordWithSpecialCharacters()}
        };
    }

    @DataProvider(name = "getLoginWithPasswordWithNull")
    public static Object[][] providerGetLoginWithPasswordWithNull() {
        return new Object[][]{
                {getUserLoginSuccess(), getUserPasswordNull()}
        };
    }

    @DataProvider(name = "getLoginWithPasswordEmpty")
    public static Object[][] providerGetLoginWithPasswordEmpty() {
        return new Object[][]{
                {getUserLoginSuccess(), getUserPasswordEmpty()}
        };
    }
}
