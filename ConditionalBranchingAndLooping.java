/*
Ahmed Agha
Conditional Branching and Looping Homework
3/01/21
*/
public class ConditionalBranchingAndLooping{

    public static void main(String[] args){
        swapPairs("example");
    }

    public static String swapPairs(String a) {
        String t="";
        if(a.length()%2==0) {
            for (int i=0;i<a.length()/2;i++) {
                t+=a.charAt(2*i+1)+a.charAt(2*i);
            }
        }
        else {
            for (int i=0;i<a.length()/2;i++) {
                t+=a.charAt(2*i+1)+a.charAt(2*i);
             }
            t+=a.charAt(a.length()-1);
        }
        return t;
    } // this is the method for pg 299 #14

 // this is the method for pg 299 #16
}
