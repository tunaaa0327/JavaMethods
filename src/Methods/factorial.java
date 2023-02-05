package Methods;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = sc.nextInt();
        System.out.println(facto(a));


    }

    static int facto(int a){
        int b=1;
        for (int i=1;i<=a;i++){
            b*=i;
        }
        if(a==0) return 0;
        else return b;
    }
}
