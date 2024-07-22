package OOPS.ObjectCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{1,2,3,4};
    }
    // public Human(Human other){
    //     this.age=other.age;
    //     this.name=other.name;
    // }


    // // Shallow Copy
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }


    //Deep Copy-> Original object's refernce variable contents will not change
    public Object clone() throws CloneNotSupportedException{
        Human twin=(Human)super.clone();
        twin.arr=new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) { 
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }

}
