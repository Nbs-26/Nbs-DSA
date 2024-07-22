import java.util.ArrayList;
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        ArrayList<ArrayList<Integer>> res=combinationSum(candidates,target);
        for(ArrayList<Integer> al: res){
            System.out.println(al);
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        return findCombinations(candidates,target,0,new ArrayList<>());
    }
    public static ArrayList<ArrayList<Integer>> findCombinations(int[] nums,int target,int index,ArrayList<Integer> list){
        //2D array list creation
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        //Base Condition
        if(target==0){
             al.add(list);
             return al;
        }
        if(index<=nums.length-1){
            if(nums[index]<=target){
                //We can choose the number in the combination
                list.add(nums[index]);
                al.addAll(findCombinations(nums,target-nums[index],index,list));
                list.remove(list.size()-1);
            }
            al.addAll(findCombinations(nums,target,index+1,list));
        }
        return al;
    }
}