import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
    }
}

// output - The addition, subtraction, multiplication and division value of 2 numbers 12.5 and 4.5  is 17.0, 8.0, 56.25, and 2.7777777777777777