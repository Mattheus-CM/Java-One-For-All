package martins.dev.javaoneforall.javacore.Npolymorphism.service;

import martins.dev.javaoneforall.javacore.Npolymorphism.repository.Repository;

public class InMemoryRepositoryService implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in the memory");
    }
}
