package model;

public class Student extends Person {
    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String introduction = super.introduce() + " I am a Student. I am ";
        introduction += this.klass.getLeader() == this ? "Leader of Class " : "at Class ";
        introduction += this.klass.getNumber() + ".";
        return introduction;
    }
}
