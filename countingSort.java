package Sortings;

public class countingSort {
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count [] = new int[largest+1];
        for(int i=0; i<arr.length; i++){  //counting frequency and iterating on original array
            count[arr[i]]++;
        }

        //sorting
        int j =0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print(int arr[]){
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String [] args) {
        int arr[] = {1,4,2,1,4,6,2};
        counting(arr);
        print(arr);

    }
    
}
