package martins.dev.javaoneforall.javacore.Cmethodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;

    public void init(String name, int episodes, String type) {
        this.name = name;
        this.episodes = episodes;
        this.type = type;
    }

    public void init(String name, int episodes, String type, String status) {
        this.init(name, episodes, type);
        this.status = status;
    }

    public void print() {
        System.out.println("name: " + this.name);
        System.out.println("type: " + this.type);
        System.out.println("episodes: " + this.episodes);
        System.out.println("status: " + this.status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
