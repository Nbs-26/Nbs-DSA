package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        Shapes demo=new Circle();

        // shape.area();
        // circle.area();    
        // square.area();
        // demo.area();
        Circle s=new Circle();
        s.area();//Dynamic Method Dispatch
        // s.j=2;
        // s.area();
        // Circle c=(Circle)s;//Downcasting
        // c.c1=4;
        // System.out.println(c.j);
        // System.out.println(c.c1);
        // c.area();

        Shapes s1=new Shapes();
        s1.area();
    }
}
