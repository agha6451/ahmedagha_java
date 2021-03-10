import java.util.*;
public class chap4dell{

    public static void main(String[] args){
        System.out.println("PLease enter the numerical value for today's month: ");
        Scanner todaymonth = new Scanner(System.in);
        int todaymonth = todaymonth.nextInt();
        System.out.println("Please enter today's day of the month: ");
        Scanner date = new Scanner(System.in);
        int todate = date.nextInt();
        System.out.println("Today's month is " +todaymonth +"/" +todate);
        System.out.println("Now type User 1's birth month: ");
        Scanner user1month = new Scanner(System.in);
        int user1m = user1month.nextInt();
        System.out.println("Please type the day of the month that is User 1's birthday: ");
        Scanner user1d = new Scanner(System.in);
        int user1d = user1d.nextInt();
        System.out.println("User 1's birthday is " +user1m +"/" +user1d);
        System.out.println("Now type User 2's birth month: ");
        Scanner user2month = new Scanner(System.in);
        int user2m = user2month.nextInt();
        System.out.println("Please type the day of the month that is User 2's birthday: ");
        Scanner user2d = new Scanner(System.in);
        int user2d = user2d.nextInt();
        System.out.println("User 2's birthday is " +user2m +"/" +user2d);
        yearconversion();
    }

    public static int yearconversion(){
        if(user1m == 2){
            user1d+=31
        }
        else if(user1m == 3){
            user1d+=59
        }
        else if(user1m == 4){
            user1d+=90
        }
        else if(user1m == 5){
            user1d+=120
        }
        else if(user1m == 6){
            user1d+=151
        }
        else if(user1m == 7){
            user1d+=181
        }
        else if(user1m == 8){
            user1d+=212
        }
        else if(user1m == 9){
            user1d+=243
        }
        else if(user1m == 10){
            user1d+=273
        }
        else if(user1m == 11){
            user1d+=304
        }
        else if(user1m == 12){
            user1d+=334
        }
        if(user2m == 2){
            user2d+=31
        }
        else if(user2m == 3){
            user2d+=59
        }
        else if(user2m == 4){
            user2d+=90
        }
        else if(user2m == 5){
            user2d+=120
        }
        else if(user2m == 6){
            user2d+=151
        }
        else if(user2m == 7){
            user2d+=181
        }
        else if(user2m == 8){
            user2d+=212
        }
        else if(user2m == 9){
            user2d+=243
        }
        else if(user2m == 10){
            user2d+=273
        }
        else if(user2m == 11){
            user2d+=304
        }
        else if(user2m == 12){
            user2d+=334
        }
        
    if(todaymonth == 2){
            todate+=31
        }
        else if(todaymonth == 3){
            todate+=59
        }
        else if(todaymonth == 4){
            todate+=90
        }
        else if(todaymonth == 5){
            todate+=120
        }
        else if(todaymonth == 6){
            todate+=151
        }
        else if(todaymonth == 7){
            todate+=181
        }
        else if(todaymonth == 8){
            todate+=212
        }
        else if(todaymonth == 9){
            todate+=243
        }
        else if(todaymonth == 10){
            todate+=273
        }
        else if(todaymonth == 11){
            todate+=304
        }
        else if(todaymonth == 12){
            todate+=334
        }
    }

}// todaymonth = variable for today's month
// todatde = variable for today's day of the month