import java.util.*;
public class xtraq{

public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.println("Please input the first number of the pair you want to find the average of: ");
int int1 = console.nextInt();
System.out.println("Please input the second number of the pair you want to find the average of: ");
int int2 = console.nextInt();
double avg=average(int1, int2);
System.out.println("The average of " +int1 +"and " +int2 +"is" +avg);
}

public static double average(int int1, int int2){
    return (double) ((int1+int2)/ 2.0);
}
}