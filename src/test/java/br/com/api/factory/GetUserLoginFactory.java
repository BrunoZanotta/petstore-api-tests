package br.com.api.factory;

import com.github.javafaker.Faker;

public class GetUserLoginFactory {

    private static final Faker faker = new Faker();

    public static String getUserLoginSuccess() {
        return "petStore";
    }

    public static String getUserLoginNotFound() {
        return faker.name().username();
    }

    public static String getUserLoginWithSpecialCharacters() {
        return "@!#$%¨&*()";
    }

    public static String getUserLoginNull() {
        return null;
    }

    public static String getUserLoginEmpty() {
        return "";
    }

    public static String getUserPasswordSuccess() {
        return "petStore123";
    }

    public static String getUserPasswordNotFound() {
        return faker.name().username();
    }

    public static String getUserPasswordWithSpecialCharacters() {
        return "@!#$%¨&*()";
    }

    public static String getUserPasswordNull() {
        return null;
    }

    public static String getUserPasswordEmpty() {
        return "";
    }
}
