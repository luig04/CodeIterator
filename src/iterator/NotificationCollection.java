package iterator;

public class NotificationCollection implements Collection {


    static final int MAX_ITEMS = 6;
    int numberOfIems = 0;
    Notification[]notificationList;

    public NotificationCollection() {
        notificationList =
        new Notification[MAX_ITEMS];

        //let us add some dummy notifications
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public void addItem(String str) {
        Notification notification =
        new Notification(str);
        //  Verifico si ya lleno la lista
            if(numberOfIems >= MAX_ITEMS) {
            System.err.println("Full");
        }else {
            notificationList[numberOfIems] =
            notification;
            //Incremento el contador de items
            numberOfIems = numberOfIems + 1;
        }
    }
        public Iterator creatorIterator(){
        return new NotificationIterator(
            notificationList);
    }
}
