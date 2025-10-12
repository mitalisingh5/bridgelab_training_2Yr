import java.util.Scanner;

public class employebonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for less than or equal to 5 years of service.");
        }
    }
}
/*Enter salary: 50000
Enter years of service: 6
Bonus amount is: 2500.0
 */
