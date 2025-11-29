import java.util.Scanner;

public class AreaofCircle {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        int area = (int) (Math.PI * radius * radius);
        System.out.println("Area of the circle: " + area);
    }

}
