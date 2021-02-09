


public class PseudoCodePractice{
    public static final int SIZE=4;
    public static void DASHLINE() {
        System.out.print("#");
        for(int dash=0; dash< SIZE*4; dash++){
            System.out.print("=");

        }
        System.out.println("#");
    }
    public static void TOP(){
        for (int line=1; line<= SIZE; line++) {
            System.out.print("|");
            spaceTop(line);
            Lips();
            for(int dots=1; dots<= 4*line-4; dots++){
                System.out.print(".");
            }
            Lips();
            spaceTop(line);
            System.out.println("|");
        }
    }
    public static void spaceTop(int line){
            for(int spaces=1; spaces<=-2*line+8; spaces++){
                System.out.print(" ");
            }
        }
    public static void LOW(){

    }
    public static void Lips() {
              System.out.print("<>");
    }
public static void main(String [] args) {
DASHLINE();
TOP();
}
}




// bottom spaces
    // ForLoop () 2*line -10 System.out.print(" ");
 // bottom dots
    // ForLoop() 