import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abcd";
        ArrayList<String> ans= generate1("", str);
        System.out.println(ans);
        ArrayList<String> ans1=new ArrayList<>();
        generate2("", str, ans1);
        System.out.println(ans1);
        //Calculate the no. of permutations
        System.out.println(permutationCount("", str));
    }
    public static void generate(String p,String up){
        //Base Condition
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        int noofCalls=p.length()+1;
        for(int i=0;i<noofCalls;i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            String answer=first+up.charAt(0)+second;
            generate(answer, up.substring(1));
        }
    }
    //Return output in the form of an array list
    //The below function includes an arraylist in the body and return an arraylist.
    public static ArrayList<String> generate1(String p,String up){
        ArrayList<String> al=new ArrayList<>();
        //Base Condition
        if(up.length()==0){
            al.add(p);
            return al;
        }
        int noofCalls=p.length()+1;
        for(int i=0;i<noofCalls;i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            String answer=first+up.charAt(0)+second;
            al.addAll(generate1(answer, up.substring(1)));
        }
        return al;
    }
    //The below function passes arraylist in the argument and updates it.
    public static void generate2(String p,String up,ArrayList<String> al){
        //Base Condition
        if(up.length()==0){
            al.add(p);
            return;
        }
        int noofCalls=p.length()+1;
        for(int i=0;i<noofCalls;i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            String answer=first+up.charAt(0)+second;
            generate2(answer, up.substring(1),al);
        }
    }
    //Coun the number of permutations
    public static int permutationCount(String p,String up){
        int count=0;
        //Base Condition
        if(up.length()==0){
            return 1;
        }
        int noofCalls=p.length()+1;
        for(int i=0;i<noofCalls;i++){
            String first=p.substring(0, i);
            String second=p.substring(i,p.length());
            String answer=first+up.charAt(0)+second;
            count =count+permutationCount(answer, up.substring(1));
        }
        return count;
    }
}