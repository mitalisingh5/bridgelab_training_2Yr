import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance " + feet + " feet is " + yards + " yards and " + miles + " miles");
    }
}
//distance 5280 feet
//output-The distance 5280.0 feet is 1760.0 yards and 1.0 miles