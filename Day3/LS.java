import java.util.*;

class LS{

    private static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

    public static int LS(int arr[], int x){

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }

        /// 

        return -1;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int arr[] = {80, 90, 33,10,10,10,40,30,40,50,55,60};

        // int x = scn.nextInt();

        // int idx = LS(arr,x);

        // System.out.println(idx);
        printArray(arr);
        SelectionSort(arr);
        printArray(arr);
        

    }


}