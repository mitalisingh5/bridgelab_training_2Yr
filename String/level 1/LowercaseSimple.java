import java.util.Scanner;

public class LowercaseSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Convert manually
        String lower1 = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            lower1 += c;
        }

        // Built-in method
        String lower2 = text.toLowerCase();

        System.out.println("Manual lowercase: " + lower1);
        System.out.println("Built-in lowercase: " + lower2);
        System.out.println("Are both equal? " + lower1.equals(lower2));
    }
}

/*Enter text: MITALI
Manual lowercase: mitali
Built-in lowercase: mitali
Are both equal? true */