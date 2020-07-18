import java.util.Scanner;

class NegModulo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(a%b);
        // 10 % 3 = 1
        // 10 % -3 = 1
        // -10 % 3 = -1
        // sign a % b = sign abs(a)%abs(b)
        // sign of b does not matter

    }    
}