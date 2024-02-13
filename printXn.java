public class printXn {
    //find X^n using recursion with time complexity O(n)
    public static int power(int x, int n){
        if(n == 1){
            return x;
        }
        // int fXnm1 = power(x ,n-1);
        // int fX = x * fXnm1;
        // return fX;

        return x * power(x, n-1);
    }

    //Optimized solution with time complexity O(log n)
    public static int pow(int x, int n){
        if(n ==0){
            return 1;
        }
        int halfPowSq = pow(x, n/2) * pow(x, n/2);

        // when n is odd
        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    
    public static void main(String[] args){
        int x = 2;
        int n = 10;
        //System.out.println(power(x, n));
        System.out.println(pow(x, n));
    }
}
