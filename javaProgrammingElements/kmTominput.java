import java.util.Scanner;

public class kmTominput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
//output-The total miles is 6.21375 mile for the given 10.0 km