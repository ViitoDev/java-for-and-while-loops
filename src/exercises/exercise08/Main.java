package exercises.exercise08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;

        while (true) {
            System.out.println("Enter a number (or 'finish' to end): ");
            String input = scanner.nextLine();

            if (input.equals("finish")) {
                break;
            }

            int number = Integer.parseInt(input);

            if (number < 0) {
                positive++;
            } else if (number > 0) {
                negative++;
            }

            System.out.println("\nPositive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
        }
    }
}
