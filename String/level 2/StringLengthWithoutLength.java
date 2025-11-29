import java.util.Scanner;

public class StringLengthWithoutLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // length calculation
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // when index goes out of range, loop stops
        }
        int builtInLength = text.length();

        System.out.println("Length (without length()): " + count);
        System.out.println("Length (with length())   : " + builtInLength);
    }
}
/*Enter a string: mitali
Length (without length()): 6
Length (with length())   : 6
 */
