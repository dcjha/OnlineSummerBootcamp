import java.util.*;
class Memo {

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;

    }

    public static void swap2(int arr[]){
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
    }

    public static class P{
        String name;
        int jno;
        public P(String name, int jno){
            this.name = name;
            this.jno = jno;
        }
    }


    public static void swap3(P p1,P p2){
        P t = p1;
        p1= p2;
        p2 = t;
    }


    public static void swap4(P p1, P p2){
            P t = new P(p1.name,p1.jno);
            p1.name = p2.name;
            p1.jno = p2.jno;

            p2.name = t.name;
            p2.jno = t.jno;


    }

    public static void main(String[] args) {
        
        // int a = 5;
        // int b = 10;
        // System.out.println(a + " " + b);
        
        // swap(a,b);
        
        // System.out.println(a + " " + b);

        // int arr[] = new int [2];//this cause memorry allocation in heap

        // arr[0]= 50;
        // arr[1] =100;

        // System.out.println(arr[0]+"  "+ arr[1]);
        // swap2(arr);
        // System.out.println(arr[0]+"  "+ arr[1]);


        P p1 = new P("Dhone",7);
        P p2 = new P("Sachin",10);

        System.out.println(p1.name +" "+ p1.jno);
        System.out.println(p2.name +" "+ p2.jno);

        // swap3(p1,p2);
        swap4(p1,p2);
        System.out.println("======");
        
        System.out.println(p1.name +" "+ p1.jno);
        System.out.println(p2.name +" "+ p2.jno);


    }
}

Dhone 7
Sachin 10
======
Sachin 10
Dhone 7