package OOPS.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human sai=new Human(21,"Sai");
        //The below method will take more processing time because of new keyword.
            // Human twin=new Human(sai);
            // System.out.println(twin.name);
            // System.out.println(twin.age);
        Human twin=(Human)sai.clone();
        twin.age=34;
        twin.arr[0]=100;
        System.out.println(twin.name);
        System.out.println(twin.age);
        System.out.println(sai.name);
        System.out.println(sai.age);
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(sai.arr));
    }
}
