import java.util.Scanner;

public class UppercaseSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert manually
        String upper1 = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            upper1 += c;
        }

        // Built-in method
        String upper2 = text.toUpperCase();

        System.out.println("Manual uppercase: " + upper1);
        System.out.println("Built-in uppercase: " + upper2);
        System.out.println("Are both equal? " + upper1.equals(upper2));
    }
}

/*Enter text: Mitali
Manual uppercase: MITALI
Built-in uppercase: MITALI
Are both equal? true */