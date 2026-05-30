package martins.dev.javaoneforall.javacore.Npolymorphism.test;

import martins.dev.javaoneforall.javacore.Npolymorphism.repository.Repository;
import martins.dev.javaoneforall.javacore.Npolymorphism.service.DatabaseRepositoryService;
import martins.dev.javaoneforall.javacore.Npolymorphism.service.FileRepositoryService;
import martins.dev.javaoneforall.javacore.Npolymorphism.service.InMemoryRepositoryService;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new FileRepositoryService();
        repository.save();

        List<String> names = new ArrayList<>();
        names.add("Naruto");
        names.add("Sakura");
        names.add("Sasuke");
        System.out.println(names);
    }
}
