package iterator;

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(){
        this.notifications= new NotificationCollection();
    }

    public void printlnNotifications(){
        Iterator iterator= notifications.creatorIterator();
        System.out.println(
            "---------------------NOTIFICATION BAR-----------------------------");
            while (iterator.hasNext()) {
                Notification n =(Notification) iterator.next();
                System.out.println(n.getNotification());
            }
    }
}
