import java.util.Scanner;

public class heightcon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        // Convert cm to inches
        double totalInches = cm / 2.54;

        // Get feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
    }
}
// OUTPUT-Enter your height in centimeters: 170
// Your Height in cm is 170.0 while in feet is 5 and inches is 6.692913385826771