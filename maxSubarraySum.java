public class maxSubarraySum {

    //brute force approach to finf Max subarray sum
    public static void brute(int nums[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                currSum =0;
                for(int k=i; k<=j; k++){
                    currSum += nums[k];
                }
                System.out.println("The sum of the subarray is: " +currSum);
                if(currSum > maxSum){
                    maxSum = currSum;  
                }
            }
        }
        System.out.println("The maximum sum of the subarray is: " + maxSum);
    }

     // Maximum subarray sum using prefix array
    public static void prefixSum(int nums[] ){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        //calculate prefix array
        prefix[0] = nums[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int start =i;
            for(int j=i+1; j<nums.length; j++){
                int end =j;
                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }
        System.out.println("max sum = " + maxSum);
    }

    //Kadanes's algorithm
    public static void kadanes(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            
            currSum += nums[i];
            if(currSum<0){
                currSum =0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println(maxSum);
    }

    public static void main(String [] args){

        /*brute approach to calculate the maximum sum of the subarray
        int nums[] = {1, -2, 6, -1, 3};
        brute(nums);

        int nums[] ={1, -2, 6, -1, 3};
        prefixSum(nums);*/

        int nums[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(nums);





    }
    
}
