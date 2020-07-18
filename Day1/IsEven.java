import java.util.*;

class IsEven {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();//
        // String name = "rohit";

        // if(n%2==0){
        //     System.out.println("yes even it is!");
        // }else{
        //     System.out.println(n + " is odd" + name);
        // }


        int a, b, c;
        //<< input , largest

        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
               System.out.println(b);
            }else{
                System.out.println(c);
            }
        }

            















    }

}