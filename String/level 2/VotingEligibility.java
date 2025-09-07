import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[5];
        boolean[] canVote = new boolean[5];

        //input
        System.out.println("Enter age of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Check voting eligibility
            if (ages[i] >= 18) {
                canVote[i] = true;
            } else {
                canVote[i] = false;
            }
        }

        // results
        System.out.println("\nStudent Age and Voting Eligibility:");
        System.out.println("Student\tAge\tCan Vote?");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + ages[i] + "\t" + canVote[i]);
        }

    }
}
/*Enter age of 5 students:
Student 1: 38
Student 2: 10
Student 3: 49
Student 4: 2
Student 5: 17

Student Age and Voting Eligibility:
Student Age     Can Vote?
1       38      true
2       10      false
3       49      true
4       2       false
5       17      false */
