public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        printWays(board,0,0,n);
    }
    public static void printWays(boolean[][] board,int row,int col,int nKnights){
        //Base Condition
        if(nKnights==0){
            display(board);
            System.out.println();
            return;
        }
        //If the control is present in the last row and the control goes out of the board by exceeding the column, then just return
        if(row==board.length-1 && col==board.length){
            //No solution exists for this call,hence return
            return;
        }
        if(col==board.length){
            printWays(board, row+1, 0, nKnights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            printWays(board, row, col+1, nKnights-1);
            board[row][col]=false;
        }
        printWays(board, row, col+1, nKnights);
    }
    public static void display(boolean[][] board){
        for (boolean[] row: board){
            for(boolean ele:row){
                if(ele){
                    System.out.print("K"+" ");
                }else{
                    System.out.print("X"+" ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        if(isValid(row-2, col-1, board.length)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(row-2, col+1, board.length)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(row-1, col-2, board.length)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(row-1, col+2, board.length)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    public static boolean isValid(int row,int col,int n){
        if(row>=0 && row<n && col>=0 && col<n){
            return true;
        }
        return false;
    }
}