import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        System.out.print("Enter the height: ");
        int height = scanner.nextInt();
        int volume = (int) (Math.PI * radius * radius * height);
        System.out.println("Volume of cylinder: " + volume);
    }
}
