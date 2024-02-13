package extending;

import java.util.function.Function;

import static extending.PersonRegistrationValidator.ValidationResult.*;

public interface PersonRegistrationValidator extends Function<Person, PersonRegistrationValidator.ValidationResult> {

    static PersonRegistrationValidator isEmailValid() {
        return person -> person.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
    }

    static PersonRegistrationValidator isPhoneNumberValid() {
        return person -> person.getPhoneNumber().contains("+") ? SUCCESS : PHONE_NOT_VALID;
    }

    default PersonRegistrationValidator and(PersonRegistrationValidator validator){
        return person -> {
            ValidationResult result =  this.apply(person);
            return result.equals(SUCCESS) ? validator.apply(person) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID,
        PHONE_NOT_VALID,
        EMAIL_TAKEN_ERROR,
        NOT_ADULT_ERROR
    }

}
