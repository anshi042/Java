
public class printXn {
    public static int power(int x, int n){
        if(n == 1){
            return x;
        }
        // int fXnm1 = power(x ,n-1);
        // int fX = x * fXnm1;
        // return fX;

        return x * power(x, n-1);
    }
    public static void main(String[] args){
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }
}
