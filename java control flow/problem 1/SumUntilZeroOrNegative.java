import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }
            total += num;
        }

        System.out.println("Total sum is: " + total);
    }
}
// enter a number (0 or negative to stop): 5
// enter a number (0 or negative to stop): 3.2
// enter a number (0 or negative to stop): -1.2
// total sum is: 8.2
