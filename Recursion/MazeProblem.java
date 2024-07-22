import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        // System.out.println(countWays(3, 3));
        // printPaths("", 3, 3);
        // System.out.println();
        // printPaths2("", 3, 3);
        // System.out.println(printPaths3("", 3, 3));
        // printPaths4("", 3, 3);
        // System.out.println(printPaths5("", 3, 3));
        printPath6("", 0, 0);
    }
    public static int countWays(int row,int col){
        //Base Condition
        if(row==1 || col==1){
            return 1;
        }
        return countWays(row-1, col) + countWays(row, col-1);
    }
    public static void printPaths(String p,int row,int col){
        //Base Conditions
        if(row==1){
            for(int i=col;i>1;i--){
                p+="R";
            }
            System.out.println(p);
            return;
        }
        if(col==1){
            for(int i=row;i>1;i--){
                p+="D";
            }
            System.out.println(p);
            return;
        }
        printPaths(p+"D", row-1, col);
        printPaths(p+"R", row, col-1);
    }
    //Another  way of printing paths
    public static void printPaths2(String p,int row,int col){
        //Base Condition
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            printPaths(p+"D", row-1, col);
        }
        if(col>1){
            printPaths(p+"R", row, col-1);
        }
    }
    //Using array list
    public static ArrayList<String> printPaths3(String p,int row,int col){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(row==1 && col==1){
            al.add(p);
            return al;
        }
        if(row>1){
            al.addAll(printPaths3(p+"D", row-1, col));
        }
        if(col>1){
            al.addAll(printPaths3(p+"R", row, col-1));
        }
        return al;
    }
    //Include diagonal paths also(Include Diagonal(Dia) moves)
    public static void printPaths4(String p,int row,int col){
        //Base Condition
        if(row==1 && col==1){
            System.out.println(p);
        }
        if(row>1){
            printPaths4(p+"D", row-1, col);
        }
        if(col>1){
            printPaths4(p+"R", row, col-1);
        }
        if(row>1 && col>1){
            printPaths4(p+"Dia", row-1, col-1);
        }
    }
    //Using arraylist print the paths to reach the target,including the diagonal paths.
    public static ArrayList<String> printPaths5(String p,int row,int col){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(row==1 && col==1){
            al.add(p);
            return al;
        }
        if(row>1){
            al.addAll(printPaths5(p+"D", row-1, col));
        }
        if(col>1){
            al.addAll(printPaths5(p+"R", row, col-1));
        }
        if(row>1 && col>1){
            al.addAll(printPaths5(p+"Dia", row-1, col-1));
        }
        return al;
    }
    //Dealing with a maze containing obstacles
    public static void printPath6(String p,int row,int col){
        //Base Condition
        if(row==2 && col==2){
            System.out.println(p);
            return;
        }
        if(row==1 && col==1){//Obstacle present
            return;
        }
        if(row<2){
            printPath6(p+"D", row+1, col);
        }
        if(col<2){
            printPath6(p+"R", row, col+1);
        }
    }
}