public class friendsPairing {
    /*Given n friends, each one  can remain single or can be paired up with some other friend. 
    each friend can be paired only once.    (Using Recursion)
    find out the total number of ways in which friends can remain single or can be paired up.*/
    public static int pair(int n){
        //Base case
        if(n == 1 || n ==2){
           return n;
        }

        /*  kaam
        // choise to be single 
        int fnm1 = pair(n-1);
        
        //pair
        int fnm2 = pair(n-2);
        int pairWays = (n-1) * fnm2;

        //totWays
        int totWays = fnm1 + pairWays;
        return totWays; */
        
        return pair(n-1) + (n-1)* pair(n-2);
    }
    public static void main(String [] args){
       System.out.println(pair(3));
    }
}
