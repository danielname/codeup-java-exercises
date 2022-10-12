package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;
    String getString(){
        return scanner.nextLine();
    }
    static boolean yesNo(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("yes or no?");
        return scanner1.next().charAt(0) == 'y';
    }
    int getInt(int min, int max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        int dnNumberPick = scanner1.nextInt();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getInt(min, max);
    }
    static int getInt(){
        return scanner.nextInt();
    }
    static double getDouble(double min, double max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        double dnNumberPick = scanner1.nextDouble();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getDouble(min, max);
    }
    double getDouble (){
        return scanner.nextDouble();
    }

    public static void main(String[] args) {

    }
}
