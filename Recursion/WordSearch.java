public class WordSearch {
    public static boolean searchWord(char[][] board,boolean[][] visited,int row,int col,String word,int index){
        boolean foundRight,foundDown,foundLeft;
        //Base Condition, when the whole word is traversed
        if(index==word.length()){
            return true;
        }
        //Out of Bound Conditions
        if(row<0 || row>=board.length || col<0||col==board[0].length||visited[row][col]){
            return false;
        }
        if(board[row][col]!=word.charAt(index)){
            return searchWord(board,visited,row,col+1,word,index);
        }
            visited[row][col]=true;
            foundRight= searchWord(board,visited,row,col+1,word,index+1);
            foundDown= searchWord(board,visited,row+1,col,word,index+1);
            foundLeft= searchWord(board,visited,row,col-1,word,index+1);
        }
        else{ 
            // return searchWord(board,row,col+1,word,index);
            return false;
        }
        return (foundRight || foundDown || foundLeft);
    }
    public static boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        return searchWord(board,visited,0,0,word,0);
    }
    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(exist(board,word));
    }
}