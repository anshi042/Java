public class fibonacci {
    //print nth fibonacci number (fib(n+2) = fib(n) + fib(n+1) or  fib(n) = fib(n-1) + fib(n-2))
    public static int fib(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String [] args){
        int n = 8;
        System.out.println(fib(n));
    }
    
}
