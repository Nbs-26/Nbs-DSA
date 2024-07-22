import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args) {
        generateCombination("", 4);
        ArrayList<String> ans=generateCombination1("", 4);
        System.out.println(ans);
    }
    public static void generateCombination(String p,int up){
        //Base Condition
        if(up==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6;i++){
            if (i<=up) {
                generateCombination(p+i, up-i);
        }
    }
}
    //Returning the output in the form of an arraylist
    public static ArrayList<String> generateCombination1(String p,int up){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(up==0){
            al.add(p);
            return al;
        }
        for(int i=1;i<=6;i++){
            if (i<=up) {
                al.addAll(generateCombination1(p+i, up-i));
            }
        }
        return al;
    }
}