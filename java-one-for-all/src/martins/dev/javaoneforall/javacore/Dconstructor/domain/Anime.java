package martins.dev.javaoneforall.javacore.Dconstructor.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String status;
    private String studio;

    public Anime() {
        System.out.println("Anime constructor");
    }

    public Anime(String name, String type, int episodes, String status) {
        this();
        this.episodes = episodes;
        this.type = type;
        this.name = name;
        this.status = status;
    }

    public Anime(String name, String type, int episodes, String status, String studio) {
        this(name, type, episodes, status);
        this.studio = studio;
    }

    public void print() {
        System.out.println("name: " + this.name);
        System.out.println("type: " + this.type);
        System.out.println("episodes: " + this.episodes);
        System.out.println("status: " + this.status);
        System.out.println("studio: " + this.studio);
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
