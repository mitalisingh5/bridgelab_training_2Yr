import java.util.Scanner;

public class SubstringSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 = sub1 + text.charAt(i);
        }

        // Substring using built-in method
        String sub2 = text.substring(start, end);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both equal? " + sub1.equals(sub2));


    }
}
/*Enter text: mitali
Enter start index: 3
Enter end index: 6
Substring using charAt(): ali
Substring using substring(): ali
Are both equal? true */
