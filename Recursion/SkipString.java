public class SkipString {
    public static void main(String[] args) {
        String str="applefgappk";
        String skp="apple";
        StringBuilder ans=new StringBuilder();
        System.out.println(skip(str, skp, ans));
        StringBuilder ans1=new StringBuilder();
        System.out.println(skipAppNotApple(str, skp, ans1));
    }
    public static StringBuilder skip(String str,String skp,StringBuilder ans){
        //Base Condition
        if(str.isEmpty()){
            return ans;
        }
        if(str.startsWith(skp)){
            return skip(str.substring(skp.length()), skp, ans);
        }
        else{
            ans.append(str.charAt(0));
            return skip(str.substring(1), skp, ans);
        }
    }
    public static StringBuilder skipAppNotApple(String str,String skp,StringBuilder ans){
        //Base Condition
        if(str.isEmpty()){
            return ans;
        }
        if(str.startsWith("app") && !(str.startsWith("apple"))){
            return skipAppNotApple(str.substring(3), skp, ans);
        }
        else{
            ans.append(str.charAt(0));
            return skipAppNotApple(str.substring(1), skp, ans);
        }
    }
}
