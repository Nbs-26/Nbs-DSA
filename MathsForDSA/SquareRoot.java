package MathsForDSA;

public class SquareRoot {
    public static void main(String[] args) {
        int num=40;
        int precision=3;
        System.out.println(findSquareRoot(num, precision));
    }
    //Time Complexity = O(lgn)
    public static double findSquareRoot(int num,int precision){
        double root=0.0;
        int start=0;
        int end=num;
        int mid=0;
        while(start<=end){
            //It provides us the integer value of square root.
            mid=start+(end-start)/2;
            if(mid*mid==num){
                return mid;
            }
            if(mid*mid>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        root=end;//Stores the integer value of  a number ,which is not a perfect square.
        //The below code provides us the precise square root value.
        //THe below code will be of less dominating term in time complexity,hence it is ignored.
        double increment=0.1;
        for(int i=0;i<precision;i++){
            while(root*root<=num){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
    }
}
