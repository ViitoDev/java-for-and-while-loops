package exercises.exercise09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
