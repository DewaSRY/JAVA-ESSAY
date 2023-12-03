package Designpattern.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatManager {
    public static void main(String[] args) {
        System.out.println();
        ChatMediator mediator = new ChatMediatorConcrete();

        User user1 = new UserConcrete(mediator, "Jack");
        User user2 = new UserConcrete(mediator, "John");
        User user3 = new UserConcrete(mediator, "Sara");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello World!");

    }
}

interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);

}

class ChatMediatorConcrete implements ChatMediator {
    private List<User> users;

    public ChatMediatorConcrete() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {

        for (User u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}

abstract class User {
    ChatMediator mediator;
    String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

}

class UserConcrete extends User {

    public UserConcrete(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + " : Sending Message " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " : Received Message: " + msg);
    }
}
