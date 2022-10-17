package behavioural.templatemethod.problem;

public class WhatsappNotification extends NotificationTemplate {
    @Override
    public void fetchMessageHeading() {
        // Nothing to fetch for whatsapp
    }

    @Override
    public void send() {
        System.out.println("sending Whatsapp notification ...");
    }
}
