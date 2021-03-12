import java.util.*;
public class chap4dell{
    
    public static void main(String[] args){
        System.out.println("Please enter the numerical value for today's month: ");
        Scanner month = new Scanner(System.in);
        int today = month.nextInt();
        System.out.println("Please enter today's day of the month: ");
        Scanner date = new Scanner(System.in);
        int todate = date.nextInt();
        System.out.println("Today's month is " +today +"/" +todate);
        if(today == 2){
            todate+=31;
        }
        else if(today == 3){
            todate+=59;
        }
        else if(today == 4){
            todate+=90;
        }
        else if(today == 5){
            todate+=120;
        }
        else if(today == 6){
            todate+=151;
        }
        else if(today == 7){
            todate+=181;
        }
        else if(today == 8){
            todate+=212;
        }
        else if(today == 9){
            todate+=243;
        }
        else if(today == 10){
            todate+=273;
        }
        else if(today == 11){
            todate+=304;
        }
        else if(today == 12){
            todate+=334;
        }
        System.out.println("Now type User 1's birth month: ");
        Scanner user1month = new Scanner(System.in);
        int user1m = user1month.nextInt();
        System.out.println("Please type the day of the month that is User 1's birthday: ");
        Scanner user1day = new Scanner(System.in);
        int user1d = user1day.nextInt();
        System.out.println("User 1's birthday is " +user1m +"/" +user1d);
        System.out.println("Now type User 2's birth month: ");
        if(user1m == 2){
            user1d+=31;
        }
        else if(user1m == 3){
            user1d+=59;
        }
        else if(user1m == 4){
            user1d+=90;
        }
        else if(user1m == 5){
            user1d+=120;
        }
        else if(user1m == 6){
            user1d+=151;
        }
        else if(user1m == 7){
            user1d+=181;
        }
        else if(user1m == 8){
            user1d+=212;
        }
        else if(user1m == 9){
            user1d+=243;
        }
        else if(user1m == 10){
            user1d+=273;
        }
        else if(user1m == 11){
            user1d+=304;
        }
        else if(user1m == 12){
            user1d+=334;
        }
        Scanner user2month = new Scanner(System.in);
        int user2m = user2month.nextInt();
        System.out.println("Please type the day of the month that is User 2's birthday: ");
        Scanner user2day = new Scanner(System.in);
        int user2d = user2day.nextInt();
        System.out.println("User 2's birthday is " +user2m +"/" +user2d);
        if(user2m == 2){
            user2d+=31;
        }
        else if(user2m == 3){
            user2d+=59;
        }
        else if(user2m == 4){
            user2d+=90;
        }
        else if(user2m == 5){
            user2d+=120;
        }
        else if(user2m == 6){
            user2d+=151;
        }
        else if(user2m == 7){
            user2d+=181;
        }
        else if(user2m == 8){
            user2d+=212;
        }
        else if(user2m == 9){
            user2d+=243;
        }
        else if(user2m == 10){
            user2d+=273;
        }
        else if(user2m == 11){
            user2d+=304;
        }
        else if(user2m == 12){
            user2d+=334;


        }
        date.close();
        user1month.close();
        user1day.close();
        user2month.close();
        user2day.close();

        if((int)Math.abs(user1d-todate)>(int)Math.abs(user2d-todate)) {
            System.out.println("User 1's birthday is closer than User 2's birthday by " +Math.abs(user1d-todate));
        }

        else{
            System.out.println("User 2's birthday is closer than User 1's birthday by " +Math.abs(user2d-todate));
        }

        System.out.println("There are " +(todate-user1d) +" days until User 1's birthday and " +(todate-user2d) +" days until User 2's birthday");
    }
}