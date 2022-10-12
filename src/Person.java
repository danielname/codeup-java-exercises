import java.util.Scanner;
public class Person {
    public static void main(String[] args) {

    }
    public Person(String name){
        return //something;
    }
    private String name;

    public String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        return scanner.next();
    }

    public void setName(String name){
        name = getName();
        return name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
    }
}
