import java.util.Scanner;

public class LargestTwoDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //Extract digits
        while (number != 0) {
            int digit = (int)(number % 10);
            number = number / 10;

            if (index == maxDigit) {
                break;
            }
            digits[index] = digit;
            index++;
        }

        //Initialize largest and second largest
        int largest = -1, secondLargest = -1;

        // second largest
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        //output
        System.out.println("Largest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist.");
        }
    }
}
/*Enter a number: 638777777383
Largest digit = 8
Second largest digit = 7 */
