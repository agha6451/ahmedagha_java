import java.util.*;
public class chap5project{
    /*Write a program that plays a reverse guessing game with the user. The user thinks of a number between 1 and 10, and
the computer repeatedly tries to guess it by guessing random numbers. It’s fine for the computer to guess the same
random number more than once. At the end of the game, the program reports how many guesses it made.*/

// Pseudo-Code: def want to get a random number between 1 and 10, print that number, and have scanners ready to check whether its correct or not.
// will set another variable for guesses to print 

public static void main(String[] args){

    System.out.println("This program has you, the user, choose a number between 1 and 10. Then I, the computer, will try my best to guess it. ");
    int x=1;
    int y=10;
    Random randomnumber = new Random();
    String cons = "n"; 
    int tries =1; 
    while(cons == "n"){
        int a = Math.abs(randomnumber.nextInt())%(y-x)+x;
        System.out.println("Is the number " +a +" ? (y/n)");
        System.out.println(cons);
        Scanner console = new Scanner(System.in);
        cons = console.nextLine();
        tries+=1;
        System.out.println(tries);
        if(cons == "y"){
            System.out.println("The computer guessed your number " +a +" in " +tries +"guesses");
        }
    }// Note for Ms. Suarez, my while-loop keeps escaping on me, even when I add a conditional to stop the loop. How can I fix this? I don't want my grade to plummet because of a glitch in the system.
}
}