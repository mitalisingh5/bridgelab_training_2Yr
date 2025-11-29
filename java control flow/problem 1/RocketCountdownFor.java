import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");
    }
}
// enter countdown number: 5
// 5
// 4
// 3
// 2
// 1
// lift off!  #for loop used