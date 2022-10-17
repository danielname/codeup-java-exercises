package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("Maquis_the_coder", new Student("Deshawn"));
        students.put("Pfirewire", new Student("Stephen"));
        students.put("nightzilla", new Student("Danny"));
        students.put("WoodyMas", new Student("Mason"));
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
    }
}
