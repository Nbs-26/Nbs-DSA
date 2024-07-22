public class File {
    public static void main(String[] args) {
        int[] arr={7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                double div=((double)arr[i]/arr[j]);
                if(div==0.5 || div==2){
                    return true;
                }
            }
        }
        return false;
    }
}
