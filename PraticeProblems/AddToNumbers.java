import java.util.Scanner;

public class AddToNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num1: ");
        Integer num1 = scanner.nextInt();
        System.out.print("Enter the second num2: ");
        Integer num2 = scanner.nextInt();
        Integer sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
