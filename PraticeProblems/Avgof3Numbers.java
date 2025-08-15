import java.util.Scanner;

public class Avgof3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the num3: ");
        int num3 = scanner.nextInt();
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("Average: " + avg);
    }
}
