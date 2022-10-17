package behavioural.templatemethod.problem;

public class Main {
    public static void main(String[] args) {
        NotificationTemplate template = new WhatsappNotification();
        template.sendNotification();
        System.out.println("\n\n-----------------------\n\n");

        NotificationTemplate template2 = new WhatsappNotification();
        template2.sendNotification();
    }
}
