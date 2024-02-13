package extending;


import java.util.function.Function;

public class EmailValidatorConsumer implements Function<String, Boolean> {

    @Override
    public Boolean apply(String s) {
        return s.contains("@");
    }
}
