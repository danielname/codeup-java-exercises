import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n",pi);
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//
//        System.out.print("Enter 3 words: ");
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();
//        System.out.println(word2);
//
//        System.out.print("Enter a sentence: ");
//        scanner.nextLine();
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);

        System.out.println("Enter the length of the classroom in feet (numbers only): ");
        String length = scanner.nextLine();

        System.out.println("Enter the width of the classroom in feet (numbers only): ");
        String width = scanner.nextLine();

        System.out.println("Enter the height of the classroom in feet (numbers only): ");
        String height = scanner.nextLine();

        int parsedLength = Integer.parseInt(length);
        int parsedWidth = Integer.parseInt(width);
        int classArea = parsedLength * parsedWidth;
        System.out.println(classArea);

        Double doubleParsedLength = Double.parseDouble(length);
        Double doubleParsedWidth = Double.parseDouble(width);
        Double doubleParsedHeight = Double.parseDouble(height);

        double volume = doubleParsedLength * doubleParsedWidth * doubleParsedHeight;

    }
}
