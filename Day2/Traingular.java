
import java.util.*;

class Traingular {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n  = scn.nextInt();//4

        // for(int line = 1; line <=n ;line++){

        //     for(int star  = 1; star<=line; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // |->
        // |-->
        // |--->
        // |----->
        // V


// input 4
// 1
// 23
// 456
// 78910
        int counter = 1;

        for(int i = 1; i<= n ; i++ ){

            for(int j = 1 ;  j<=i; j++  ){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }




    }

}