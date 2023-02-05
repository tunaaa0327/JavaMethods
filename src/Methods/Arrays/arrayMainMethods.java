package Methods.Arrays;

import java.util.*;

public class arrayMainMethods {

    static int minArray(int [] array){
        int a=array[1];
        for(int i=0;i<array.length;i++){
            if(array[i]<a){
                a = array[i];
            }
        }
        return a;
    }

    static int maxArray(int [] array){
        int a=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>a){
                a = array[i];
            }
        }
        return a;
    }

    static int secondMax(int [] array){
        int a=0,b=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>a){
                b = a;
                a = array[i];
            }else if (array[i]>b){
                b = array[i];
            }
        }
        return b;

    }

    static int sumArray(int [] a){

        int b = 0;
        for(int i=0;i<a.length;i++) {
            b += Integer.parseInt(String.valueOf(a[i]));
        }
        return b;
    }

    static double aveArray(int [] a){
        int sum=0;
        for (int num:a) {
            sum+=num;
        }
        return (double) sum/a.length;
    }

    static int sumLargeandSmall(int [] a){
        int b =a[1], c=a[1];
        for(int num:a){
            if(num>b){
                b = num;
            }else if(num<c) {
                c =num;
            }
        }
        return b+c;
    }

    static String [] greatString(String [] a){
        int k=0,d=0;
        for (int i=0;i<a.length;i++) {
            if(a[i].length()>4){
                d++;
            }
        }
        String [] c = new String[d];
        for (int i=0;i<a.length;i++) {
            if(a[i].length()>4){
                c [k] = a[i];
                k++;
            }
        }
        return c;
    }

    public static ArrayList<String> vowelsIf(String [] a){
        ArrayList<String> word = new ArrayList<>();
        boolean b = false;
        for(int i=0;i<a.length;i++){
            for(int k=0;k<a[i].length();k++){
                if(a[i].charAt(k)=='a'||a[i].charAt(k)=='e'
                        ||a[i].charAt(k)=='i'||a[i].charAt(k)=='o'
                        ||a[i].charAt(k)=='u'){
                    b = true;
                    break;
                }else b=false;
            }
            if(b) word.add(a[i]);
        }
        return word;
    }
}
