package Methods;
import java.util.ArrayList;

public class perfectSquare {
    public static void main(String[] args) {
        ArrayList<Integer> sqrooted = new ArrayList<>();
        ArrayList<Integer> non = new ArrayList<>();
        for (int i=0;i<=100;i++){
            if(perSquare(i)) sqrooted.add(i);
            else non.add(i);
        }
        System.out.println("Perfect: "+sqrooted);
        System.out.println("Non: "+non);
    }

    public static boolean perSquare(int a){
        for(int i=0;i<=a;i++){
            if(i*i==a) return true;
        }
        return false;
    }
}