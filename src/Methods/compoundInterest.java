package Methods;

import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        int year;
        double rate, amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Cash: ");
        amount = sc.nextDouble();
        System.out.print("Input Interest: ");
        rate = sc.nextDouble();
        rate /= 100;
        System.out.print("Input Year: ");
        year = sc.nextInt();

        calculation(year,rate,amount);

    }


    static double interestPay(double interest,double amount,int elapse){
        double finalAmount, parenthesis,power;
        parenthesis = 1+interest;
        power = Math.pow(parenthesis,elapse);
        finalAmount = amount*power;
        return finalAmount;

    }

    static void calculation(int year, double rate, double amount){
        System.out.println("Year\t\tPay");
        for (int i=1;i<=year;i++){
            System.out.println(i+"\t\t\t"+String.format("%.2f",interestPay(rate,amount,i)));
        }
    }
}