import java.util.*;

class Afun {

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 50 };

        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // int x = scn.nextInt();
        // int idx = LS(arr,x);

        // System.out.println(idx);

        // int k = scn.nextInt();
        // int i = BS(arr, k);
        // System.out.println(i);

        // reverse , change in same array
        // reverse(arr,0,arr.length-1);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int factor = scn.nextInt();
        rotate(arr, factor);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // swap(arr, 0,1); //swaps the value at respective index

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // int a = 1,b =2;
        // swapNum(a,b); //does not work

        // int sum = 0;

        // // for
        // for (int i = 0; i < n; i++) {
        // sum = sum + arr[i];
        // // sum += arr[i];
        // }

        // System.out.println("sum is: "+sum);

        // System.out.println(arr);//I@3ac3fd8b

        // float avgf = sum / n;
        // System.out.println("avg" + avgf);

        // double avg = sum /( n *1.0);
        // System.out.println("avg" + avg);

        // double avgd = (1.0 * sum) / n;
        // System.out.println("avgd"+avgd);

        // a = [12,23,56,88,89]; 5

        // a[0];

        // arr -> arr.length;
        // str = "abcd" 4 str.length()

    }

    private static void rotate(int[] arr, int factor) {

        factor =factor % arr.length;
        // 10 % 3 = 1
        // 10 % -3 = 1
        // -10 % 3 = -1
        // sign a % b = sign abs(a)%abs(b)
        // sign of b does not matter

        //suppose n is arr size, then 1 time 
        factor = factor < 0 ? factor + arr.length : factor;

        reverse(arr, 0, arr.length - 1);

        reverse(arr, 0, arr.length- factor-1);
        reverse(arr, arr.length - factor, arr.length - 1);
        // reverse(arr, 0, factor - 1);
        // reverse(arr, factor, arr.length - 1);
        // reverse(arr, 0, arr.length - 1);


    }

    // public static void rotate(int[] arr, int k) {
    //     k %= arr.length;
    //     k = k < 0 ? k + arr.length : k;

    //     reverse(arr, 0, k - 1);
    //     reverse(arr, k, arr.length - 1);
    //     reverse(arr, 0, arr.length - 1);

    // }

    private static void reverse(int[] arr, int l, int r) {

        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    private static int BS(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        // int mid = (l+r)/2;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k)
                return mid;
            else if (arr[mid] < k)
                l = mid + 1;
            else
                r = mid - 1;

            System.out.println(l + "," + r);
        }

        return -1;
    }

    private static int LS(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;
        }

        return -1;
    }

    private static void swapNum(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}