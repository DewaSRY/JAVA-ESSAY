package Designpattern.Creation.Factory;

public class NotificationMaker {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        notification.notifyUser();
    }
}

interface Notification {
    void notifyUser();
}

class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email");
    }
}

class NotificationFactory {

    public Notification createNotification(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }

        switch (name) {
            case "SMS":
                return new SMS();
            case "EMAIL":
                return new Email();
            case "PUSH":
                return new PushNot();

            default:
                throw new IllegalArgumentException("Unknown Notification Service");
        }

    }
}

class PushNot implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}

class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS");
    }
}
