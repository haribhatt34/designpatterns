package behavioural.templatemethod.solution;

public class Main {
    public static void main(String[] args) {
        NotificationTemplate template = new SmsNotification();
        template.sendNotification();
        System.out.println("\n-----------------------\n");

        NotificationTemplate template2 = new WhatsappNotification();
        template2.sendNotification();
    }
}
