import java.util.*;
public class practicearrays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many days have you measured the temperature of?");
        int days = input.nextInt();
        int [] daytemps = new int [days]; // array to store temperatures
        int sum = 0;
        int overavg = 0;
        for(int i=0; i<days; i++){   // for loop to ask temps                       // another way to get the length is typing (name.length)
            System.out.println("Day " +(i+1) +"'s high temp:");
            daytemps[i] = input.nextInt();
            System.out.println("Day " +(i+1) +"'s temperature was " +daytemps[i] +"degrees.");
            sum += daytemps[i];
            System.out.println(sum);
        }
        double avg = (double) sum/days; // get averages
        System.out.printf("The average for the " +days +" days was %.1f", avg);
        System.out.println();
        
        for(int a=0; a<days; a++){ // changes variable for days over avg
            if(daytemps[a] > avg){
                overavg++;
            }
        }
        System.out.println(overavg +" days were above the average high temp."); // prints how many days above average temp
        System.out.println("Temperature: " +Arrays.toString(daytemps)); // prints array
        Arrays.sort(daytemps);
        System.out.println(Arrays.toString(daytemps));
        System.out.println("Two coldest days: " +daytemps[0] +" , " +daytemps[1]);
        System.out.println("Two hottest days: " + daytemps[days-2] +" , " +daytemps[days-1]);
    }
}