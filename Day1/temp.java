import java.util.*;
public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(facotrial(4));
        
        //System.out.println(power(6, 3));
        //pd(8);
        pi(8);
    }
    

    private static void pi(int n) {
		// TODO Auto-generated method stub
		if(n==0){
			return;
		}
		pd(n-1);
		System.out.println(n);
	}

    private static void pd(int n) {
		// TODO Auto-generated method stub
		if(n==0){
			return;
		}
		System.out.println(n);
		pd(n-1);
		
	}




    private static int power(int x, int n) {
		
		if(n==0){
			return 1;
		}
		
		return x*power(x,n-1);
		
    }
    
	private static int facotrial(int n) {
		
		if(n==0){
			return 1;
		}
		
		return n*facotrial(n-1);
		
	}

}
