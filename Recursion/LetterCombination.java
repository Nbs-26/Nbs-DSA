//Write a program to find the letter combinations of a phone number

import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {
        String str="12";
        generateCombination("", str);
        ArrayList<String> ans=generateCombination1("", str);
        System.out.println(ans);
    }
    public static void generateCombination(String p,String up){
        //Base Condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            generateCombination(p+ch, up.substring(1));
        }
    }
    public static ArrayList<String> generateCombination1(String p,String up){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(up.isEmpty()){
            al.add(p);
            return al;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            al.addAll(generateCombination1(p+ch, up.substring(1)));
        }
        return al;
    }
}
