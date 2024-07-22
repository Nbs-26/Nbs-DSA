package OOPS.ObjectClass;

public class ObjectDemo {
    int num;
    
    public ObjectDemo(int num) {
        this.num = num;
    }
    @Override
    public int hashCode() {//Returns a unique value/number for a object
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // return super.equals(obj);
        return this.num==((ObjectDemo)obj).num;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(4);
        System.out.println(obj.hashCode());
        // ObjectDemo obj2=new ObjectDemo(4);
        ObjectDemo obj2=new ObjectDemo(4);
        System.out.println(obj2.hashCode());
        if(obj==obj2){
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)){//Override the equals method with your own condition for equality.
            System.out.println("obj is equal to obj2");
        }

        //InstanceOf method
        System.out.println(obj instanceof ObjectDemo);

        //getClass method
        System.out.println(obj.getClass().getName());

        String s="AA";
        String s1="AA";
        String s2=new String("AA");
        String s3=new String("AA");
        System.out.println(s3==s2);//Compares the memory address of the strings
        System.out.println(s3.equals(s2));//Compares the contents of the strings.
    }
}
