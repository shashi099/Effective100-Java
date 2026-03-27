package phase5;

import java.util.Scanner;

public class Ques44 {
 
    public static void main(String[] args) {
    //     44- Project - Guess Game
    //   Write a program that generates a random number and asks the user to guess what the number is.
    //   If the user's guess is higher than the random number, the program should display "Too high, try again."
    //   If the user's guess is lower than the random number, the program should display "Too low, try again."
    //   The program should use a loop that repeats until the user correctly guesses the random number.
   
        Scanner sc  =new Scanner(System.in);
        int times = 0;
        int guess;

        int rand = (int) Math.ceil(Math.random() * 100) ;    
        System.out.println(rand);

        do {
            System.out.println("Guess the Number Between 10 to 100");
            guess = sc.nextInt();            

            if(guess < rand){
                System.out.println("You are in Low " + guess);
            }else if(guess > rand){
                System.out.println("You are High " + guess);
            }

            times ++;
        } while (guess != rand);

        System.out.println("Congratulation You Win in "+ times + " Times");

        sc.close();
    }

}
