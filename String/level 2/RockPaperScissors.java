import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("\nGame " + i + " - Enter Rock, Paper or Scissors: ");
            String userChoice = sc.next().toLowerCase();

            int comp = rand.nextInt(3); // 0=rock, 1=paper, 2=scissors
            String compChoice = (comp == 0) ? "rock" : (comp == 1) ? "paper" : "scissors";

            System.out.println("Computer chose: " + compChoice);

            if (userChoice.equals(compChoice)) {
                System.out.println("Result: Draw!");
                draws++;
            } else if ((userChoice.equals("rock") && compChoice.equals("scissors")) ||
                    (userChoice.equals("scissors") && compChoice.equals("paper")) ||
                    (userChoice.equals("paper") && compChoice.equals("rock"))) {
                System.out.println("Result: You Win!");
                userWins++;
            } else {
                System.out.println("Result: Computer Wins!");
                compWins++;
            }
        }

        // Show final stats
        System.out.println("\n===== Final Stats =====");
        System.out.println("Total Games : " + games);
        System.out.println("Your Wins   : " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws       : " + draws);

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        System.out.println("\nWinning Percentage:");
        System.out.printf("You      : %.2f%%\n", userPercent);
        System.out.printf("Computer : %.2f%%\n", compPercent);

    
    }
}

/*Enter number of games: 2

Game 1 - Enter Rock, Paper or Scissors: paper
Computer chose: rock
Result: You Win!

Game 2 - Enter Rock, Paper or Scissors: rock
Computer chose: rock
Result: Draw!

===== Final Stats =====
Total Games : 2
Your Wins   : 1
Computer Wins: 0
Draws       : 1

Winning Percentage:
You      : 50.00%
Computer : 0.00% */
