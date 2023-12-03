package Designpattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class News {

}

interface Channel {
    public void update(Object o);
}

// Observable
class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    // Updating the news
    public void setNews(String news) {
        this.news = news;

        // Notify All the channels for the breaking news
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }

}

class NewsChannel implements Channel {

    public String news;
    NewsAgency newsAgency = new NewsAgency();

    @Override
    public void update(Object o) {
        newsAgency.setNews((String) news);
        System.out.println("News Updated! ");
    }
}
