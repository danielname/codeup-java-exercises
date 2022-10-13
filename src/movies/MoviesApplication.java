package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                What would you like to do?

                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category""");
        byte dnUserChoice = scanner.nextByte();
        if (dnUserChoice == 5) {
            for (datatype item : array) {
                if (item.setCategory().equals("scifi")) {
                    System.out.printf("%s -- %s", item.setName(), item.setCategory());
                }
            }
            } else if (dnUserChoice == 4) {
                for (datatype item : array) {
                    if (item.setCategory().equals("scifi")) {
                        System.out.printf("%s -- %s", item.setName(), item.setCategory());
                    }
                }
            } else if (dnUserChoice == 3) {
                    for (datatype item : array) {
                        if (item.setCategory().equals("scifi")) {
                            System.out.printf("%s -- %s", item.setName(), item.setCategory());
                        }
                    }
            } else if (dnUserChoice == 2) {
                        for (datatype item : array) {
                            if (item.setCategory().equals("scifi")) {
                                System.out.printf("%s -- %s", item.setName(), item.setCategory());
                            }
                        }
            } else if (dnUserChoice == 1) {
            for (datatype item : array) {
                System.out.printf("%s -- %s", item.setName(), item.setCategory());
            }
        }else {

            }
        }
    }
}