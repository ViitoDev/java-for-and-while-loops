package exercises.exercise07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter your name : ");
            String name = input.nextLine();
            if (name.length() < 3 || name == "") {
                System.out.println("Invalid name! Enter the name again. \n");
            } else {
                System.out.println("Name " + name + "   successfully entered. \n");
                break;
            }
        }
    }
}
