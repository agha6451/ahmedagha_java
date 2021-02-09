public class Cw{
public static void main(String [] args){
for(int pat=0;pat<=7; pat++){
    for(int spaces=0; spaces<=pat; spaces++){
        System.out.print("v");
    }
    System.out.println();
for(int backpyr=6;backpyr<6-2*pat; backpyr--){
    System.out.print("/");
    System.out.print("/");
}
System.out.println();
}


}
}