package martins.dev.javaoneforall.javacore.Dconstructor.test;

import martins.dev.javaoneforall.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Punch Man", "TV", 12, "Finished", "Madhouse");
        anime.print();
    }
}
