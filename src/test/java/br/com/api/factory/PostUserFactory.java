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
                faker.name().username(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.internet().password(),
                faker.phoneNumber().cellPhone(),
                faker.number().numberBetween(0, 10));
    }
}
