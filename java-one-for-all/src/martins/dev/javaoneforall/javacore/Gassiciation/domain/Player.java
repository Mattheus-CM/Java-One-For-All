package martins.dev.javaoneforall.javacore.Gassiciation.domain;

public class Player {
    private String name;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Team team) {
        this(name);
        this.team = team;
    }

    public void print() {
        System.out.println("Name: " + name);
        if (team != null) {
            System.out.println("Team: " + team.getName());
        }
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
