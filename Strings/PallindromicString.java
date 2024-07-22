public class PallindromicString {
    public static void main(String[] args) {
        String str="Malayalam";
        if(isPallindrome(str)){
            System.out.println(str+" is a pallindromic string");
        }
        else{
            System.out.println(str+" is not a pallindromic string");
        }
    }
    public static boolean isPallindrome(String str){
        str=str.toLowerCase();
        int start=0,end=str.length()-1;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
