import java.util.*;
public class chap7projects_2{

    /* Java’s type int has a limit on how large an integer it can store. This limit can be circumvented by representing an
integer as an array of digits. Write an interactive program that adds two integers of up to 50 digits each.*/
public static void main(String [] args){
    Random ra = new Random();
    int rand = ra.nextInt(10);
    int temp =0;
    int [] one = new int [50];
    int [] two = new int [50];
    int [] sum = new int [51];
    for(int i=0; i<one.length; i++){
        rand += (rand%10);
        one[i] = rand;
        one[i] = one[i]%100;
        one[i] = one[i]%10;
    }
    System.out.println(Arrays.toString(one));
    for(int i=0; i<two.length; i++){
        rand += (rand%10);
        two[i] = rand;
        two[i] = two[i]%100;
        two[i] = two[i]%10;
    }
    System.out.println(Arrays.toString(two));
    for(int i=sum.length-1;i<0;i--){
        temp = (one[i]+two[i]+temp);
        sum[i] = temp%10;
        temp = temp/10;
    }
    sum[0] = temp;
    System.out.println(Arrays.toString(sum));
    }
}