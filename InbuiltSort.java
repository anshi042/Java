package Sortings;
import java.util.Arrays;
import java.util.Collections;



public class InbuiltSort {
    public static void print(Integer arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Integer arr[] = {8,2,6,3,5,7,4};
        

        Arrays.sort(arr, Collections.reverseOrder()); //descending order
        Arrays.sort(arr);  // ascending order sorting 
        Arrays.sort(arr, 0, 3); // ascending order sorting within given index
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // descending order sorting within given index
        print(arr);
    

    }
    
}
