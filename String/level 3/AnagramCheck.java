import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (text1.length() != text2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        boolean anagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagrams" : "Not Anagrams");

    }
}

/*Enter first text: mini
Enter second text: mini
Anagrams */
