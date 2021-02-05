public class NumThree{

    public static final int Size=2;

    public static void PlusLine() {
        System.out.print("+");
        for(int dash=0; dash<10;dash++){
            System.out.print("-");
        }
        System.out.print("+");
        }

        public static void TOPBOX(){
            for(int q=1; q<= 4; q++){
                System.out.print("|");
                for(int spaces=1; spaces <=-q+5; spaces++){
                    System.out.print(" ");
                }
                for(int slash = 1; slash < q; slash ++){
                    System.out.print("/");
                }
                System.out.print("*");
                for(int backslash=1;backslash < q; backslash++){
                    System.out.print("\\");
                }
                for(int space=1; space<= -q+5; space++){
                    System.out.print(" ");
                }
                System.out.println("|");
            }
        }


    public static void BottomBox(){
        for(int q=0; q<3; q++){
            System.out.print("|");
            for(int i=0; i<=q; i++){
                System.out.print(" ");
            }
            for(int i=1; i<=-q+3; i++){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int i=1; i<=-q+3; i++){
                System.out.print("/");
            }
            for(int i=0; i<=q; i++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
public static void main( String[] args){
    PlusLine();
    System.out.println();
    TOPBOX();
    BottomBox();
    PlusLine();
    System.out.println();
    BottomBox();
    TOPBOX();
    PlusLine();
}
}