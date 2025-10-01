package br.com.api.dataprovider;

import org.testng.annotations.DataProvider;
import static br.com.api.factory.DeleteUserUsernameFactory.*;

public class DeleteUserUsernameDataProvider {

    @DataProvider(name = "deleteUserUsernameSuccess")
    public static Object[][] providerDeleteUserUsernameSuccess() {
        return new Object[][]{
                {deleteUserUsernameSuccess()}
        };
    }

    @DataProvider(name = "deleteUserUsernameNotFound")
    public static Object[][] providerDeleteUserUsernameNotFound() {
        return new Object[][]{
                {deleteUserUsernameNotFound()}
        };
    }

    @DataProvider(name = "deleteUserUsernameWithSpecialCharacters")
    public static Object[][] providerDeleteUserUsernameWithSpecialCharacters() {
        return new Object[][]{
                {deleteUserUsernameWithSpecialCharacters()}
        };
    }

    @DataProvider(name = "deleteUserUsernameEmpty")
    public static Object[][] providerDeleteUserUsernameEmpty() {
        return new Object[][]{
                {deleteUserUsernameEmpty()}
        };
    }

}
