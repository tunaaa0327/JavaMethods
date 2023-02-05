package Methods;


public class perfectNumber {
    static boolean perfect(int a){
        int c=0;
        for (int i=1;i<a;i++){
            for (int z=1;z<=a;z++){
                if(i*z==a){
                    c+=i;
                }
            }
        }
        if(c==a){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i=0;i<500;i++){
            if(!perfect(i)) System.out.println(i);
        }
    }
}
