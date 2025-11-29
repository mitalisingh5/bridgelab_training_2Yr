import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        //no.to string and store digits
        String numStr = Long.toString(Math.abs(number));
        int n = numStr.length();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        //size 10
        int[] frequency = new int[10];

        //Count
        for (int d : digits) {
            frequency[d]++;
        }

        //output
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " = " + frequency[i]);
            }
        }
    }
}
/*Enter a number: 1122767674

Digit Frequencies:
Digit 1 = 2
Digit 2 = 2
Digit 4 = 1
Digit 6 = 2
Digit 7 = 3 */