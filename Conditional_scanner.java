// Ahmed Agha
// 02/08/2021
// We are going to learn how to use the Scanner for user input
// if/else statements

import java.util.*;
public class Conditional_scanner{

    public static void main(String[] args){
        System.out.print(" Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(" You are "+ age+ " years old");

        if (age >=50){
            System.out.println("You will be vaccinated.");
        }
    else if( age<50) {
        System.out.println("You need to be tested");
    }
    else if(age<=18){
        System.out.println("ur a minor no need to get vaccinated or tested lol");
    }
}
}