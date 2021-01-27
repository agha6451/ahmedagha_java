public class HW{         
    public static void DECDOTWNUM(){ //#7 method part of answer
        for (int line=1; line<=5; line ++){
            for(int dots=1;dots<= -line+5; dots++){
                System.out.print("");
            }
            System.out.println(line);     
        }
    
    }
    public static void HEAD(){
        System.out.print("_-^-_");
    } 

    public static void DOWNWARDPYRAMID(){
        for(int lin=0;lin<=5; lin++){
            for(int cos=1;cos<= -lin+5; cos++){
                System.out.print("-");
            }
            System.out.print("-");
            System.out.println();
        }
    }

    public static void INVERSEDOWNWARDPYRAMID() {
        for(int len=0; len<=5; len++){
            for(int lan=5; lan<= -len+5; lan++){
                System.out.print("-");
            }
            System.out.print("-");
            System.out.println();
        }
    }
        public static void ODDPYRAMID(){
            for(int let=1; let<=9; let+=2){
                System.out.print(let);
            }
        }
    
    public static void main (String [] args){
        DECDOTWNUM(); //#7 answer                       // System.out.print("---");
        for(int das=0; das<=10; das++){
            System.out.print("----");
        }
        System.out.println();
            for(int row=0; row<=8; row++){
                HEAD();
            }
            System.out.println();
        
for(int reps=0;reps<2; reps++){
        for(int numbers=0; numbers<= 9; numbers++){
            System.out.print(numbers);
            System.out.print(numbers);
 }           
        System.out.print("0");
    }
    System.out.println();
for(int das=0; das<=10; das++){
                System.out.print("----");
            }
            System.out.println();
            DOWNWARDPYRAMID();
            ODDPYRAMID();
            INVERSEDOWNWARDPYRAMID();

}
}