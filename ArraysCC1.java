import java.util.*;

public class ArraysCC1{

    //passsing arguments in array by 
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] +1;
        }
            
    }

    //linear search functon
    public static int linear_search(int numbers[], int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //largest in array
    public static int largest(int nums[] ){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
               
            }
            if(smallest > nums[i]){
                smallest = nums[i];
                
            }
        }
        System.out.println("Smallest value is :  " + smallest);
       return largest;
    }

    //Binary search
    public static int binarySearch(int nums[], int key){
        int start = 0; int end = nums.length; 
        while(start<=end){
            
            int mid = (start+end)/2;


            if(nums[mid]  == key){
                return mid;
            }if(nums[mid] > key){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }


    //Reverse an Array
    public static void reverseArray(int nums[]){
        int first = 0;
        int last = nums.length-1;

        while(first < last){
            //swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }


    //pairs in an array
    public static void pairs(int pair[]){
        int tp =0;
        for(int i=0; i<pair.length; i++){
            int curr = pair[i];
            for(int j=i+1; j<pair.length; j++){
                System.out.print("(" + curr + "," + pair[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs are " + tp);
    }

    //print SubArray
    public static void subArray(int arr[]){
        int ts = 0; //total no of subarrys
        //outer loop for start
        for(int i=0; i<arr.length; i++){
            int start = arr[i];
            for(int j=i+1; j<arr.length; j++){
                int end = arr[j];
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no of subarrays are: " + ts);
    }

    public static void main(String args[]){

        /*how to take input by index
        int marks[] = new int[40];

        Scanner sc = new Scanner(System.in);
        
        
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        marks[1] = marks[1] + 5;
        System.out.println("chem: " + marks[1]);

        int percentage = (marks[0] +marks[1] +marks[2]) / 3;
        System.out.println("prcentage = " + percentage + "%");


        //update function
        int marks[] = {97, 98, 99};
        update(marks);

        
        for(int i=0; i<marks.length; i++){ //print the marks
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //linear search function
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linear_search(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index: " + index);
        }
        

        //largest function
        int nums[] = {1,4,7,9,3,2};
        
        System.out.println("The largest in given array is :  " + largest(nums));
        

        //Binary Search
        int nums[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 12;

        System.out.println("index of the key is:  " + binarySearch(nums, key));


        //Reverse an array
        int nums[] = {1,2,3,4,5};

        reverseArray(nums);
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        //pairs in an array
        int pair[] = {2, 4, 6, 8, 10};
        
        pairs(pair);*/


        //print subarrays
        int arr[] = {2, 4, 6, 8, 10, 12};
        subArray(arr);
        
    }
}