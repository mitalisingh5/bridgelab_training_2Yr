import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        if (players * cards > n) {
            System.out.println("Not enough cards!");
            return;
        }

        for (int p = 0; p < players; p++) {
            System.out.println("Player " + (p + 1) + ":");
            for (int c = 0; c < cards; c++) {
                System.out.println("  " + deck[p * cards + c]);
            }
            System.out.println();
        }
    }
}
/*Enter number of players: 3
Enter number of cards per player: 12
Player 1:
  7 of Clubs
  King of Hearts
  2 of Hearts
  Ace of Diamonds
  5 of Hearts
  10 of Diamonds
  7 of Spades
  2 of Clubs
  Queen of Clubs
  7 of Hearts
  5 of Spades
  6 of Clubs

Player 2:
  9 of Spades
  Ace of Clubs
  6 of Hearts
  9 of Hearts
  2 of Spades
  Queen of Diamonds
  Queen of Spades
  10 of Hearts
  8 of Spades
  King of Spades
  Ace of Hearts
  4 of Clubs

Player 3:
  6 of Spades
  4 of Hearts
  3 of Clubs
  10 of Clubs
  3 of Hearts
  3 of Spades
  8 of Diamonds
  Jack of Clubs
  5 of Diamonds
  King of Clubs
  7 of Diamonds
  9 of Clubs*/
/*Note: The above output will vary each time due to shuffling.*/

/*Enter number of players: 3
Enter number of cards per player: 20
Not enough cards! */