import java.util.Scanner;
public class divisibilityOf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("Is the number "+number+ " divisible by 5?->YES");
        } else {
            System.out.println("Is the number "+number+ " divisible by 5?->NO");
        }
    }
}
