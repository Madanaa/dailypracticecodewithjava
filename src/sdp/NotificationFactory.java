package sdp;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if (type==null || type.isEmpty()){
            return null;
        }
        if (type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        throw  new  IllegalArgumentException("Unknown Notification: "+type);
    }
}
