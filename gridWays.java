import java.math.BigInteger;

public class gridWays {
    // Find number of ways to each from (0,0) to (N-1, M-1) in a N*M Grid

    // Allowed Moves -- Right or Down

    // Time Complexity --> O(2^n+m) -- worst time complexity(exponential time)
    

    public static int countWays(int i, int j, int n, int m){
        //Base case
        if(i == n-1 && j == m-1){ //condition for last cell
            return 1;
        }else if(i == n || j == m){ // boundary cross condition
            return 0;
        }
        //Recursion
        int w1 = countWays(i+1, j, n, m);
        int w2 = countWays(i, j+1, n, m);
        return w1+w2;
    }

    //Linear time complexity with permutation approach with factorial function 
    public static BigInteger ways(int n, int m){
        BigInteger numerator = fact(n+m-2);

        BigInteger denominatorN = fact(n-1);

        BigInteger denominatorM = fact(m-1);

        return numerator.divide(denominatorN.multiply(denominatorM));

    }
    public static BigInteger fact(int n){
        return n <=1 ? BigInteger.ONE : BigInteger.valueOf(n).multiply(fact(n-1));
    }
    
    public static void main(String[] args) {
        int n = 3, m = 3;
        //System.out.println(countWays(0, 0, n, m));
        System.out.println(ways(3, 3));
        
    }
    
}
