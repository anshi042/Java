
public class stringMergeSort {
    //Easy

    /*Apply Merge Sort to sort an array of stringss 
    (Assume that all the characters in all the strings are in lowercase)*/

    public static String[] divide(String arr[], int si, int ei){
        // base case
        if(si == ei){
        String[] A = { arr[si] };
        return A;
        }

        // Calculate mid
        int mid = si + (ei-si)/2;

        //Recursion
        String[] arr1 = divide(arr, si, mid); // left part
        String[] arr2 = divide(arr, mid+1, ei); // right part
        
        String[] arr3 = merge(arr1, arr2);
        return arr3;
        
    }

    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;

        int i =0;
        int j =0;

        while(i<m && j<n){
            if(isAlphabeticallysmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }

        while (i < m){
            arr3[idx] = arr1[i];
                i++;
                idx++;
        }

        while (j < n){
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }

        return arr3;
    }


    // Return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallysmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"sun", "moon", "star", "earth"};
        String[] a = divide(arr, 0, arr.length - 1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ,");
        }
        System.out.println();
    }
    
}
