package extending;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailValidatorConsumer emailValidatorConsumer = new EmailValidatorConsumer();

        List<String> emails = List.of("alejoloopez5@gmail.com", "malg.nmg@hotmail.com");
        emails.forEach(email -> {
            Boolean isValid = emailValidatorConsumer.apply(email);
            System.out.println(String.format("Email %s is valid: %S", email, isValid));
        });

        Person person = new Person();
        person.setName("Alejo");
        person.setPhoneNumber("3197685314");
        person.setEmail("malg@hotmail.com");

        PersonRegistrationValidator validator =
                PersonRegistrationValidator
                        .isEmailValid()
                        .and(PersonRegistrationValidator.isPhoneNumberValid());
        System.out.println(validator.apply(person));
    }

}
