public class sortedSearch {
    public static boolean searchInSortedMatrix(int matrix[][] , int key){
    
    //brute force -- linear search o(n^2)(worst case)
    //Binary search -- searching row wise T.C = O(nlogn)

    // Approach -- StairCase Search with time complexity og O(n+m)
    //considered top row's last element aa the starting point 
     
    int row = 0;
    int col = matrix[0].length-1;
         while(row<=matrix.length-1 && col>=0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" +row+ "," +col+ ")");
                return true;
            } else if (key < matrix[row][col]){
                col--;
            } else {
                row++;
            }

        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String [] args){
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key = 27;
        searchInSortedMatrix(matrix, key);

    }
}
