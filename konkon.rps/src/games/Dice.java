package games;

import java.util.Scanner;

public class Dice {

    public static void main(String []args) {
        boolean onoff = true;
        int guess = 0;
        while(onoff) {

            int rolledDice = (int)Math.floor(Math.random() * 6 + 1);
            Scanner myInput = new Scanner( System.in );

            System.out.println("You guess the dice\n");
            guess = Integer.parseInt(myInput.nextLine());
            if(guess > 6 || guess < 1) {
                System.out.println("You have to guess a number between 1 and 6, try again\n");
            }
            if(guess == rolledDice) {
                System.out.println("Great! you guessed right!\n");
                onoff = false;
            }
        }
    }
}