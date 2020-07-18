import java.util.*;

class BS {

    private static int BinarySearch(int[] arr, int x) {
       int l = 0;
       int r = arr.length-1;
       while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==x) return mid;
                // 2chize , ye to bada ya to chota
            if(x > arr[mid]){
                l = mid+1; //right side dhundege 
            }else{
                r = mid -1; // 
            }
       }
        //nahi mila
        return -1;
    }


    private static int BinarySearchLOWER(int[] arr, int x) {
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
             int mid = (l+r)/2;
             if(arr[mid]==x){
                if(mid == 0){
                    return mid;
                }
                if(arr[mid-1] == arr[mid]){
                    r = mid -1;
                }else{
                    return mid;
                }
             } 
                 // 2chize , ye to bada ya to chota
             if(x > arr[mid]){
                 l = mid+1; //right side dhundege 
             }else{
                 r = mid -1; // 
             }
        }
         //nahi mila
         return -1;
     }


     private static int BinarySearchUPPER(int[] arr, int x) {
        int l = 0;
        int r = arr.length-1;
        // {10,10,20,30,40,40,50,60,70,70,70,70,80};

        while(l<=r){
             int mid = (l+r)/2;
             if(arr[mid]==x){
                // return mid;
                if(mid == arr.length-1){
                    return mid;
                }
                if(arr[mid]==arr[mid+1]){
                    l= mid+1;
                }else{
                    return mid;
                }
            } else if(x > arr[mid]){
                 l = mid+1; //right side dhundege 
             }else{
                 r = mid -1; // 
             }
        }
         return -1;
     }
 
     
    



    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        int arr1[] = {...........................................10,10,10,10,10,10,10,10,10,20,30,40,40,50,60,70,70,70,70,80.................................};
                        //  ^                 ^  ^  
                        //  s                 e  m
        // int arr1[] = {10,20,30,40,50,50,60,50,70,80}; //7
        // int arr2[] = {10,50,30,40,50,50,60,50,70,80}; //1

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        // int idx = BinarySearchLOWER(arr1,x);
        int idx = BinarySearchUPPER(arr1,x);

        System.out.println(idx);


    }

    
}