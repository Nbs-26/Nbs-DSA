package OOPS.Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){
        this.num=num;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Object Variable is "+this.num;
    }
    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(510);
        System.out.println(obj);
    }
}
