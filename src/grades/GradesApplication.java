package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
        STUDENTSAPP:
        while(true) {
            for (Map.Entry<String, Student> student : students.entrySet()) {
                String key = student.getKey();
                System.out.printf("|%s|", key);
            }
            System.out.println("\nWhat student would you like to see more information on? For all student grades type \"all\"");
            String studentChoice = scanner.nextLine();
            if (!students.containsKey(studentChoice) && !Objects.equals(studentChoice, "all")) {
                System.out.println("sorry, nobody with that username was found.");
            } else if (studentChoice.equals("all")){
                double accum = 0;
                for (Map.Entry<String, Student> student : students.entrySet()) {
                    String key = student.getValue().getName();
                    System.out.printf("%s's grades:%n", key);
                    for(int i = 0; i < students.get(student.getKey()).getGrades().size(); i++){
                        int gradeItem = students.get(student.getKey()).getGrades().get(i);
                        System.out.printf("Assignment %d: %s%n", i+1, gradeItem);
                    };
                    System.out.println("--------------------");
                }
                for (Map.Entry<String, Student> student : students.entrySet()) {
                    double key = student.getValue().getGradeAverage();
                    accum += key;
                }
                System.out.printf("The class average is %s.%n", accum / students.size());
            }else {
                System.out.printf("""
                        Name: %s - GitHub Username: %s%n
                        Current Average: %s%n""", students.get(studentChoice).getName(), studentChoice, students.get(studentChoice).getGradeAverage());
                //for loop that
                for (int i = 0; i < students.get(studentChoice).getGrades().size(); i++) {
                    int gradeItem = students.get(studentChoice).getGrades().get(i);
                    System.out.printf("Assignment %d: %s%n", i + 1, gradeItem);
                }
            }
                System.out.println("Would you like to see another student? y/n");
                char anotherStudent = scanner.next().charAt(0);
                if (anotherStudent == 'y') {
                    continue;
                } else {
                    System.out.println("ok, have a nice day!");
                    break;
                }
        }
    }
}
