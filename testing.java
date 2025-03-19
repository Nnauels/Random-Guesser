import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Random ra = new Random();  // created the scanner and random objects
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0; 
        int min = 1;
        int max = 100;
        int randomNumber = ra.nextInt(min, max + 1);  //variables needed for the program
        System.out.println("Welcome to the Number Guessing Game!");

        System.out.printf("Guess a number between %d-%d\n", min, max);

        System.out.println("You have 5 attempts to guess the number.");

        while (attempts < 5) {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too High, try again");
            } else if (guess < randomNumber) {
                System.out.println("Too Low, try again");
            } else {
                System.out.println("Your guess " + guess + " was correct!");
                break;
            }

            if (attempts == 5) {
                System.out.println("You've used all your attempts. The correct number was " + randomNumber);
            }
        }

        sc.close();
    }
}