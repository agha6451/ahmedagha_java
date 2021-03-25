import java.util.*;
public class practicearrays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many days have you measured the temperature of?");
        int days = input.nextInt();
        int [] daytemps = new int [days];
        int sum = 0;
        int overavg = 0;
        for(int i=0; i<days; i++){ // another way to get the length is typing (name.length)
            System.out.println("Day " +(i+1) +"'s high temp:");
            daytemps[i] = input.nextInt();
            System.out.println("Day " +(i+1) +"'s temperature was " +daytemps[i] +"degrees.");
            sum += daytemps[i];
            System.out.println(sum);
        }
        double avg = (double) sum/days;
        System.out.printf("The average for the " +days +" days was %.1f", +avg);
        System.out.println();
        
        for(int a=0; a<days; a++){
            if(daytemps[a] > avg){
                overavg++;
            }
        }

        System.out.println(overavg +" days were above the average high temp.");

    }
}