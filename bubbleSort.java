package Sortings;
public class bubbleSort {
    public static void bubble(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }

    }
    public static void arr(int nums[]){
        for(int k=0; k<nums.length; k++){
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int nums[] = {5, 4, 1, 3, 2};
        bubble(nums);
        arr(nums);

    }
    
}
