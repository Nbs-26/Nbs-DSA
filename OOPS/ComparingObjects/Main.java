package OOPS.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student sai=new Student(1,99.66f);
        Student jai=new Student(2, 90.06f);
        Student din=new Student(5, 67.06f);
        Student san=new Student(4, 91.06f);
        Student sam=new Student(3, 95.06f);


        Student[] list={sai,jai,din,san,sam};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list,new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks-o2.marks);//Ascending order.
                // return -(int) (o1.marks-o2.marks);//Descending order.
            }
            
        });


        
        System.out.println(Arrays.toString(list));

        // if(sai.compareTo(jai)>0){
        //     System.out.println("Sai has more marks");
        // }
    } 
}
