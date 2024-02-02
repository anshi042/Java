package Sortings;

public class selectionSort { // Time complexity is O(n^2)
    public static void selection(int arr[]){
       for(int i=0; i<arr.length-1; i++){
        int minPos = i;
        for(int j= i+1; j<arr.length; j++){
            if(arr[minPos] > arr[j]){
                minPos = j;
            }
        }
        //swap
       int temp = arr[minPos];
       arr[minPos] = arr[i];
       arr[i] = temp;
       }  
    }

    public static void print(int arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {5, 4, 1, 2, 3};
        selection(arr);
        print(arr);

    }
    
}
