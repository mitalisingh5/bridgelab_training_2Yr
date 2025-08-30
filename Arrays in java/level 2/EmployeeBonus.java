import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i+1) + ": ");
            double s = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i+1) + ": ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please re-enter values.");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i+1) + ": Old Salary = " + salary[i] + ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

    }
}
/*
--- Employee Bonus Report ---
Employee 1: Old Salary = 50000.0, Bonus = 1000.0, New Salary = 51000.0
Employee 2: Old Salary = 70000.0, Bonus = 3500.0, New Salary = 73500.0
Employee 3: Old Salary = 50000.0, Bonus = 1000.0, New Salary = 51000.0
Employee 4: Old Salary = 500000.0, Bonus = 10000.0, New Salary = 510000.0
Employee 5: Old Salary = 100000.0, Bonus = 5000.0, New Salary = 105000.0
Employee 6: Old Salary = 30000.0, Bonus = 600.0, New Salary = 30600.0
Employee 7: Old Salary = 3000000.0, Bonus = 60000.0, New Salary = 3060000.0
Employee 8: Old Salary = 58889.0, Bonus = 1177.78, New Salary = 60066.78
Employee 9: Old Salary = 45870.0, Bonus = 917.4, New Salary = 46787.4
Employee 10: Old Salary = 40000.0, Bonus = 800.0, New Salary = 40800.0

Total Old Salary: 3944759.0
Total Bonus Payout: 83995.18
Total New Salary: 4028754.1799999997 */
