import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15){
//            i++;
//            System.out.println(i);
//        }
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        }while (i < 100);
//        do {
//            i -= 5;
//            System.out.println(i);
//        }while (i > -10);
//        i += 12;
//        System.out.println(i);
//        do {
//            i = i * i;
//            System.out.println(i);
//        }while (i < 50000);
//        for (int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        for (int i = 0; i < 100; i += 2){
//            System.out.println(i);
//        }
//        for (int i = 100; i > -15; i -= 5){
//            System.out.println(i);
//        }
//        for (int i = 2; i < 50000; i = i * i){
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i++){
//            if(i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
        Scanner scanner = new Scanner(System.in);
        char answer;
//        do {
//        System.out.println("What number would you like to go up to? ");
//        int tableLimit = scanner.nextInt();
//        System.out.printf("Here is your table!%n%nnumber    |squared   |cubed     %n----------|----------|----------%n");
//        for (int i = 1; i <= tableLimit; i++){
//            System.out.println(i + "         |" + (i * i) + "         |" + (i * i * i));
//        }
//        System.out.println("Would you like to continue? y/n");
//        answer = scanner.next().charAt(0);
//        } while (answer == 'y');
        do {
            System.out.println("Enter a numeric grade from 0-100: ");
            int dnNumGrade = scanner.nextInt();
            if (dnNumGrade > 87) {
                System.out.println("Your grade is an A!");
                // for now i am copy/pasting, but in theory the following should be a function
                System.out.println("Would you like to continue? y/n");
                answer = scanner.next().charAt(0);
            } else if (dnNumGrade > 79) {
                System.out.println("Your grade is a B!");
                System.out.println("Would you like to continue? y/n");
                answer = scanner.next().charAt(0);
            } else if (dnNumGrade > 66) {
                System.out.println("Your grade is a C!");
                System.out.println("Would you like to continue? y/n");
                answer = scanner.next().charAt(0);
            } else if (dnNumGrade > 59) {
                System.out.println("Your grade is a D!");
                System.out.println("Would you like to continue? y/n");
                answer = scanner.next().charAt(0);
            } else {
                System.out.println("Your grade is an F!");
                System.out.println("Would you like to continue? y/n");
                answer = scanner.next().charAt(0);
            }
        }while(answer == 'y');
    }
}
