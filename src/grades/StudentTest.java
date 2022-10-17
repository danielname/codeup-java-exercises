package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student james = new Student("James");
        james.addGrade(90);
        james.addGrade(79);
        james.addGrade(95);
        james.addGrade(67);
        System.out.printf("%s has a %s average.%n", james.getName(), james.getGradeAverage());
    }
}
