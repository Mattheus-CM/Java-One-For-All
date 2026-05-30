package martins.dev.javaoneforall.javacore.Einitializationblock.test;

import martins.dev.javaoneforall.javacore.Einitializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
        System.out.println();
        
        Anime anime2 = new Anime();
    }
}
