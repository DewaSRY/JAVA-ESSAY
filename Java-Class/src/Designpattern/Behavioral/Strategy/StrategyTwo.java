package Designpattern.Behavioral.Strategy;

public class StrategyTwo {
    public static void main(String[] args) {
        System.out.println();
    }
}

class Facebook implements SocialStrategy {
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName +
                " through Facebook");
    }
}

class Instagram implements SocialStrategy {
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName +
                " through Instagram");
    }
}

class SocialMediaContext {
    SocialStrategy socialStrategy;

    public void setSocialStrategy(SocialStrategy socialStrategy) {
        this.socialStrategy = socialStrategy;
    }

    public void connect(String name) {
        socialStrategy.connectTo(name);
    }
}

interface SocialStrategy {
    void connectTo(String friendName);
}

class Twitter implements SocialStrategy {
    @Override
    public void connectTo(String friendName) {
        System.out.println("Connecting to " + friendName +
                " through Twitter");
    }
}
