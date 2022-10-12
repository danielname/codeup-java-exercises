package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    String getString(){

    }
    boolean yesNo(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("yes or no?");
        return scanner1.next().charAt(0) == 'y';
    }
    int getInt(int min, int max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        int dnNumberPick = scanner.nextInt();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getInt(min, max);
    }
    int getInt(){

    }
    double getDouble (double min, double max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Pick a number between %s and %s: %n", min, max);
        double dnNumberPick = scanner.nextDouble();
        if (dnNumberPick > min && dnNumberPick < max){
            return dnNumberPick;
        } else return getDouble(min, max);
    }
    double getDouble (){

    }

    public static void main(String[] args) {

    }
}
