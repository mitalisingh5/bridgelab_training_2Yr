import java.util.Scanner;

public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index] = temp;
                index++;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[index] = temp; // last word

        int[] lengths = new int[wordCount];

        for (int i = 0; i < wordCount; i++) {
            int count = 0;
            try {
                while (true) {
                    words[i].charAt(count);
                    count++;
                }
            } catch (Exception e) {
            }
            lengths[i] = count;
        }

        //Find shortest & longest
        
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < wordCount; i++) {
            if (lengths[i] < lengths[minIndex]) {
                minIndex = i;
            }
            if (lengths[i] > lengths[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordCount; i++) {
            System.out.println(words[i] + "\t" + lengths[i]);
        }

        System.out.println("\nShortest word: " + words[minIndex] + " (Length " + lengths[minIndex] + ")");
        System.out.println("Longest word : " + words[maxIndex] + " (Length " + lengths[maxIndex] + ")");
    }
}
/*Enter a sentence: I love coding
Word    Length
-----------------
I       1
love    4
coding  6
Shortest word: I (Length 1)
Longest word : coding (Length 6) */
