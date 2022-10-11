import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n",pi);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);

        System.out.print("Enter 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word2);

        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println(sentence);


    }
}
