import java.util.*;

class TOH{

    public static void toh(int n , char s, char d, char h){
        


    }
    

    public static void tsum(int arr[], int idx , int tar,String ans){
        if(idx == arr.length){
            if(tar == 0){
                System.out.println(ans);
                return;
            }else{
                return;
            }
                

        }

        tsum(arr, idx+1, tar-arr[idx], ans + arr[idx]);//hold
        tsum(arr, idx+1, tar, ans);//

    }


    public static void main(String[] args) {
        // int n = 3;

        // toh(3,'s','d','h');

        // int arr[] = {10,20,30,40,50};

        // int tar = 60;

        // tsum(arr,0,tar,"");

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);


        

        System.out.println(st.size());
        System.out.println(st.peek());

        System.out.println(st.pop());
        
        
                System.out.println(st.size());
                System.out.println(st.peek());


    }


}