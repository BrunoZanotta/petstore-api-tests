package br.com.api.factory;

import br.com.api.model.User;
import com.github.javafaker.Faker;

public class PostUserFactory {

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

    public static User createUserSuccess() {
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

    public static User createUserWithUserNameNull() {
        return build(
                faker.number().randomNumber(),
                null,
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithFirstNameNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                null,
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithLastNameNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                null,
                faker.internet().emailAddress(),
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithEmailNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                null,
                "petStore123",
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithPasswordNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                null,
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithPhoneNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "petStore123",
                null,
                faker.number().numberBetween(0, 10));
    }

    public static User createUserWithUserStatusNull() {
        return build(
                faker.number().randomNumber(),
                "petStore",
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                "petStore123",
                faker.phoneNumber().cellPhone(),
                null);
    }
}
