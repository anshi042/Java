public class transposeOfArray {
    //find transpose of the 2D array
    public static void transpose(int matrix[][]){
       System.out.println("The matrix is: ");
       for(int i=0; i<matrix.length; i++){
        for(int j =0; j<matrix[0].length; j++){
            System.out.print(matrix[i][j] + "    ");
        }
        System.out.println();
       }       
    }
    public static void main(String [] args){
        int row = 2, col = 3;
        int[][] matrix = {{2, 3, 7}, {5, 6, 7}};

        //display orignal matrix
        transpose(matrix);

        //transpose of the matrix
        int trans[][] = new int[col][row];
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    trans[j][i] = matrix[i][j]; 
                }
            }

            //print the transposed matrix
            transpose(trans);
    }
    
}
