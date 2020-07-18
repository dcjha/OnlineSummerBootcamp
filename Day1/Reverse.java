import java.util.*;

class Reverse {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int rev = 0;  
        int temp = n;

        while(temp>0){
            int ld = temp%10;
            rev = rev * 10 + ld;
            temp  = temp /10;
        }
        
        System.out.println(rev);






    }

}