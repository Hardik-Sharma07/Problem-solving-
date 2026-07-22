import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum = 0;

        number = Math.abs(number);

        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}

