package br.com.api.factory;

import com.github.javafaker.Faker;

public class DeleteUserUsernameFactory {

    private static final Faker faker = new Faker();

    public static String deleteUserUsernameSuccess() {
        return "petStore";
    }

    public static String deleteUserUsernameNotFound() {
        return faker.name().username();
    }

    public static String deleteUserUsernameWithSpecialCharacters() {
        return "@!#$%¨&*()";
    }

    public static String deleteUserUsernameEmpty() {
        return "";
    }
}
