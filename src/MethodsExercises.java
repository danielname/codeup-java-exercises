import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }
    public static int multiplicationBonus(int a, int b){
        int dnAValue = a;
        for (int i = 1; i < b; i++){
            dnAValue += a;
        }
        return dnAValue;
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        int dnNumberPick = scanner.nextInt();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getInteger(min, max);
    }
    public static int factorial(int a){
        int x = a;
        for (int i = 1; i < a; i++){
            x *= i;
        }
        return x;
    }
//    private static int dice(int a){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("would you like to roll the dice? y/n");
//        char dnDiceChoice = scanner.next().charAt(0);
//        int dnFirstDie;
//        int dnSecondDie;
//        if (dnDiceChoice == 'y'){
//            dnFirstDie = (int) (Math.random() * a) + 1;
//            dnSecondDie = (int) (Math.random() * a) + 1;
//            System.out.printf("The first die rolled %s, and the second landed on %s giving you a total of %s.%n",dnFirstDie,dnSecondDie,(dnFirstDie + dnSecondDie));
//        }else {
//            System.out.println("ok :(");
//        }
//        System.out.println("would you like to roll again? y/n");
//        char dnReroll = scanner.next().charAt(0);
//        if (dnReroll == 'y'){
//            return dice(a);
//        } else {
//            return (dnFirstDie + dnSecondDie);
//        }
//    }
}
