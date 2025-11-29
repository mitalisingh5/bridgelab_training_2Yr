import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;

        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }
}
//base 10, height 5
//output-The area of triangle is 25.0 square inches and 161.29 square centimeters