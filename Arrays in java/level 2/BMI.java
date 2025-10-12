import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            double weight = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            double heightCm = sc.nextDouble();

            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);

            personData[i][0] = weight;
            personData[i][1] = heightCm;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}

/*
Enter number of persons: 2
Enter weight of person 1 (kg): 70
Enter height of person 1 (cm): 120
Enter weight of person 2 (kg): 45
Enter height of person 2 (cm): 150

--- BMI Report ---
Person 1: Weight = 70.00 kg, Height = 120.00 cm, BMI = 48.61, Status = Obese
Person 2: Weight = 45.00 kg, Height = 150.00 cm, BMI = 20.00, Status = Normal
 */

