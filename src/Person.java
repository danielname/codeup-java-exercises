import java.util.Scanner;
public class Person {
    public Person(String a){
        this.setName(a);
    }
    private String name;
    public String getName(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String dnInputName = scanner.next();
//        setName(dnInputName);
//        return dnInputName;
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        //need to set person.name to any name inputted as the argument.
    }
    public void sayHello(){
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
