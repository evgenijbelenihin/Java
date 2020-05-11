import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++){
            System.out.print("Enter the " + (i+1) +" number: ");
            numbers[i]=scanner.nextInt();
        }
        int tmp;
        tmp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = tmp;

        System.out.println("Now the first number is: "+ numbers[0]);
        System.out.println("Now the second number is: "+ numbers[1]);

    }
}
