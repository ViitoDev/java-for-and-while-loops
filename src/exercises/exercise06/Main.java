package exercises.exercise06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctPassword = 12345;



        for (int attempts = 3; attempts > 0; attempts--) {
            System.out.println("Enter Your Password: ");
            int password = input.nextInt();

            if (password == correctPassword) {
                System.out.println("Password Correct!");
                break;
            } else if (attempts > 1) {
                System.out.println("Wrong Password! You have " + (attempts - 1) + " attempts left.\n");
            } else {
                System.out.println("Blocked account!");
            }
        }
    }
}
