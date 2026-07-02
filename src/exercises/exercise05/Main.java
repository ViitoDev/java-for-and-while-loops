package exercises.exercise05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers separated by spaces : ");
        String[] numbers = input.nextLine().split(" ");
        int higher = Integer.MIN_VALUE;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num > higher) {
                higher = num;
            }
        }
        System.out.println("The higher number is : " + higher);
    }
}
