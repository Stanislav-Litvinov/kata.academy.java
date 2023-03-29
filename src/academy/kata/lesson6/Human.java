package academy.kata.lesson6;

public class Human {
    private final String secret; //секретики
    private final String experience; //опыт
    private final String gossip; //сплетни
    private final String news; //новости

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    private String getSecret() {
        return secret;
    }

    public String getNews() {
        return news;
    }

    protected String getExperience() {
        return experience;
    }

    String getGossip() {
        return gossip;
    }
}
