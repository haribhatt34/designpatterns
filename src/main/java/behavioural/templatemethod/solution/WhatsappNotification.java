package behavioural.templatemethod.solution;

public class WhatsappNotification extends NotificationTemplate {
    @Override
    public void createNotification() {
        System.out.println("creating whatsapp notification object...");
    }
    @Override
    public void send() {
        System.out.println("sending whatsapp notification ...");
    }
}
