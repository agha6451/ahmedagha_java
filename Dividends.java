public class Dividends{
    public static void main(String[] args){

        double Div = 0.065;
        int Shares = 100;
        double dividend = Div*Shares;

        for(int i=0; i<=120; i++){
            System.out.println("The total dividends for week " +i +" is " + (((i)*Div)));
System.out.print(dividend);
            }

    }
    }