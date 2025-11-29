import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[count++] = c;
        }

        System.out.print("Unique characters: ");
        for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");

    }
}
/*Enter text: mitali
Unique characters: m i t a l */
