import java.util.*;
public class bankAccount {
    private String username; //instance variable fields
    private String password;
    private String accountType;
    private double availableBalance;
    private double interestRate;
    private double monthSpend;
    private int accountNumber;

    //First section is constructors

    public bankAccount(){
        username = "defaultusername";
        password = "defaultpassword123";
    }

    public bankAccount(String username1, String password1, String accountType1, double availableBalance1, double interestRate1, double monthSpend1, int accountNumber1){
        username=username1;
        password=password1;
        accountType=accountType1;
        availableBalance=availableBalance1;
        interestRate=interestRate1;
        monthSpend=monthSpend1;
        accountNumber=accountNumber1;
    }

    //assesor methods

    public String getUserName(){
        return username; 
    }

    public String getPassword(){
        return password; 
    }

    public String getAccountType(){
        return accountType;
    }

    public double getAvailableBalance(){
        return availableBalance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double getMonthSpend(){
        return monthSpend;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    //mutator methods

    public void setUsername(String newUsername){
        username = newUsername;
    }

    public void setPassword(String newPassword){
        password = newPassword;
    }

    public void setAccountType(String newAccountType){
        accountType = newAccountType;
    }

    public void setAvailableBalance(Double newAvailableBalance){
        availableBalance = newAvailableBalance;
    }

    public void setInterestRate(Double newInterestRate){
        interestRate = newInterestRate;
    }

    public void setMonthSpend(Double newMonthSpend){
        monthSpend = newMonthSpend;
    }

    public void setAccountNumber(int newAccountNumber){
        accountNumber = newAccountNumber;
    }

    public String toString(){
        return ("The username is " +username +". The password is " +password + ". The account type is " +accountType +". Your available balance is " +availableBalance +". The interest rate on your account is " +interestRate +". The amount spent from your account this month is " +monthSpend + ". Your account number is " +accountNumber);
    }

    public static void Deposit(Scanner in, bankAccount newaccount){ //method to recieve data from a deposit
        System.out.println("What was the date of the deposit?");
        String date = in.next();
        System.out.println("How much money was deposited into your account?");
        double deposit = in.nextDouble();
        System.out.printf("The deposit on " +date +"resulted in a change of " +deposit +". The new balance is " +(deposit+newaccount.availableBalance));
        newaccount.availableBalance += deposit;
    }

    public static void displayAccountDetails(bankAccount account){ //way to get the details of an account without calling the toString method from the object class
        System.out.println("Your account has now been set up. Here are your account details: ");
        System.out.println("Username: " +account.getUserName());
        System.out.println("Password: " +account.getPassword());
        System.out.println("Account ID Number: " +account.getAccountNumber());
        System.out.println("Account Type: " +account.getAccountType());
        System.out.printf("The amount of principal invesment: $%.2f", account.getAvailableBalance());
        System.out.println();
        System.out.println("Interest rate for your account: " +account.getInterestRate());
        System.out.println("The amount of money spent this month is " +account.getMonthSpend());
}

    public static void Withdraw(Scanner in, bankAccount newaccount){ // way to create a withdrawal sequence
        System.out.println("What is the date of withdrawal?");
        String date = in.next();
        System.out.println("How much money would you like to withdraw?");
        double withdraw = in.nextDouble();
        System.out.printf("You will be withdrawing %.2f", withdraw, "from your account on ", date ,". Your total balance now is %.2f" ,(newaccount.availableBalance-withdraw));
        newaccount.monthSpend -= withdraw;
        newaccount.availableBalance -=withdraw;
    }
}
