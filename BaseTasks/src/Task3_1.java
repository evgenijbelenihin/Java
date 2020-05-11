import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Enter numbers separated by a space: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] strNumbers = str.split(" ");
        int[] numbers = new int[strNumbers.length];

        try
        {
            for(int i = 0; i < strNumbers.length; i++) numbers[i] = Integer.parseInt(strNumbers[i]);
        }
        catch(Exception e)
        {
            System.out.println("Not all of the entered values are numbers.");
        }

        if (numbers.length < 2) System.out.println("You entered less than 2 numbers");
        else
            {
            System.out.println("Quantity of odd numbers: "+GetQuantityOfOddNumbers(numbers));
            System.out.println("Quantity of even numbers: "+GetQuantityOfEvenNumbers(numbers));
            }

    }

    private static int GetQuantityOfOddNumbers(int[] numbers)
    {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) count++;
        }
        return count;
    }

    private static int GetQuantityOfEvenNumbers(int[] numbers)
    {
        int count = 0;
        for (int number : numbers) {
            if (number != 0 && number % 2 == 0) count++;
        }
        return count;
    }


}
