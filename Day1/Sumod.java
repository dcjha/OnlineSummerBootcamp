import java.util.*;

class Sumod {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;

        //123   4532    9844
        //321   2354    4489
        

        int temp = n;

        while(temp>0){
            //5
            int ld = temp%10; //5
            sum = sum + ld;//1 + 8 = 9 + 5 = 14
            temp = temp/10; //0

        }

        System.out.println(sum);

    }
    
}