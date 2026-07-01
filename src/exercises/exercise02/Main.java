package exercises.exercise02;

public class Main {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int value : values) {
            sum += value;
        }
        System.out.println("The sum is : " + sum);
    }
}
