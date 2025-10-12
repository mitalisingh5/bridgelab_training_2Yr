import java.util.Scanner;

public class CharArraySimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // Convert string to char array manually using charAt()
        char[] arr1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr1[i] = text.charAt(i);
        }

        // Use built-in toCharArray()
        char[] arr2 = text.toCharArray();

        // Compare both arrays
        boolean same = true;
        if (arr1.length != arr2.length) {
            same = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    same = false;
                    break;
                }
            }
        }

        // Print arrays
        System.out.print("User-defined char array: ");
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Built-in char array: ");
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Both arrays are equal? " + same);
    }
}
/*Enter text: mitali
User-defined char array: m i t a l i
Built-in char array: m i t a l i
Both arrays are equal? true */