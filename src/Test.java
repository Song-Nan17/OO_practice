import model.Klass;
import model.Person;
import model.Student;

public class Test {
    public static void main(String[] args) {
        System.out.println("Person: ");
        Person person = new Person(1, "Tom", 21);
        System.out.println("should have field name and age");
        System.out.println(person.getName() == "Tom");
        System.out.println(person.getAge() == 21);
        System.out.println("should have a method introduce, introduce person with name and age");
        System.out.println(person.introduce().equals("My name is Tom. I am 21 years old."));
        System.out.println();

        System.out.println("Student:");
        Klass klass = new Klass(2);
        Student student = new Student(1, "Tom", 21, klass);
        System.out.println("should have field name, age and class number");
        System.out.println(student.getName() == "Tom");
        System.out.println(student.getAge() == 21);
        System.out.println(student.getKlass() == klass);
        System.out.println("#introduce");
        System.out.println("should overwrite Person introduce, introduce with name, age and class number");
        System.out.println(student.introduce().equals("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
        System.out.println("should print Leader role, given student is leader");
        klass.assignLeader(student);
        System.out.println(student.introduce().equals("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2."));
    }
}
