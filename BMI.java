
import java.util.*;
public class BMI{
    public static void main(String[] args){
        System.out.print("Please enter your height in inches: ");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        System.out.println("Your height is " +height +" inches");
        System.out.print("Please enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Your weight is " +weight +" pounds");
        double bmi = (weight/(height*height))*703;
        System.out.printf("You BMI is %.3f\n" ,bmi); //f means float, decimal shows rounding to nearest number, \n means println
        CheckBMI(bmi);

        System.out.print("Please enter your height in inches: ");
        double heighte = input.nextDouble();
        System.out.println("Your height is " +heighte +" inches");
        System.out.print("Please enter your weight in pounds: ");
        double weighte = input.nextDouble();
        System.out.println("Your weight is " +weighte +" pounds");
        double bmie = (weighte/(heighte*heighte))*703;
        System.out.printf("You BMI is %.3f\n" ,bmie); //f means float, decimal shows rounding to nearest number, \n means println
        CheckBMI(bmie);
        System.out.printf("The difference in BMI is %.3f\n" ,(bmi-bmie));
    }


public static void CheckBMI(double bmi){
    if(bmi<18.5){
        System.out.println("You are underweight");
    }
    else if(bmi>=18.5 && bmi<=24.9){
        System.out.println("You have normal BMI.");
    }
    else if(bmi>=25 && bmi<=29.9){
        System.out.println("You are overweight");
    }
    else if(bmi>=30){
        System.out.println("You are obese. If you want to live a long life, start working out now.");
    }
}
}