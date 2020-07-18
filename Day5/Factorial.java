import java.util.*;

class Factorial {

    public static int factorial(int n){
        //stopping base
        //fn = n*f(n-1)
        
        // if(n>0){
        //     return n*factorial(n-1);
        // }

        if(n==0 || n==1  ){
            return 1;
        }

        int fnm1 = factorial(n-1);//pause
        return n * fnm1;


    }


    // f5 =  5* 24 = 120;
             
            
                
                
                 






    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = factorial(n);
        System.out.println(ans);

    }    
}