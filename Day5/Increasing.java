import java.util.*;

class Increasing {
    
    
    private static void printInc(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }
        //pre
        printInc(n-1);//call
        //post
        System.out.println(n);
    
    }


    //5

    // //4
    // 1
    // 2
    // 3
    // 4


    // //inc(4);


    // //0 ---> return;
    // 1 // ---> print(1); return;
    // 2
    // 3
    // 4
    // syso(5);





 private static void printDec(int n) {
        if(n==1){
            System.out.println(1);
            return;
        }

        
        System.out.println(n);
        //pre
        printDec(n-1);//call
        //post
    
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // printInc(n);
        printDec(n);

    }


}