import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double num;

        System.out.print("Enter a number (0 to stop): ");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("Total sum is: " + total);
    }
}
// enter a number (0 to stop): 5
// enter a number (0 to stop): 3.2
// enter a number (0 to stop): -1.2
// enter a number (0 to stop): 0
// total sum is: 7.0
