import java.util.*;

class Reverse {


    // private static void printArray(int[] arr) {

    //     for(int i = 0 ; i < arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();

    // }

    // private static void tarSum(int[] arr, int sp, int tar, String asf) {
		
	// 	if(sp == arr.length){
	// 		if(tar==0){
	// 			System.out.println(asf);	
	// 		}
	// 		return;	
	// 	}
		
	// 	tarSum(arr, sp+1, tar-arr[sp], asf+ arr[sp]);
	// 	tarSum(arr, sp+1, tar, asf+" ");
		
	// }


    // private static void reverse(int[] arr) {
    //     int l = 0;
    //     int r = arr.length -1;

    //     while(l<r){
    //         //swap ka logic
    //         int temp = arr[l];
    //         arr[l] = arr[r];
    //         arr[r] = temp;
            
    //         //updation
    //         l++;
    //         r--;
    //     }


    // }



    
	private static void tarSum2(int[] arr, int sp, int tar, ArrayList<Integer> asf) {
		//asf single one copy in memeory
		//faster method
		
		
		if(sp == arr.length){
			if(tar == 0){
				System.out.println(asf);
			}
			return;
		}
		asf.add(arr[sp]);
		tarSum2(arr,sp+1,tar-arr[sp],asf); // asf is passed as reference
		// asf is formed ONLY ONCE  IN HEAP MEMORY and it's address (4K) is stored in stack memory
		
		asf.remove(asf.size()-1);
		
		
		tarSum2(arr,sp+1,tar,asf);
		
		
	}
	
	
	

	private static void tarSum(int[] arr, int sp, int tar, String asf) {
		
		if(sp == arr.length){
			if(tar==0){
				System.out.println(asf);	
			}
			return;	
		}
		
		tarSum(arr, sp+1, tar-arr[sp], asf+ arr[sp]);
		tarSum(arr, sp+1, tar, asf+" ");
		
	}


    public static void main(String[] args) {
        // int arr[] = {10,20,30,40,50,60,70,80};

        // printArray(arr);
        
        // reverse(arr);
        
        // printArray(arr);


        int[] arr = {10,20,30,50,70};
        		tarSum(arr,0,70,"");
                
                ArrayList<Integer> asf= new ArrayList<>();
                tarSum2(arr,0,70,asf);



    }

   
    
}