package model;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private Klass[] klasses;

    public Teacher(int id, String name, int age, Klass[] klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public Klass[] getKlasses() {
        return this.klasses;
    }

    public void setKlasses(Klass[] klasses) {
        this.klasses = klasses;
    }
}
