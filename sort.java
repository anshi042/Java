package Sortings;

//basic sortings in descending orders

public class sort {
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]<arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current =arr[i];
            int prev = i-1;
            while(prev >= 0 && current > arr[prev]){
                arr[prev+1] =arr[prev];
                prev--;
            }
            //place element
            arr[prev+1] = current;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1]; //frequency
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1; i>=0; i--){ //printing count array
            while(count[i]>0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }
    }


    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[]  = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        //countingSort(arr);
        print(arr);
    }
    
}
