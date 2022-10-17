package behavioural.templatemethod.solution;

public class SmsNotification extends NotificationTemplate{
    @Override
    public void createNotification() {
        System.out.println("creating sms notification object...");
    }
    @Override
    public void send() {
        System.out.println("sending sms notification ...");
    }
}
