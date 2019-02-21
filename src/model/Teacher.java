package model;

import java.util.Arrays;
import java.util.List;

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

    @Override
    public String introduce() {
        String introduction = super.introduce() + " I am a Teacher. I teach ";
        if (this.klasses.length == 0) {
            introduction += "No Class.";
        } else {
            String klassNumbers = "";
            for (Klass klass : this.klasses) {
                klassNumbers += klass.getNumber() + ", ";
            }
            introduction += "Class " + klassNumbers.substring(0, klassNumbers.length() - 2) + ".";
        }
        return introduction;
    }
}
