import java.util.ArrayList;

public class LinearSearch{
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={3,2,1,1,1,18,9};
        int target=1;
        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
        System.out.println(findLastIndex(arr,target,arr.length-1));
        findAllIndexes(arr,target,0);
        System.out.println(list);
        System.out.println(findAllIndexes2(arr, target, 0, new ArrayList<>()));
        System.out.println(findAllIndexes3(arr, target, 0));

    }
    public static int findIndex(int[] arr,int target,int index){
        //Base Condition
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr, target, index+1);
    }
    public static boolean find(int[] arr,int target,int index){
        //Base Condition
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        return find(arr, target, index+1);
    }
    public static int findLastIndex(int[] arr,int target,int index){
        //Base Condition
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findLastIndex(arr, target, index-1);
    }
    public static void findAllIndexes(int[] arr,int target,int index){
        //Base Condition
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndexes(arr, target, index+1);
    }
    public static ArrayList<Integer> findAllIndexes2(int[] arr,int target,int index,ArrayList<Integer> list){
        //Base Condition
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndexes2(arr, target, index+1,list);
    }
    //Here in the below function,the arraylist is declared within the body.
    public static ArrayList<Integer> findAllIndexes3(int[] arr,int target,int index){
        
        ArrayList<Integer> list =new ArrayList<>();

        //Base Condition
        if(index==arr.length){
            return list;
        }
        //This will contain answer for that function call only.
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findAllIndexes3(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}