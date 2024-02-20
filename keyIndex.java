public class keyIndex {
    public static void allOccurence(int key,int arr[] ,int i){
        //Base case
        if(i == arr.length){
            return;
        }
        //recursion
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        allOccurence(key, arr, i+1);


    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        allOccurence(key, arr, 0);
        System.out.println();
    }
    
}
