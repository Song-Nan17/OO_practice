package model;

public class Klass {
    private int number;
    private Student leader;
    private Teacher listener;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (isIn(student)) {
            this.leader = student;
            System.out.println("I am " + this.listener.getName() + ". I know " + student.getName() + " become Leader of Class " + this.number + ".");
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (this.listener != null) {
            System.out.println("I am " + this.listener.getName() + ". I know " + student.getName() + " has joined Class " + this.number + ".");
        }
    }

    public Student getLeader() {
        return this.leader;
    }

    public void setListener(Teacher teacher) {
        this.listener = teacher;
    }

    public Teacher getListener() {
        return this.listener;
    }

    public boolean isIn(Student student) {
        boolean isIn = student.getKlass() == this ? true : false;
        return isIn;
    }
}
