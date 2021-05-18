import java.util.*;
import java.io.*;
public class Bank{

    public static void createBankStatement(bankAccount account, PrintStream bankstatement){ //creates the bankstatement by writing in a txt file
        bankstatement.println("Username: " +account.getUserName());
        bankstatement.println("Password: " +account.getPassword());
        bankstatement.println("Account ID Number: " +account.getAccountNumber());
        bankstatement.println("Account Type: " +account.getAccountType());
        bankstatement.printf("The amount of principal invesment: $%.2f", account.getAvailableBalance());
        bankstatement.println();
        bankstatement.println("Interest rate for your account: " +account.getInterestRate());
        bankstatement.println("The amount of money spent this month is " +account.getMonthSpend());
    }

    public static void displayAccountOptions(Scanner input, bankAccount account, PrintStream bankstatement){ // main method to show account optionsy

        System.out.println("What would you like to do? You can see account details, make a bank statement, deposit money, and withdraw money.");
        String in = input.nextLine();
        if(in.toLowerCase().contains("account details")){
            bankAccount.displayAccountDetails(account);
        } else if(in.toLowerCase().contains("bank statement")){
            createBankStatement(account, bankstatement);
        } else if(in.toLowerCase().contains("deposit")){
            bankAccount.Deposit(input, account);
        } else if(in.toLowerCase().contains("withdraw")){
            bankAccount.Withdraw(input, account);
        }
    }
    public static void main(String[] args) throws FileNotFoundException{// main argument, holding p much all the main methods
        boolean conti = true; //boolean for continuation/exiting program, used at the end.S
        PrintStream bankStatement = new PrintStream (new File ("bankStatement.txt"));
        File myFile = new File("C:\\Users\\anyda\\Dropbox\\My PC (DESKTOP-QV8U8TS)\\Documents\\ahmedagha_java-1\\bankAccountsList.txt");
        Scanner scan = new Scanner(myFile); // file scanner to get each line
        Scanner input = new Scanner(System.in); // main scanner to get user input
        bankAccount [] Accounts = new bankAccount [10]; //arrays to hold bankAccounts
        int Line=0;
        while(scan.hasNextLine()){ //starts the filling in of the object array by filling in the fields
            Scanner line = new Scanner(scan.nextLine());        // line scanner for each word in a line
            String usernameFromFile = line.next();
            String passwordFromFile = line.next();
            String accountTypeFromFile = line.next();
            Double availabelBalanceFromFile = line.nextDouble();
            Double interestRateFromFile = line.nextDouble();
            Double monthSpendFromFile = line.nextDouble();
            int accountNumberFromFile = line.nextInt();
            Accounts[Line] = new bankAccount(usernameFromFile, passwordFromFile, accountTypeFromFile, availabelBalanceFromFile, interestRateFromFile, monthSpendFromFile, accountNumberFromFile); //creates the SINGULAR object to put into the array
            Line++;
        }
        while(conti = true){
        System.out.println("Do you have an existing account with us? (type y or n)"); // queries the user for existing account
        String i = input.nextLine();
        if(i.toLowerCase().contains("y")){//will say if i has the letter y then display some other bank options once the user has correct credentials
            System.out.println("Enter Username: ");
            String username = input.nextLine();
            System.out.println("Enter Password: ");
            String password = input.nextLine();
                if(username.equals(Accounts[0].getUserName()) && password.equals(Accounts[0].getPassword())){
                    System.out.println("Login successful. Directing to bank options now...");
                    displayAccountOptions(input, Accounts[0], bankStatement); // displays the account options (to make a withdrawal, to deposit, etc)
                } else if(username.equals(Accounts[1].getUserName()) && password.equals(Accounts[1].getPassword())){
                    System.out.println("Login successful. Directing to bank options now...");
                    displayAccountOptions(input, Accounts[1], bankStatement); // displays the account options (to make a withdrawal, to deposit, etc)
                }else if(username.equals(Accounts[2].getUserName()) && password.equals(Accounts[2].getPassword())){
                    System.out.println("Login successful. Directing to bank options now...");
                    displayAccountOptions(input, Accounts[2], bankStatement); // displays the account options (to make a withdrawal, to deposit, etc)
                } else{
                    System.out.println("Login unsuccessful.");
                }
            }
    if(i.toLowerCase().contains("n")){// if the user said they dont have an existing account, it goes through this sequence to make an account by getting the fields
        System.out.println("Let's make an account. First, I'll need a username: ");
        String username1 = input.nextLine();
        System.out.println("Great! Next, I'll need a password to keep your account secure: ");
        String password1 = input.nextLine();
        System.out.println("Nice! The next step is the type of account you want to set up. You can choose savings, checking, debit, or brokerage.");
        String accountType = input.nextLine();
        System.out.println("Great! Now we'll need to know how much money you will be starting this account with: ");
        double availableBalance = input.nextDouble();
        System.out.println();
        double interestRate = 0.00;
        if(accountType.toLowerCase().contains("check")){
        interestRate = 0.02;
        } else if(accountType.toLowerCase().contains("broker")){
        interestRate = 0.00;
        } else if(accountType.toLowerCase().contains("savings")){
            interestRate = 0.05;
        } else if(accountType.toLowerCase().contains("debit")){
            interestRate = 0.01;
        }
        System.out.println();
        double accountNumber = Math.random();
        accountNumber *= 100000000;
        int intaccountnum = (int) accountNumber;

       double monthSpend = 0;
        bankAccount newAccount = new bankAccount(username1, password1, accountType, availableBalance, interestRate, monthSpend, intaccountnum); //makes the new account
       Accounts[3] = new bankAccount(username1, password1, accountType, availableBalance, interestRate, monthSpend, intaccountnum);//puts it into the object array
        System.out.println(Accounts[3].toString()); //prints the toString function
        displayAccountOptions(input, newAccount, bankStatement); // displays the account options (to make a withdrawal, to deposit, etc)
    }
    System.out.println("Would you like to continue? (y/n"); //asks user to continue
    String cont = input.next();
    if(cont.equals("y")){
        conti = true;
    } else{
        conti = false;
    }
    }
}   
}
