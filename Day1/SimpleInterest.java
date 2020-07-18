import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);//

        int r = 5;//fixed

        int p = scn.nextInt(); //waitng for input from the user
        int t = scn.nextInt();

        int si = (p*r*t)/100;

        System.out.println(si);


    }    
}