import java.util.Scanner;

public class TrimSpacesWithoutTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int start = 0;
        int end = text.length() - 1;

        // Find first non-space
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Create trimmed string manually
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += text.charAt(i);
        }

        // Built-in trim
        String builtInTrim = text.trim();

        //results
        System.out.println("Original text : >" + text + "<");
        System.out.println("Manual trim   : >" + trimmed + "<");
        System.out.println("Built-in trim : >" + builtInTrim + "<");

        // Compare results
        if (trimmed.equals(builtInTrim)) {
            System.out.println("Both results are SAME");
        } else {
            System.out.println("Results are DIFFERENT");
        }
    }
}
/*Enter text with spaces:    I am good.
Original text : >   I am good.<
Manual trim   : >I am good.<
Built-in trim : >I am good.<
Both results are SAME */
