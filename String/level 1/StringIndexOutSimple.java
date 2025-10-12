import java.util.Scanner;

public class StringIndexOutSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        try {
            System.out.println(text.charAt(text.length())); // invalid index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }
}
//this will throw StringIndexOutOfBoundsException because valid indices are 0 to length-1
/*Enter text: mitali
Caught StringIndexOutOfBoundsException! */


