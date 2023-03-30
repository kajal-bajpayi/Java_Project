import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber {
    public static void main(String[] args) {
        int range = 100;
        int numberOfAttempts = 10;
        int score = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(range) + 1;

        for (int i = 1; i <= numberOfAttempts; i++) {
            String guessString = JOptionPane.showInputDialog("Guess a number between 1 and " + range + " (" + i + "/" + numberOfAttempts + " attempts)");
            int guess = Integer.parseInt(guessString);

            if (guess == randomNumber) {
                JOptionPane.showMessageDialog(null, "You guessed it! The number was " + randomNumber + ".");
                score += numberOfAttempts - i + 1;
                break;
            } else if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess is too low.");
            } else {
                JOptionPane.showMessageDialog(null, "Your guess is too high.");
            }
        }

        JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
    }
}
