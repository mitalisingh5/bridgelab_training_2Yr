import java.util.Scanner;

public class SplitWordsWithoutSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        
        // Custom word split
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] customWords = new String[wordCount];
        int index = 0;
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                customWords[index] = temp;
                index++;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        customWords[index] = temp; // last word
        // Built-in split
        String[] builtInWords = text.split(" ");
        // Compare & Display
        boolean areEqual = true;
        if (customWords.length != builtInWords.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < customWords.length; i++) {
                if (!customWords[i].equals(builtInWords[i])) {
                    areEqual = false;
                    break;
                }
            }
        }

        //results
        System.out.println("Custom Split Words:");
        for (String w : customWords) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split Words:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("\nAre both results equal? " + areEqual);
    }
}
/*Enter a sentence: Hello World from Java
Custom Split Words:
Hello
World
from
Java
Built-in Split Words:
Hello
World
from
Java
Are both results equal? true
*/
