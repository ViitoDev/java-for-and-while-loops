package exercises.exercise10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList();

        while (true){
            System.out.println("Enter the guest's name (or 'view' to see the list, 'exit' to finish):");
            String name =  scanner.nextLine().trim();

            if (name.equals("exit")){
                System.out.println("Program concluded!");
                break;
            }

            if (name.equals("view")){
                System.out.println("Guests: " + guests);
                continue;
            }

            boolean existGuest = false;
            for (String guest : guests){
                if (guest.toLowerCase().equals(name.toLowerCase())){
                    existGuest = true;
                    break;
                }
            }

            if (existGuest){
                System.out.println("Guest " + name + " already exists!");
            } else {
                guests.add(name);
                System.out.println("Guest " + name + " successfully entered. \n");
            }
        }
    }
}
