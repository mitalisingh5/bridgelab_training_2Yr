import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Km = scanner.nextInt();
        System.out.println("Enter distance in km: "+Km+" Km");
        int miles = (int) (Km * 0.621371);
        System.out.println("Distance in miles: " + miles);
    }
}
