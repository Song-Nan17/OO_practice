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
            this.listener.notifyAssigningLeader();
        } else {
            System.out.println("It is not one of us.");
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
