import java.util.*;
public class chap7projects{
/* Write a game of Hangman using arrays. Allow the user to guess letters and represent which letters have been
guessed in an array.*/
public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String [] animals = {"cat", "dog", "sheep", "lamb", "fish", "iguana", "crocodile", "alligator", "goat"}; //category of animals in an array
        Random ra = new Random();
        int rand = ra.nextInt(9);
        String word = animals[rand]; // makes the word one of the words in the array
        int x=word.length();
        int count = 6;
        int countDashes =x;
        char [] right = new char [x]; // array of letters that is in the word
        Arrays.fill(right, '_'); // makes the blank spaces on the right letters array
        char[] letters = new char [x]; // array of letters in the word
        for(int i=0; i<x; i++){
            letters[i] = word.charAt(i);
        }
        while(count>0 && countDashes != 0){
            System.out.println(Arrays.toString(right));
            System.out.println("Guess a letter: "); // asks user to guess letter
            char guess = in.next().charAt(0); // inputs the user's guess
            System.out.println(guess); // prints the character (just a check, will not be in final code)
            int temp = 0;
            for(int i=0; i<x;i++){
                if(word.charAt(i) ==guess){ //checks if the guess fits a letter in the right array
                    right[i] = guess;
                    countDashes--;
                    temp =1;
                }
            }
            if(temp ==1){
                temp =0;
            } else {count--;}
            System.out.println("End" +countDashes +"count = " +count);
        }
        System.out.println(Arrays.toString(right));
            if(count!=0){
                System.out.println("You won! :)");
            } else{
                System.out.println("You lost :(");
            }
        }
    }