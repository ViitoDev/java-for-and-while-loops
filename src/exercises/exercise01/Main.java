package exercises.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the step:");
        int step = input.nextInt();

        for (int i = 1; i <= step; i++) {
            System.out.println("You're in " + i + " step.");
        }
        System.out.println("You complete the steps!");
    }
}
