import model.Klass;
import model.Person;
import model.Student;
import model.Teacher;

public class Test {
    public static void main(String[] args) {
        Person person = new Person(1, "Tom", 21);
        Klass klass = new Klass(2);
        Klass anotherKlass = new Klass(3);
        Klass otherKlass = new Klass(4);
        Student student = new Student(1, "Tom", 21, klass);
        Student anotherStudent = new Student(2, "Jerry", 20, klass);
        Student otherStudent = new Student(3, "Mike", 20, otherKlass);
        Klass[] klasses = {klass, anotherKlass};
        Teacher teacher = new Teacher(1, "Tom", 21, klasses);
        klass.setListener(teacher);
        anotherKlass.setListener(teacher);
        Teacher anotherTeacher = new Teacher(1, "Tom", 21, new Klass[0]);

        System.out.println("Person: ");
        System.out.println("should have field name and age");
        System.out.println(person.getName() == "Tom");
        System.out.println(person.getAge() == 21);
        System.out.println("should have a method introduce, introduce person with name and age");
        System.out.println(person.introduce().equals("My name is Tom. I am 21 years old."));
        System.out.println();

        System.out.println("Student:");
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
        System.out.println();

        System.out.println("Teacher:");
        System.out.println("should have field name, age and class number");
        System.out.println(teacher.getName() == "Tom");
        System.out.println(teacher.getAge() == 21);
        System.out.println(teacher.getKlasses().length == klasses.length);
        System.out.println(teacher.getKlasses()[0] == klasses[0]);
        System.out.println(teacher.getKlasses()[1] == klasses[1]);
        System.out.println("#introduce");
        System.out.println("should overwrite Person introduce, introduce with name, age and class number, given teacher have class");
        System.out.println(teacher.introduce().equals("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."));
        System.out.println("should overwrite Person introduce, introduce with name, age and class number, given teacher have no class");
        System.out.println(anotherTeacher.introduce().equals("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
        System.out.println();

        System.out.println("Class:");
        System.out.println("should have class number");
        System.out.println(klass.getNumber() == 2);
        System.out.println("#assignLeader");
        System.out.println("should assign student as Leader, given student is class member");
        System.out.println(klass.getLeader() == student);
        System.out.println("should not assign student as Leader, given student is not class member");
        System.out.println("Output(Expected \"It is not one of us.\"):");
        otherKlass.assignLeader(student);
        System.out.println(otherKlass.getLeader() != student);
        System.out.println("should notify assign leader listeners");
        System.out.println("Output(Expected \"I am Tom. I know Jerry become Leader of Class 2.\"):");
        klass.assignLeader(anotherStudent);
        System.out.println("#appendMemeber");
        System.out.println("##should change student's klass attribute");
        System.out.println(otherStudent.getKlass() == otherKlass);
        System.out.println("###should notify join listeners");
        System.out.println("Output(Expected \"I am Tom. I know Jerry has joined Class 2.\"):");
        klass.appendMember(otherStudent);
        System.out.println(otherStudent.getKlass() == klass);
    }
}
