public class NumFive{


    public static final int SIZE=3;
        public static void Line(){
            System.out.println("+=*=*=*=*=*=*+");
        }
         public static void RocketTop(){
             for(int i=0; i<5; i++){
                 for(int q=0; q<=-i+4; q++){
                    System.out.print(" ");
                 }
                 for(int s=0; s<=i; s++){
                     System.out.print("/");
                 }
                 System.out.print("**");
                 for(int a=0; a<=i; a++){
                    System.out.print("\\");
                 }
                 System.out.println();
             }
         }        

        public static void RocketBodyTop(){
            for(int i=0; i<3; i++){
                System.out.print("|");
                for(int q=0; q<-i+2; q++){
                    System.out.print(".");
                }
                for(int s=0; s<=i;s++){
                    System.out.print("/\\");
                }
                for(int a=0; a<-i+2;a++){
                System.out.print("..");
                }
                for(int s=0; s<=i;s++){
                    System.out.print("/\\");
                }
                for(int q=0; q<-i+2; q++){
                    System.out.print(".");
                }
                System.out.print("|");
                System.out.println();
            }
        }

        public static void RocketBodyBot(){
            for(int i=1; i<=3; i++){
                System.out.print("|");
                for(int q=0; q<= i-2; q++){
                    System.out.print(".");
                }
                for(int w=0; w<=-i+3; w++){
                    System.out.print("\\/");
                }
                for(int e=0; e< i-1; e++){
                    System.out.print("..");
                }
                for(int w=0; w<=-i+3; w++){
                    System.out.print("\\/");
                }
                for(int q=0; q<= i-2; q++){
                    System.out.print(".");
                }
                System.out.print("|");
                      System.out.println();  
                    }
        }

        public static void Sizing(){
            for(int siz=0; siz<SIZE-2; siz++){
                RocketBodyTop();
            RocketBodyBot();
            Line();
            RocketBodyBot();
            RocketBodyTop();
            Line();
            }
            }
public static void main (String [] args){
    RocketTop();
    Line();
Sizing();
RocketTop();
}
}