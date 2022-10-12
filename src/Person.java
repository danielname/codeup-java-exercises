import java.util.Scanner;
public class Person {
    public Person(String a){
        setName(a);
    }
    private static String name;
    public static String getName(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String dnInputName = scanner.next();
//        setName(dnInputName);
//        return dnInputName;
        return Person.name;
    }

    public static void setName(String name){
        Person.name = name;
        //need to set person.name to any name inputted as the argument.
    }
    public static void sayHello(){
        System.out.printf("Hello %s!%n",getName());
    }
    public static void main(String[] args) {
//        sayHello();
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

}
