package martins.dev.javaoneforall.javacore.Bintroductionmethods.domain;

public class Student {
    public short age;
    public String name;
    public char gender;

    public void print(){
        System.out.println("--------------------------");
        System.out.println("Student");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }
}
