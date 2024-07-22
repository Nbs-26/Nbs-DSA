package OOPS.Polymorphism;


public class Circle extends Shapes{
    int j;
    @Override//Annotation
    void area(){
        System.out.println("Area is pi* r*r");
    }
}