import java.lang.reflect.Array;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.print("Enter the " + (i+1) +" number: ");
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Maximum from three entered numbers is: "+ GetMaxFromThreeNumbers(numbers[0],numbers[1],numbers[2]));

    }

    private static int GetMaxFromThreeNumbers(int firstNumber, int secondNumber, int thirdNumber)
    {
        int max = firstNumber;
        if (secondNumber > max) max = secondNumber;
        if (thirdNumber > max) max = thirdNumber;
        return max;
    }

}
