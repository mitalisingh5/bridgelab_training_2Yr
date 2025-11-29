import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String []args){
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of a rectangle: " + perimeter);

    }
}
