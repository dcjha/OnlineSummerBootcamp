import java.util.*;

class Pattern {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspaces = n-1;
        int nstars = 1;
        for(int i = 1 ; i<= n ; i++ ){
            for(int j = 1 ; j <= nspaces ; j++){
                System.out.print(" ");
                
            }

            for(int k = 1 ; k <= nstars ; k++){
                System.out.print("*");
            }
            System.out.println();
            nspaces--;
            nstars = nstars+2;

        }
        
        
}



}