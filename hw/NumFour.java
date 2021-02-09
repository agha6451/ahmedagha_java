public class NumFour{

    public static final int STEP=5;
    public static void main (String [] args){
        for(int stp=1; stp<=STEP; stp++){
        head(stp);
        body(stp);
        feet(stp);
    }
    BOTLINE();
}

    public static void head(int stp){
        for(int face=1; face<=-5*stp + 5*STEP; face++){
            System.out.print(" ");
        }
            System.out.print(" 0  ******");
            for(int spaces=0; spaces<=5*stp-STEP; spaces++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

    public static void body(int stp){
        for(int f=1; f<=-5*stp + 5* STEP; f++){
            System.out.print(" ");
        }
        System.out.print("/|\\ *");
        for(int spaces=0; spaces<=5*stp; spaces++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void feet(int stp){
        for(int a=1; a<=-5*stp + 5* STEP; a++){
            System.out.print(" ");
        }
        System.out.print("/ \\ *");
        for(int spaces=0; spaces<=5*stp; spaces++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    public static void BOTLINE(){
        for(int ast=0; ast<6*STEP+1; ast++){
            System.out.print("*");
        }
    }
    
    }


    // Input: 1, 2, 3, 4, 5
    // Output: 1, 2, 3, 4, 5