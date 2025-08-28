import java.util.Scanner;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        int[] heights = new int[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Youngest
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Tall
        int maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        System.out.println("Youngest friend is: " + youngest);
        System.out.println("Tallest friend is: " + tallest);
    }
}

/*Enter age of Amar: 15
Enter height of Amar: 150
Enter age of Akbar: 18
Enter height of Akbar: 165
Enter age of Anthony: 20
Enter height of Anthony: 170
Youngest friend is: Amar
Tallest friend is: Anthony */

