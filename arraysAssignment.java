import java.util.*;
public class arraysAssignment {

    // return true if same values in an array (brute force with time complexity O(n^2))
    public static boolean duplicate(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //return true if same valu in an array (hash set approach with time complexity O(n))
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    //
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[6];
        nums[0] = sc.nextInt();
        nums[1] = sc.nextInt();
        nums[2] = sc.nextInt();
        nums[3] = sc.nextInt();
        nums[4] = sc.nextInt();
        nums[5] = sc.nextInt();

        //System.out.println(duplicate(nums));
        //System.out.println(containsDuplicate(nums));


    }
}
