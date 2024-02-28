import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		playGame();

	}
private static void playGame() {
	 Scanner scanner = new Scanner(System.in);
     Random random = new Random();
     int lowerLimit = 1;
     int upperLimit = 100;
     int maxAttempts = 5;
     int roundsPlayed = 0;
     int roundsWon = 0;
     while (true) {
         int secretNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
         int attempts = 0;

         System.out.println("Guess the number between " + lowerLimit + " and " + upperLimit + ":");

         while (attempts < maxAttempts) {
             int userGuess = scanner.nextInt();

             if (userGuess == secretNumber) {
                 System.out.println("Congratulations! You guessed the correct number.");
                 roundsWon++;
                 break;
             } else if (userGuess < secretNumber) {
                 System.out.println("Too low! Try again.");
             } else {
                 System.out.println("Too high! Try again.");
             }

             attempts++;
         }

         if (attempts == maxAttempts) {
             System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber + ".");
         }

         roundsPlayed++;

         System.out.println("Do you want to play again? (yes/no):");
         String playAgain = scanner.next().toLowerCase();

         if (!playAgain.equals("yes")) {
             System.out.println("Game Over! You played " + roundsPlayed + " rounds and won " + roundsWon + " times.");
             break;
         }
     }

     scanner.close();
 }

		
	
         
     }

