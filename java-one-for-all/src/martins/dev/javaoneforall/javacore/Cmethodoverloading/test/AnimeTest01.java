package martins.dev.javaoneforall.javacore.Cmethodoverloading.test;

import martins.dev.javaoneforall.javacore.Cmethodoverloading.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Punch Man", 12, "TV");

        anime.print();

    }
}
