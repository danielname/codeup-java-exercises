package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static java.util.Map.entry;


public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();
        students.put("Maquis_the_coder", new Student("Deshawn"));
        students.put("Pfirewire", new Student("Stephen"));
        students.put("nightzilla", new Student("Danny"));
        students.put("WoodyMas", new Student("Mason"));

//        HashMap<String, Student> students = (HashMap<String, Student>) Map.ofEntries(
//                entry("Maquis_the_coder", new Student("Deshawn")),
//                entry("Pfirewire", new Student("Stephen")),
//                entry("nightzilla", new Student("Danny")),
//                entry("WoodyMas", new Student("Mason"))
//        );

        students.get("Maquis_the_coder").addGrade(100);
        students.get("Maquis_the_coder").addGrade(98);
        students.get("Maquis_the_coder").addGrade(90);
        students.get("Pfirewire").addGrade(100);
        students.get("Pfirewire").addGrade(100);
        students.get("Pfirewire").addGrade(88);
        students.get("nightzilla").addGrade(70);
        students.get("nightzilla").addGrade(75);
        students.get("nightzilla").addGrade(80);
        students.get("WoodyMas").addGrade(85);
        students.get("WoodyMas").addGrade(80);
        students.get("WoodyMas").addGrade(90);

        System.out.println("""
                           Welcome!\n
                           Here are the GitHub usernames of our students:\n
                           |Maquis_the_coder| |Pfirewire| |nightzilla| |WoodyMas|\n
                           What student would you like to see more information on?""");
        String studentChoice = scanner.nextLine();
        if (!students.containsKey(studentChoice)){
            System.out.println("sorry, nobody with that username was found. Would you like to try again? y/n");
        } else {
            System.out.printf("""
                            Name: %s - GitHub Username: %s%n
                            Current Average: %s%n
                            %nWould you like to see another student? y/n%n""", students.get(studentChoice).getName(), studentChoice, students.get(studentChoice).getGradeAverage());
            char anotherStudent = scanner.next().charAt(0);
            if (anotherStudent == 'y'){
                System.out.println("too bad.");
            } else {
                System.out.println("ok, have a nice day!");
            }
        }
    }
}
