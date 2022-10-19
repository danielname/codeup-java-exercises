package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;
    static String getString(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Input a string: ");
        return scanner1.nextLine();
    }
    static boolean yesNo(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("yes or no?");
        return scanner1.next().charAt(0) == 'y';
    }
    static int getInt(int min, int max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        int dnNumberPick = scanner1.nextInt();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getInt(min, max);
    }
    static int getInt(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            return Integer.parseInt(getString());
        } catch (Exception e) {
            System.out.println("Try again");
            return getInt();
        }
    }
    static double getDouble(double min, double max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        double dnNumberPick = scanner1.nextDouble();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getDouble(min, max);
    }
    static double getDouble(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            return Double.parseDouble(getString());
        } catch (Exception e) {
            System.out.println("Try again");
            return getDouble();
        }
    }

    public static void main(String[] args) {

    }
}
