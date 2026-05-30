package martins.dev.javaoneforall.javacore.Gassiciation.test;

import martins.dev.javaoneforall.javacore.Gassiciation.domain.Player;
import martins.dev.javaoneforall.javacore.Gassiciation.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Neymar");
        Team team1 = new Team("Brasil");

        team1.setPlayers(new Player[]{player1, player2});

        player1.setTeam(team1);
        player2.setTeam(team1);

        System.out.println("---------- Player -----------");
        player1.print();
        player2.print();
        System.out.println("---------- Team -----------");
        team1.print();
    }
}
