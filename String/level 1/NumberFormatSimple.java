import java.util.Scanner;

public class NumberFormatSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            int num = Integer.parseInt(text);
            System.out.println("Number = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }
}
// this will throw NumberFormatException because input is not a number
/*Enter text: mitali
Caught NumberFormatException! */
// this will not throw any exception
/*Enter text: 123
Number = 123 */