import java.util.Scanner;

public class VowelConsonantType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type;

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            // Check type
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                type = "Vowel";
            } else if (ch >= 'a' && ch <= 'z') {
                type = "Consonant";
            } else {
                type = "Not a Letter";
            }

            System.out.println(text.charAt(i) + "\t\t" + type);
        }
    }
}
/*Enter text: mit@li

Character       Type
-------------------------
m               Consonant
i               Vowel
t               Consonant
@               Not a Letter
l               Consonant
i               Vowel */