import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalNumbers = input.nextInt();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < totalNumbers; i++) {
            int value = input.nextInt();
            if (value % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
