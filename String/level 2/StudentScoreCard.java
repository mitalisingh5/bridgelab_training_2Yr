import java.util.Scanner;

public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chem = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int math = sc.nextInt();

        // Total, Average, Percentage
        int total = phy + chem + math;
        double avg = total / 3.0;
        double percent = (total / 300.0) * 100;

        // Grade calculation
        char grade;
        if (percent >= 90) {
            grade = 'A';
        } else if (percent >= 75) {
            grade = 'B';
        } else if (percent >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Discorecard
        System.out.println("\n===== Student Scorecard =====");
        System.out.println("Physics   : " + phy);
        System.out.println("Chemistry : " + chem);
        System.out.println("Maths     : " + math);
        System.out.println("Total     : " + total);
        System.out.printf("Average   : %.2f\n", avg);
        System.out.printf("Percentage: %.2f%%\n", percent);
        System.out.println("Grade     : " + grade);

    }
}
/*
Enter Physics marks: 85
Enter Chemistry marks: 90
Enter Maths marks: 80
===== Student Scorecard =====
Physics   : 85
Chemistry : 90
Maths     : 80
Total     : 255
Average   : 85.00
Percentage: 85.00%
Grade     : B
 */

