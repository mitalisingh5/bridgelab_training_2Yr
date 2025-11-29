import java.util.Scanner;

public class ArrayIndexOutSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        try {
            System.out.println(arr[n]); // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
        }
    }
}
// this will throw ArrayIndexOutOfBoundsException because valid indices are 0 to n-1
/*Enter number of names: 3
mitali
ankit
rohan
Caught ArrayIndexOutOfBoundsException! */