import java.util.Scanner;


public class IllegalArgumentSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter text: ");
        String text = sc.next();
        try {
            System.out.println(text.substring(5, 2));
            Thread.sleep(-1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
        }
        catch (Exception e) {
            System.out.println("Caught a Runtime Exception: " + e);
        }
    }
}


// this will throw IllegalArgumentException because start index is greater than end index
/*Enter text: mitali
Caught IllegalArgumentException! */