import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[3][2]; // weight, height for 3 persons

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 3; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0; // convert cm to meters
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 24.9) status = "Normal";
            else if (bmi < 29.9) status = "Overweight";
            else status = "Obese";

            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", weight, data[i][1], bmi, status);
        }
        sc.close();
    }
}

/*
Enter weight (kg) of person 1: 60
Enter height (cm) of person 1: 145
Enter weight (kg) of person 2: 50
Enter height (cm) of person 2: 170
Enter weight (kg) of person 3: 90
Enter height (cm) of person 3: 120

Weight  Height  BMI     Status
60.0    145.0   28.54   Overweight
50.0    170.0   17.30   Underweight
90.0    120.0   62.50   Obese */
