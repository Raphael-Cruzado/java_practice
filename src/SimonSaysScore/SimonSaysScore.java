package SimonSaysScore;

import java.util.Scanner;

public class SimonSaysScore {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String simonPattern;
        String userPattern;
        int userScore;
        int i;

        userScore = 0;

        simonPattern = input.next();
        userPattern  = input.next();

        for (i = 0; i < simonPattern.length(); i++) {
            if (simonPattern.charAt(i) == userPattern.charAt(i)) {
                userScore++;
            } else {
                // Exit the loop on the first mismatch
                break;
            }
        }

        System.out.println("userScore: " + userScore);
    }
}
