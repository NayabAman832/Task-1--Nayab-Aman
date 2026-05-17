import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int target = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("🎮 Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");

        while (guess != target && attempts < maxAttempts) {

            try {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                attempts++;

                if (guess > target) {
                    System.out.println("⬆ Too High!");
                }
                else if (guess < target) {
                    System.out.println("⬇ Too Low!");
                }
                else {
                    System.out.println("🎉 Correct! You Win!");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));

            }

            catch (Exception e) {

                System.out.println("❌ Invalid input! Please enter a number.");

                sc.next(); // clears wrong input
            }
        }

        if (guess != target) {
            System.out.println("❌ Game Over!");
            System.out.println("Correct number was: " + target);
        }

        sc.close();
    }
}