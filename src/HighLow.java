import java.util.Random;
import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        // nextInt(bound) returns 0 to (bound - 1)
        int answer = rnd.nextInt(100) + 1;

        // i is going to keep track of guesses with the upper condition being the limit of how many the player is allower
        for (int i = 0; i < 5; i++) {
            int guess = getGuessFromUser();

            if (guess < answer) {
                System.out.println("HIGHER");
                continue;
            } else if (guess > answer) {
                System.out.println("LOWER");
                continue;
            } else {
                System.out.println("GOOD GUESS!");
                System.exit(0);
            }
        }

        System.out.println("You lose!");
    }
        private static int getGuessFromUser () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number from 1 to 100");
            int aNum = scanner.nextInt();
            scanner.nextLine();
            return aNum;
        }

}