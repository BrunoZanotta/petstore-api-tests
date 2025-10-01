package br.com.api.dataprovider;

import org.testng.annotations.DataProvider;
import static br.com.api.factory.PostUserFactory.createUserSuccess;

public class PostUserDataProvider {

    @DataProvider(name = "createUserSuccess")
    public static Object[][] providerCreateUserSuccess() {
        return new Object[][]{
                {createUserSuccess()}
        };
    }
}
