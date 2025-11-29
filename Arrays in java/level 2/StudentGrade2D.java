import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                int mark = sc.nextInt();

                if (mark < 0) {
                    System.out.println("Invalid marks! Enter positive values again.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
        }

        // Calculate percentage & grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 75) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 40) grades[i] = 'D';
            else grades[i] = 'F';
        }

        // Output results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d => Physics: %d, Chemistry: %d, Maths: %d | Percentage: %.2f%% | Grade: %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
/*
Enter marks for Student 2
Physics marks: 70
Chemistry marks: 90
Maths marks: 90

--- Student Results ---
Student 1 => Physics: 50, Chemistry: 80, Maths: 20 | Percentage: 50.00% | Grade: D
Student 2 => Physics: 70, Chemistry: 90, Maths: 90 | Percentage: 83.33% | Grade: B */