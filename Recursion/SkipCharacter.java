public class SkipCharacter {
    public static void main(String[] args) {
        String str="baccad";
        char ch='a';
        StringBuilder ans=new StringBuilder();
        System.out.println(skip(str,ch,ans,0));
        System.out.println(skip1(str, ch, 0));
    }
    //This function is used to produce a string after skipping the given character in the original string by passing the answer argument in the function call.
    public static StringBuilder skip(String s,char ch,StringBuilder ans,int index){
        //Base Condition
        if(index==s.length()){
            return ans;
        }
        if(s.charAt(index)!=ch){
            ans.append(s.charAt(index));
        }
        return skip(s, ch, ans, ++index);
    }
    //This function is used to produce a string after skipping the given character in the original string by creating the answer variable in the function body.
    public static StringBuilder skip1(String s,char ch,int i){
        StringBuilder ans=new StringBuilder();
        //Base Condition
        if(i==s.length()){
            return ans;
        }
        if(s.charAt(i)!=ch){
            ans.append(s.charAt(i));
        }
        return ans.append(skip1(s, ch, ++i));
    }
}
