package Methods;
import java.util.*;

public class stringArray {
    public static void main(String[] args) {
        inputArray();
        
    }


    static String longest(String [] wordArray){
        String wordLong = wordArray[1];
        for(int i=0;i<wordArray.length;i++){
            if(wordArray[i].length()>wordLong.length()){
                wordLong = wordArray[i];
            }
        }
        return wordLong;
    }

    static int countwords(String [] wordArray){
        int word=0;
        for(int i=0;i<wordArray.length;i++){
            if(wordArray[i].startsWith("a")){
                word++;
            }
        }
        return word;
    }


    static String [] reverseOnlyString(String [] wordArray){
        int sizeArray=0,dummy,k=0;
        for(int i=0;i<reverseArray(wordArray).length;i++){
            try{
                dummy = Integer.parseInt(reverseArray(wordArray)[i]);
            }catch(Exception e){
                sizeArray++;
            }
        }
        String [] reverseString = new String [sizeArray];
        for(int i=0;i<reverseArray(wordArray).length;i++){
            try{
                dummy = Integer.parseInt(reverseArray(wordArray)[i]);
            }catch(Exception e){
                reverseString [k] = reverseArray(wordArray)[i];
                k++;
            }
        }
        return reverseString;
    }

    static int [] reverseNum(String [] wordArray){
        int sizeArray=wordArray.length, dummy=0,k=0;
        for(int i=0;i<reverseArray(wordArray).length;i++){
            try{
                dummy = Integer.parseInt(reverseArray(wordArray)[i]);
            }catch(Exception e){
                sizeArray--;
            }
        }

        int reverseNum [] = new int[sizeArray]; 
        for(int i=0;i<sizeArray;i++){
            try{
                reverseNum [k] = Integer.parseInt(reverseArray(wordArray)[i]);
                k++;
            }catch(Exception e){
                continue;
            }
        }

        return reverseNum;
    }

    static String [] reverseArray(String [] wordArray){
        String [] reverseWord = new String [wordArray.length];
        int num = (wordArray.length)-1;
        for(int i=0;i<wordArray.length;i++){
            reverseWord[num] = wordArray[i];
            num--;
        }
        return reverseWord;
    }






    static void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of Items in Array: ");
        int numArray = sc.nextInt();
        String [] wordArray = new String [numArray];
        for(int i=0;i<numArray;i++){
            System.out.print("Input Item in Array: ");
            wordArray [i] = sc.next();
        }
        System.out.println("-------------------------------------");
        System.out.println("Longest word in array is: "+longest(wordArray));
        System.out.println("Number of word starts with letter (a) in array is: "+countwords(wordArray));
        System.out.println("Reverse Array: "+Arrays.toString(reverseArray(wordArray)));
        System.out.println("Reverse Int in Array: "+Arrays.toString(reverseNum(wordArray)));
        System.out.println("Reverse String in Array: "+Arrays.toString(reverseOnlyString(wordArray)));

    }
}


