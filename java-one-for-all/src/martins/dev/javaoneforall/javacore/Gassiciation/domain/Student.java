package martins.dev.javaoneforall.javacore.Gassiciation.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println();
        System.out.println("--- Student ---");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if (this.seminar == null) return;
        this.seminar.print();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
