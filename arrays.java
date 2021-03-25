import java.util.*;

public class arrays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers are you giving me?");
        int size = input.nextInt();
    int [] numbers = new int [size];
    for(int i=0; i<size; i++){
        numbers[i] = i*2;
        System.out.println(numbers[i]);
    }    
    }
}