import java.util.*;
public class sumOfSubArrays {

    //sum of the subarrays
    public static void sum_subarray(int sub[]){

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<sub.length; i++){
            int sum =0;
            for(int j=i+1; j<sub.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(sub[k] +" ");
                    sum += sub[k];
                    
                }
                System.out.println("The sum is: " + sum);
                maxSum = Math.max(maxSum, sum);
                minSum = Math.min(minSum, sum);
            }
            System.out.println();
        }
        System.out.println("the maximum sum is: " +maxSum);
        System.out.println("the minimum sum is: " + minSum);
        
    }
    
    public static void main(String [] args){
        int sub[] = {2, 4, 6, 8};
        sum_subarray(sub);
      

    }
}
