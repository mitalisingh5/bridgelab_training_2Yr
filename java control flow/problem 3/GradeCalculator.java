import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        double avg = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (avg >= 75) {
            System.out.println("Grade: B (Very Good)");
        } else if (avg >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (avg >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }
    }
}
/*
Enter marks in Physics: 90
Enter marks in Chemistry: 90
Enter marks in Maths: 90
Average Marks: 90.0
Grade: A (Excellent)

Enter marks in Physics: 50
Enter marks in Chemistry: 49
Enter marks in Maths: 35
Average Marks: 44.666666666666664
Grade: F (Fail) */