import model.Person;

public class Test {
    public static void main(String[] args) {
        System.out.println("Person: ");
        Person person = new Person(1, "Tom", 21);
        System.out.println("should have field name and age");
        System.out.println(person.getName() == "Tom");
        System.out.println(person.getAge() == 21);
        System.out.println("should have a method introduce, introduce person with name and age");
        System.out.println(person.introduce().equals("My name is Tom. I am 21 years old."));
        System.out.println(person.introduce());
    }
}
