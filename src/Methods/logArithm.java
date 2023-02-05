package Methods;

import java.util.Scanner;

public class logArithm {
    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base: ");
        base = sc.nextInt();
        System.out.print("Input Exponent: ");
        exponent = sc.nextInt();
        System.out.println("Log "+exponent+" base "+base+" is "+log(base,exponent));
    }

    static int log(int base, int exponent){
        int b=base, i=1;
        if(exponent==1) return 0;
        while(b!=exponent){
            b *=base;
            i++;
            if(b==exponent) return i;
        }
        return i;
    }



}
