import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Check numbers
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        // Compare first and last
        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last elements are Equal");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater");
        } else {
            System.out.println("Last element is Greater");
        }
    }
}
/*Enter number 1: 8
Enter number 2: 25
Enter number 3: 24
Enter number 4: 5
Enter number 5: 8
8 is Positive and Even
25 is Positive and Odd
24 is Positive and Even
5 is Positive and Odd
8 is Positive and Even
First and Last elements are Equal */
