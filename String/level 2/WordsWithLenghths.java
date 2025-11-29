import java.util.Scanner;

public class WordsWithLenghths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();


        // Count words
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        //Split words
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


        //2D array [word, length]
        String[][] wordWithLength = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            wordWithLength[i][0] = words[i];
            // find length without using length()
            int count = 0;
            try {
                while (true) {
                    words[i].charAt(count);
                    count++;
                }
            } catch (Exception e) {
                // stop when index goes out of range
            }
            wordWithLength[i][1] = String.valueOf(count); // store length as string
        }

        //result
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordCount; i++) {
            System.out.println(wordWithLength[i][0] + "\t" + Integer.parseInt(wordWithLength[i][1]));
        }
    }
}

/*Enter a sentence: I love coding

Word    Length
-----------------
I       1
love    4
coding  6 */