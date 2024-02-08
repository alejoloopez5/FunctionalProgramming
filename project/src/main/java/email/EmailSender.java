package email;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
