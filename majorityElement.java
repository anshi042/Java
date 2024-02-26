public class majorityElement {

        //Majority element problem using boyer moore's voting algorithm
        public static int majority(int[] nums) {
            int winner = nums[0];
            int lead = 1;
    
            //loop start from index 1 
            for(int idx =1;idx < nums.length;idx++){
                //condition of same integer
                if(nums[idx] == winner){
                    lead++;
                }else if(lead > 0){
                    lead--;
                }else{
                    winner = nums[idx];
                    lead = 1;
                }
            }
            return winner;
        }
    
        public static void main(String[] args){
            int[] nums = {1,1,2,3,1,1,2};
            System.out.println(majority(nums));
        }
    
    
}
