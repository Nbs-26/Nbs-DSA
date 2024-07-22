package OOPS;

import java.util.Arrays;

public class OOPs1 {
    public static void main(String[] args) {
        Student student1;//Declaration of a reference varaiable of Student data type
        student1=new Student();//Instantiation & Initialization

        System.out.println(student1);//Produced an error stating that the variable has not been initialised
        System.out.println(student1.rollNo); 
        System.out.println(student1.name);
        System.out.println(student1.marks);
        Student[] students=new Student[5];
        System.out.println(Arrays.toString(students));
        Student obj=new Student();
        for (int i = 0; i < 1000000; i++) {
            obj=new Student();
        }
    }
}
class Student {
    int rollNo;
    String name;
    float marks;
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();
        System.out.println("Object destroyed");
    }
}
