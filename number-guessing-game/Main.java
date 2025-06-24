import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    NumberGuessingGame game = new NumberGuessingGame();
    game.start();
  }
}

class NumberGuessingGame {
  private final int numberToGuess;
  private int attempts;

  public NumberGuessingGame() {
    this.numberToGuess = (int) (Math.random() * 10) + 1; // Random number between 1 and 10
    this.attempts = 0;
  }

  public void start() {
    System.out
        .println("Welcome to the Number Guessing Game!");
    System.out.println(
        "Try to guess the number between 1 and 10.");
    while (true) {
      int guess = getUserInput();
      attempts++;
      if (guess < numberToGuess) {
        System.out.println("Too low! Try again.");
      } else if (guess > numberToGuess) {
        System.out.println("Too high! Try again.");
      } else {
        System.out.println(
            "Congratulations! You've guessed the number "
                + numberToGuess + " in " + attempts
                + " attempts.");
        break;
      }
    }
  }

  private int getUserInput() {
    System.out.print("Enter your guess: ");
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int guess = scanner.nextInt();
      if (guess < 1 || guess > 10) {
        System.out.println(
            "Please enter a number between 1 and 10.");
      } else {
        return guess;
      }
    }
  }
}