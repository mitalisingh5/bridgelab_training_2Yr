import java.util.Scanner;

public class factoriali {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = 1;

        for(int i = 2; i <= n; i++){
            result = result * i;
        }

        System.out.println("Factorial = " + result);
    }

}
