import java.util.Scanner;
public class Person {
//    public Person(String name){
//        return //something;
//    }
    private String name;

    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        return scanner.next();
    }

//    public void setName(String name){
//        return name;
//    }
    public static void sayHello(){
        System.out.printf("Hello %s!%n",getName());
    }
    public static void main(String[] args) {
        sayHello();
    }
}
