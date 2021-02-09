public class ForLoops{

public static void main(String [] args){
System.out.println();
for(int count=1; count < 5; count ++){
        System.out.println(-4*count+21);
    
}
System.out.println();

System.out.print("T-minus ");
for (int i = 5; i >= 1; i--) {
System.out.print(i + ", ");
}
System.out.println("Blastoff!");

DECDOTWNUM();

int max = 23;
int min = 13;
System.out.println(max * 2);
System.out.println(max + min);
System.out.println(max);
System.out.println(min);
}
public static void DECDOTWNUM(){
    for (int line=1; line<=5; line ++){
        for(int dots=1;dots<= -line+5; dots++){
            System.out.print(" ");
        }
        System.out.println(line);
    }
}
        public static void oddStuff() {
            int number = 4;
            for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
            }
            }
}
