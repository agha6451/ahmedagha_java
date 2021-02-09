public class PlayingWithNumbers{

    public static final double tax=8.0/100;

    public static void main(String[] args)
{
    int num1 = 8;
    int num2 = 3;
    System.out.println("The division of the first number by the second number is "+ num1/num2); //it will truncate the decimal part
    System.out.println("The remainer is "+ num1/num2);

    int sub1 = 50;
    double sub2 = 10.08;
    double sum = sub1 + sub2;

    System.out.println("Your Subtotal is "+ sum);
    System.out.println("Your tax is "+ (sum)*tax);
    System.out.println("Your total is "+ (sum)+((sum)*tax));
}


}