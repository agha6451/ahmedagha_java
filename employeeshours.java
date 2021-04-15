import java.io.*;
import java.util.*;

public class employeeshours {
    public static void main(String [] args) throws FileNotFoundException {
        File myFile = new File("C:\\Users\\anyda\\Dropbox\\My PC (DESKTOP-QV8U8TS)\\Documents\\ahmedagha_java-1\\hours.txt");//calls the example.txt file in ahmedagha_java-1
        Scanner input = new Scanner(myFile); // makes an input from myfile
        PrintStream output = new PrintStream (new File ("data.txt"));
        int id = 0;
        String name = " "; //String name;
        double avg =0.0;
        double sum = 0.0;
        double count =0.0;
        while(input.hasNextLine()){
            Scanner line = new Scanner(input.nextLine());  // makes a line scanner that is from input
            
            if(line.hasNextInt()){
                id = line.nextInt();
            }
            if(line.hasNext()){
                name = line.next();
            }
            while(line.hasNextDouble()){
                sum += line.nextDouble();
                count++;
            }
             avg =(sum/count);

            output.printf(name +" (ID#" +id +") has worked %.1f hours this week. The average worked by " +name +" this week was %.2f hours/day", sum, avg);
            output.println();
            sum =0;
            count =0;
            id = 0;
        }
    input.close();
    }
}
