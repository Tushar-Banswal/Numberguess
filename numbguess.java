import java.util.*;
public class numbguess {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Press 1 if you want to start");
        //Getting user's input
        int st = sc.nextInt(); 
        //Checking for the valid input
        if (st > 1 || st < -1 || st == 0) {         
            System.out.println("Invalid input");
            return;
        }         
        System.out.println("Computer guessed a number between 1 amd 100");
        //Computer guesses a number
        int rand = ((int)(Math.random() * 100));       
        System.out.println("You need to tell that number");
        System.out.println("Press -1 to end the game");
        // loop for the game
        while (st == 1) {
            int guess = sc.nextInt();
            //Checking for -1 input
            if (guess == -1) {
                break;
            }

            // Comparing users input from computer guess

            if (guess == rand) {
                System.out.println("Game over");
                break;
            }
            
            else if (guess > rand) {
                System.out.println("You guess higher number");
            }

            else {
                System.out.println("You guess lower number");
            }
        }
        System.out.println("Thanks for playing game");
    }
}