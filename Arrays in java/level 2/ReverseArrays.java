import java.util.Scanner;

public class ReverseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        String numStr = Long.toString(Math.abs(number));
        int n = numStr.length();
        int[] digits = new int[n];

        // Store digits
        for (int i = 0; i < n; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        //output
        System.out.print("\nReversed Number: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
/*Enter a number: 123456
Reversed Number: 654321 */
