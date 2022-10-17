package behavioural.templatemethod.problem;

// SMS, Email, Whatsapp, Push Notification
public abstract class NotificationTemplate {

    // same logic for all - put in default method
    // check if user has enabled DND for current time, ir-respective of type of notification
    public boolean isDndEnabled() {
        // Go to user profile and check
        System.out.println("checking if Dnd is enabled... ");
        System.out.println("dnd is not enabled");
        return false;
    }

    // only required for email, push notification
    public abstract void fetchMessageHeading();

    // same for all
    public void fetchMessageBody() {
        System.out.println("fetching message body...");
    }

    // same for all
    public void createNotification() {
        System.out.println("creating notification object...");
    }

    // different logic,
    // sms through vendors like kaleyra, whatsapp through api calls to fb,
    // push notification through android/ios server & email through aws or smtp
    public abstract void send();

    public final void sendNotification() {
        if(isDndEnabled()) {
            System.out.println("Can't send notification, Dnd is enabled");
            return;
        }
        fetchMessageHeading();
        fetchMessageBody();
        createNotification();
        send();
    }
}
