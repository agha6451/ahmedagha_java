import java.util.*;
import java.io.*;
public class FilesPractice {
    public static void main(String [] args)throws FileNotFoundException{
        double temp1 = 0; // declare variables
        double temp2 =0;
        double change = 0;
        File myFile = new File("C:\\Users\\anyda\\Dropbox\\My PC (DESKTOP-QV8U8TS)\\Documents\\ahmedagha_java-1\\weather.txt");//calls the example.txt file in ahmedagha_java-1
        Scanner input = new Scanner(myFile); // makes an input from myfile
        if(input.hasNextDouble()){
            temp1 = input.nextDouble();
        }
        while(input.hasNext()){ // while loop to get changes and print them
            temp2 = temp1; // switches the numbers around
            temp1 = input.nextDouble(); // gets the next number to enter the carousel
            change = temp1-temp2; // calculates change
            System.out.printf(temp1 +" to " +temp2 +", " +"change = %.1f", change); // prints the nice thing in the console
            System.out.println(); // skips line
        }
    }    
}