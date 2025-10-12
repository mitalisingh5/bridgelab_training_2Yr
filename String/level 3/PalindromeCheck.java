import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //Compare start & end
        boolean isPal = true;
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPal = false;
                break;
            }
            start++; end--;
        }
        System.out.println("Palindrome (Logic 1)? " + isPal);

        //Reverse and compare
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        System.out.println("Palindrome (Logic 2)? " + text.equals(rev));
    }
}
/*Enter text: madam
Palindrome (Logic 1)? true
Palindrome (Logic 2)? true */