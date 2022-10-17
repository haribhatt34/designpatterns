package behavioural.templatemethod.solution;

// SMS, Email, Whatsapp, Push Notification
public abstract class NotificationTemplate {

    // same for all
    public void checkDnd() {
        System.out.println("checking if Dnd is enabled... ");
    }

    // same for all
    public void fetchContent() {
        System.out.println("fetching content...");
    }

    // same for all
    public abstract void createNotification();

    // different logic,
    // sms through vendors like kaleyra, whatsapp through api calls to fb,
    // push notification through android/ios server & email through aws or smtp
    public abstract void send();

    public final void sendNotification() {
        checkDnd();
        fetchContent();
        createNotification();
        send();
    }
}
