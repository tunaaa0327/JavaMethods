package Methods;

import java.util.*;

public class valueArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of Items in Array: ");
        int numArray = sc.nextInt();
        int [] stringA = new int[numArray];
        for(int i=0;i<numArray;i++ ){
            System.out.println("Input Array Item "+(i+1)+" : ");
            stringA [i] = sc.nextInt();
        }
        System.out.print(valueArrayMethods.sumLargeandSmall(stringA));
    }
}

