package interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctioTwo {
    public static void main(String[] args) {
        consumer.accept("alejo@gmail.com");
        List<String> emails = List.of("alejo@gmail.com","malg@hotmail");
        biConsumer.accept("alejo@gmail.com","malg@hotmail");
        System.out.println(String.format("the value is %s",isValidEmailPredicate.test("alejo@gmail.com")));
        System.out.println(String.format("the values are %s",isValidEmailBiPredicate.test("alejo@gmail.com","malg.nmg@hotmail.com")));
        boolean test = isValidEmailPredicate.or(isValidEmailPredicate).test("alejo@gmail.com");
        System.out.println(getUrlSupplier.get());
    }

    static Consumer<String> consumer = email -> System.out.println("Sending email to: " + email);
    static BiConsumer<String,String> biConsumer = (from, to) -> System.out.println(String.format("Email sending from %s to %s", from,to));
    static Predicate<String> isValidEmailPredicate = email -> email.contains("@");
    static BiPredicate<String,String> isValidEmailBiPredicate = (from,to) -> from.contains("@") && to.contains("@");
    static Supplier<String> getUrlSupplier = () -> "alejourl";
}
