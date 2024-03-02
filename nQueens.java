public class nQueens {
    //Time Complexity -- O(n!)
    //Recurrence relation --> T(n) = place1Queen(n) * T(n-1) + isSafe()

    //Checking the conditions for placing the queens in different rows
    public static boolean isSafe(char board[][], int row, int col){
        //Vertically up (i-1,j)/(i-2,j)....
        for(int i = row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Diagonally left up (i-1,j-1)/(i-2,j-2)....
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //Diagonally right up (i-1,j+1)/(i-2,j+2).....
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void settleQueens(char board[][], int row){
        //Base case
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        //column loop
        for(int j =0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
            settleQueens(board, row+1); //function call
            board[row][j] = 'x'; // Backtracking step
            }
        }
    }

    // print board
    public static void printBoard(char board[][]){
        System.out.println("-------- chess board --------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        
        settleQueens(board, 0);
        System.out.println();
        System.out.println("total ways to solve n queens = " + count);
    }
    
}
