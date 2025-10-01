package br.com.api.factory;

import br.com.api.model.User;
import com.github.javafaker.Faker;

public class PutUserUsernameFactory {

    private static final Faker faker = new Faker();

    private static User build(Long id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
        User request = new User();
        request.setId(id);
        request.setUsername(username);
        request.setFirstName(firstName);
        request.setLastName(lastName);
        request.setEmail(email);
        request.setPassword(password);
        request.setPhone(phone);
        request.setUserStatus(userStatus);
        return request;
    }

    public static String userName() {
        return "petStore";
    }

    public static String userNameNotFound() {
        return "nonExistentUser";
    }

    public static String userNameInvalid() {
        return "invalid*user$name!";
    }

    public static String userNameEmpty() {
        return "";
    }

    public static String userNameSpecialChars() {
        return "user!@#";
    }

    public static String userNameLong() {
        return faker.lorem().characters(51);
    }

    public static User updateUserSuccess() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User updateUserInvalid() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                "invalid-email-format",
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User updateUserNotFound() {
        return build(
                999999L,
                "nonExistentUser",
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "somePassword",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User updateUserEmptyBody() {
        return new User();
    }

}
