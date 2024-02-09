import email.EmailSender;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailSender hotmail = (from,to) ->
        {
            System.out.println("por aca");
            return from.contains("@hotmail");
        };
        EmailSender gmail = (from,to) -> true;

        hotmail.send("malg@hotmail.com","alejo5@gmail.com");
        gmail.send("alejo5@gmail.com","malg@hotmail.com");

        String[] names = {"Manu","Alejo","Lopez","Gutierrez"};
        List<String> names2 = List.of("Manu","Alejo","Lopez","Gutierrez");
        for (String name: names) {
            System.out.println(name);
        }
        names2.forEach(x -> System.out.println(x));
        //metodo de referencia
        names2.forEach(System.out::println);

    }
}