public class tilingProblem {
    public static int tiles(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //logic
        //vertical choice
        int fnm1 = tiles(n-1);

        //horizontal choice
        int fnm2 = tiles(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String [] args){
        System.out.println(tiles(4));
    }
}
