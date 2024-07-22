package OOPS.ComparingObjects;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return this.marks+"";
    }
    @Override
    public int compareTo(Student o) {
        System.out.println("In compare to method");
        int diff= (int)(this.marks-o.marks);
        //if diff=0 both are equal
        //if diff<0 ,this object is less than o object
        //if diff>0 ,this object is greater than o object        
        return diff;
    }   
}