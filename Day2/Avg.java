import java.util.*;

class Avg {

    // Scanner scn = new Scanner(System.in);

    // fun(){
        // Scanner scn1 =  new Scanner(System.in);

    //     int input = scn
    // }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        //n
        int n = scn.nextInt();
        int arr[] = new int[n]; //0

        for(int i = 0 ; i< n; i++){
            arr[i] = scn.nextInt();
        }

        fun();

        // for(int i = 0 ; i < n; i++){
        //     System.out.print(arr[i] + ",");
        // }

            int sum = 0;
            
            //for
            for(int i = 0 ; i < n ; i++){
                sum = sum + arr[i];
               // sum += arr[i];
            }


            double avg =(1.0 *sum)/n; 



            System.out.println(avg);

    // a =  [12,23,56,88,89]; 5

    // a[0];

    // arr -> arr.length;
    // str = "abcd" 4 str.length()



    }    
}