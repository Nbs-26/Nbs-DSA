public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,3,1,5,5,6,6,7};
        System.out.println(findAnswer(arr));
    }
    public static int findAnswer(int arr[]){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result^=arr[i];
        }
        return result;
    }
}
