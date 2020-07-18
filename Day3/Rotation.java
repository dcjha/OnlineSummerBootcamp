import java.util.*;
class Rotation {

    private static void printArray(int[] arr) {

        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    private static void reverse(int[] arr, int l, int r) {
        // int l = 0;
        // int r = arr.length -1;

        while(l<r){
            //swap ka logic
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            //updation
            l++;
            r--;
        }


    }





    public static void rotate(int arr[], int f){

        f = f % arr.length;

        if(f<0){
            f += arr.length;
        }


        reverse(arr,0,arr.length-1); //complete

        reverse(arr, 0,arr.length- 1 -f); //first part

        reverse(arr, arr.length-f ,arr.length-1); //second part

        System.out.println("we r done here");

    }




    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80};
        Scanner scn = new Scanner(System.in);

        int factor = scn.nextInt();

        printArray(arr);
        
        rotate(arr,factor);
        
        printArray(arr);




    }



    
}