package martins.dev.javaoneforall.javacore.Gassiciation.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminar;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String researchField) {
        this(name);
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminar) {
        this(name, researchField);
        this.seminar = seminar;
    }

    public void print() {
        System.out.println("--- Professor ---");
        System.out.println("Name: " + this.name);
        System.out.println("Research Field: " + this.researchField);
        if (this.seminar == null) return;
        for (Seminar seminar : this.seminar) {
            seminar.print();
        }
    }

    public String getName() {
        return name;
    }

    public String getResearchField() {
        return researchField;
    }

    public Seminar[] getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar[] seminar) {
        this.seminar = seminar;
    }
}
