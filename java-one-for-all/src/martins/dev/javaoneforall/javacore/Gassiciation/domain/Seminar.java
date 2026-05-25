package martins.dev.javaoneforall.javacore.Gassiciation.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private Place place;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Student[] students, Place place) {
        this(title);
        this.students = students;
        this.place = place;
    }

    public void print() {
        System.out.println();
        System.out.println("--- Seminar ---");
        System.out.println("Title: " + this.title);
        if (this.place == null) return;
        place.print();
        if (this.students == null) return;
        for (Student student : this.students) {
            student.print();
        }
    }

    public String getTitle() {
        return title;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
