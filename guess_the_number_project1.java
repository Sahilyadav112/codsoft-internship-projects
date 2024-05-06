//Project 1 of internship at codsoft 

//Number Guessing Game

/*1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won. */

import java.util.Scanner;
import java.util.Random;

public class guess_the_number_project1 {

    public static void main(String[] args) {

        System.out.println("WELCOME TO THE GAME :)");

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        int nguesses = 0;

        boolean b = true;

        while (b){
            System.out.println("Choose the number from 1 to 100");
            int number = sc.nextInt();

            if (number > randomNumber) {
                System.out.println("Too high");
            }

            else if (number < randomNumber) {

                System.out.println("Too low");
            }

            else {
                System.out.println("Yay! You guessed it right");
            }
            nguesses++;

            if (randomNumber == number) {
                break;
            }

        }

        System.out.println("You guessed correct in " + nguesses + " attempts");
        System.out.println("Your Score is " +  (10 - nguesses));
      

    }

}
