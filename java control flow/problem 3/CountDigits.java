import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int n = Math.abs(number); // handle negatives

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
/*
Enter an integer: 100
Number of digits: 3

Enter an integer: 8
Number of digits: 1
 */