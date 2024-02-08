import email.EmailSender;

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
    }
}