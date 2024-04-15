import java.util.ArrayList;
public class frequentNums {
    public static int mostFrequent(ArrayList<Integer> nums, int key){
        int[] count = new int[1001]; //count array

        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i)==key){
                count[nums.get(i+1)]++;
            }
        }

        //finding the index with the greatest entry
        int max = 0;
        int target =0;
        for(int i=0; i<count.length; i++){
            //max = count[i]>count[max] ? i : max;
            if(count[i]> count[max]){
                target = i;
                max = count[i];

            }
        }

        return target;
        
    }


    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(1);
        nums.add(10);
        nums.add(1);
        nums.add(10);
        nums.add(8);

        int key = 1;

        System.out.print(mostFrequent(nums, key));
        
        
    }
    
}
