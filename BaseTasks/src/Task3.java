import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
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
        else System.out.println("The first odd number is: "+GetFirstOddNumber(numbers));
    }

    private static int GetFirstOddNumber(int[] numbers)
    {
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 != 0) return numbers[i];
        }
        return 0;
    }
}
