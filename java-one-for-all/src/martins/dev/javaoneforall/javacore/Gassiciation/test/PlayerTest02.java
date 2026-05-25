package martins.dev.javaoneforall.javacore.Gassiciation.test;

import martins.dev.javaoneforall.javacore.Gassiciation.domain.Player;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team1 = new Team("Santos");

        player1.setTeam(team1);

        player1.print();
    }
}
