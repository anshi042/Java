public class searchInRotatedSortedArray {
    /*input -> sorted ,rotated array with distinct numbers (in ascending order) 
      it is rotated at a point, 
     find the index of given element */

    public static int search(int arr[], int tar, int si, int ei){
        //Base case
        if(si > ei){
            return -1;
        }
        
        //mid
        int mid = si + (ei-si)/2;

        // case found
        if(arr[mid] == tar){
            return mid;
        }

        //recursion

        // target on Line 1 acc to graph
        if(arr[si]<= arr[mid]){
            // case a: at left on L1
            if(arr[si]<= tar && tar<= arr[mid]){
                return search(arr, tar, si, mid-1);
                }

            // case b : at right on L1
            else{
                return search(arr, tar, mid+1, ei);
               }
        }
        
        //mid on line 2 
        else{
            // case c : at right on L2
            if(arr[mid] <= tar && tar <= arr[ei] ){
                return search(arr, tar, mid+1 , ei);
            }

            // case d : at left on L2
            else{
                return search(arr, tar, si, mid -1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; //output -> 4
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
        
    }
}
