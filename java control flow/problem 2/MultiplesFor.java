import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = number; i < 100; i += number) {
                System.out.println(i);
            }
        }
    }
}
/*Multiples of 10 below 100 are:
10
20
30
40
50
60
70
80
90 */
