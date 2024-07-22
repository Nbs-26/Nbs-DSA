package MathsForDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int num=20;
        printFactorsOpt3(num);
    }
    // Time Complexity = O(N)
    public static void printFactors1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    // Time Complexity = O(Sq.root(N))
    public static void printFactorsOpt2(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int quotient=n/i;
                if(quotient==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+quotient+" ");
                }
            }
        }
    }
    // Time Complexity and Space Complexity = O(Sq.root(N))
    public static void printFactorsOpt3(int n){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                int quotient=n/i;
                if(quotient!=i){
                    list.add(quotient);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
