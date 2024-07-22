import java.util.ArrayList;

public class SubsequencesString {
    public static void main(String[] args) {
        printSubsequences("", "abcd");
        System.out.println(printSubsequencesArrList("", "abcd"));
        ArrayList<String> al=new ArrayList<>();
        printSubsequencesArrList2("", "abcd", al);
        System.out.println(al);
    }
    public static void printSubsequences(String pStr,String upStr){
        //Base Condition
        if(upStr.isEmpty()){
            System.out.println(pStr);
            return;
        }
        printSubsequences(pStr+upStr.substring(0, 1),upStr.substring(1));
        printSubsequences(pStr+"",upStr.substring(1));
    }
    //Creating arraylist in the body of function that stores the subsequences of the string.
    public static ArrayList<String> printSubsequencesArrList(String pStr,String upStr){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(upStr.isEmpty()){
            al.add(pStr);
            return al;
        }
        al.addAll(printSubsequencesArrList(pStr+upStr.substring(0, 1),upStr.substring(1)));
        al.addAll(printSubsequencesArrList(pStr+"",upStr.substring(1)));
        return al;
    }
    //Passing arraylist in the argument ,which will store the subsequences of the string
    public static void printSubsequencesArrList2(String pStr,String upStr,ArrayList<String> al){
        //Base Condition
        if(upStr.isEmpty()){
            al.add(pStr);
            return;
        }
        printSubsequencesArrList2(pStr+upStr.substring(0, 1),upStr.substring(1),al);
        printSubsequencesArrList2(pStr+"",upStr.substring(1),al);
    }
}
