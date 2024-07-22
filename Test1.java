public class Test1{
    public static void main(String[] args) {
        // int[] arr={26,73,31,45,77};
        // System.out.println(findCountTallPlants(arr));
        System.out.println(findSetBit(14));
    }
    public static int findCountTallPlants(int[] arr){
        //Find the average of all heights of plants
        double sum=0;
        double avg=0;
        int count=0;
        for (int element : arr) {
            sum+=element;
        }
        avg=Math.round(sum/arr.length);
        for(int element:arr){
            if(element>avg){
                count++;
            }
        }
        return count;
    }
    public static int findSetBit(int num){
        if((num & (num-1))==0){
            return num-1;
        }
        int power=1;
        int sum=0;
        while(num>0){
            if((num&1)==0){
                sum+=power;
            }
            power*=2;
            num=num>>1;
        }
        return sum;
    }
}