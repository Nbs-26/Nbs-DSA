// public class SudokuSolver {
//     public static void main(String[] args) {
//         int[][] board={{5,3,0,0,7,0,0,0,0},
//     {6,0,0,1,9,5,0,0,0},
// {0,9,8,0,0,0,0,6,0},
// {8,0,0,0,6,0,0,0,3},
// {4,0,0,8,0,3,0,0,1},
// {7,0,0,0,2,0,0,0,6},
// {0,6,0,0,0,0,2,8,0},
// {0,0,0,4,1,9,0,0,5},
// {0,0,0,0,8,0,0,7,9}};
//         printSolution(board, 0, 0);
//     }
//     public static void printSolution(int[][] board,int row,int col){
//         //Base Condition
//         if(row==board.length-1 && col==board.length){
//             display(board);
//             return;
//         }
//         //Moving to the next row
//         if(col==board.length){
//             printSolution(board, row+1, 0);
//             return;
//         }
//         //Check for the non-empty cells
//         if(board[row][col]==0){
//             //Fill the cell with a number in the range[1-9]
//             for(int i=1;i<=9;i++){
//                 if(isSafe(board,row,col,i)){
//                     board[row][col]=i;
//                     printSolution(board, row, col+1);
//                     board[row][col]=0;
//                 }
//             }
//         }
//         else{
//             printSolution(board, row, col+1);
//         }
//     }
//     public static boolean isSafe(int[][] board,int row,int col,int num){
//         //Check for the row and column
//         for(int i=0;i<board.length;i++){
//             if(board[row][i]==num){
//                 return false;
//             }
//             if(board[i][col]==num){
//                 return false;
//             }
//         }
//         //Check for the 3*3 box grid
//         int startRow=row-row%3;
//         int startCol=col-col%3;
//         for(int r=startRow;r<=startRow+2;r++){
//             for(int c=startCol;c<=startCol+2;c++){
//                 if(board[r][c]==num){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static void display(int[][] board){
//         for(int[] row:board){
//             for(int ele:row){
//                 System.out.print(ele+" ");
//             }
//             System.out.println();
//         }
//     }
// }



import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        // char[][] board={{"5","3",".",".","7",".",".",".","."},
        // {"6",".",".","1","9","5",".",".","."},
        // {".","9","8",".",".",".",".","6","."},
        // {"8",".",".",".","6",".",".",".","3"},
        // {"4",".",".","8",".","3",".",".","1"},
        // {"7",".",".",".","2",".",".",".","6"},
        // {".","6",".",".",".",".","2","8","."},
        // {".",".",".","4","1","9",".",".","5"},
        // {".",".",".",".","8",".",".","7","9"}};

        char[][] board={
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        solveSudoku(board);
    }
    public static void solveSudoku(char[][] board) {
        printSolution(board, 0, 0);
    }
    public static void printSolution(char[][] board,int row,int col){
        //Base Condition
        if(row==board.length-1 && col==board.length){
            display(board);
            return;
        }
        //Moving to the next row
        if(col==board.length){
            printSolution(board, row+1, 0);
            return;
        }
        //Check for the empty cells
        if(board[row][col]=='.'){
            //Fill the cell with an  integer in the range[1-9],converted into a character 
            for(int i=1;i<=9;i++){
                char ch=(char)(i+'0');
                if(isSafe(board,row,col,ch)){
                    board[row][col]=ch;
                    printSolution(board, row, col+1);
                    board[row][col]='.';
                }
            }
        }
        else{
            printSolution(board, row, col+1);
        }
    }
    public static boolean isSafe(char[][] board,int row,int col,char ch){
        //Check for the row and column
        for(int i=0;i<board.length;i++){
            if(board[row][i]==ch){
                return false;
            }
            if(board[i][col]==ch){
                return false;
            }
        }
        //Check for the 3*3 box grid
        int sq=(int)Math.sqrt(board.length);
        int startRow=row-row%sq;
        int startCol=col-col%sq;
        for(int r=startRow;r<=startRow+sq-1;r++){
            for(int c=startCol;c<=startCol+sq-1;c++){
                if(board[r][c]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(char[][] board){
        for(char[] row:board){
            System.out.print(Arrays.toString(row));
            System.out.println();
        }
    }
}