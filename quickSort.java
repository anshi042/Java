public class quickSort {

    //Function to choose pivot
    public static void pivot(int arr[], int si, int ei){
        //Base case
        if(si >= ei){
            return;
        }
        //recursion
        int pIdx = partition(arr, si, ei);
        pivot(arr, si, pIdx-1);//left part
        pivot(arr, pIdx+1, ei);//rightt part

    }

    //Function for partition according to pivot
    public static int partition(int arr[], int si, int ei){
        int pvt = arr[ei];
        int i = si-1; //to make place for elements smaller than pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pvt){
                i++;
                //swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pvt;
        arr[ei] = arr[i]; 
        arr[i] = temp;
        return i;
    }

    //Function to print an array
    public static void printArr(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {6, 3, 9, 8, 2, 5};
        pivot(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
