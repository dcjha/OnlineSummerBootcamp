import java.util.*;
class PRICECON {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int k = scn.nextInt();
            // int p[] = new int[n];
            
            int loss = 0;
            for(int i = 0; i<n; i++){
                int p = scn.nextInt();
                if(p>k){
                    loss += p-k;
                }
            }
            System.out.println(loss);
        }
        
    }
}