import java.util.Scanner;

public class fibonaccii {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println(n);
            return;
        }

        int prev = 0;
        int curr = 1;

        for(int i = 2; i <= n; i++){
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        System.out.println("Fibonacci = " + curr);
    }

}
