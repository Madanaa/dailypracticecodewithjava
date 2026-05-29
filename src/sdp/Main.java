package sdp;

public class Main {
    public static void main(String[] args) {

        Notification notification = NotificationFactory.createNotification("xyz");
        notification.send();
    }
}
