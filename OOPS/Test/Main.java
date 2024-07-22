package OOPS.Test;

public class Main {
    public static void main(String[] args) {
        // Human h1=new Human("Sai", 21, 15000);
        // Human h2=new Human("Sankar", 20, 30000);
        // System.out.println(h1.name);
        // System.out.println(Human.population);
        // System.out.println(h2.name);
        // // System.out.println(h2.population);

        // Singleton obj1=Singleton.getInstance();
        // System.out.println(obj1.name);
        // System.out.println(obj1.age);
        // Singleton obj2=Singleton.getInstance();
        // System.out.println(obj2.name);
        // System.out.println(obj2.age); 
        
        
        // Box box =new Box();
        // System.out.println(box.length +" "+box.width+" "+box.height);
        // Box cube=new Box(4);
        // System.out.println(cube.length +" "+cube.width+" "+cube.height);
        // Box cuboid=new Box(3,4,5);
        // System.out.println(cuboid.length +" "+cuboid.width+" "+cuboid.height);
        // Box box2=new Box(cuboid);
        // System.out.println(box2.length +" "+box2.width+" "+box2.height);


        // BoxWeight bw=new BoxWeight();
        // System.out.println(bw.weight);//Can access its own members
        // System.out.println(bw.length);//Can access its parent class members
        // System.out.println(bw.height);
        // BoxWeight bw1=new BoxWeight(3,4,5,6);
        // System.out.println(bw1.length+" "+bw1.width+" "+bw1.height+" "+bw1.weight);
       
        //Assigning an object reference to reference variable of parent class type.
        // Box box3=new BoxWeight(2,3,4,5);
        // System.out.println(box3);

        //We can't have a child refrence variable and a parent object.
        // BoxWeight bw3=new Box(2,3,4);
        // System.out.println(bw3.height);
        // System.out.println(bw3.weight);

        // BoxPrice bp1 =new BoxPrice();
        BoxPrice bp1=new BoxPrice(2,3,4,5,6);
        System.out.println(bp1.length);
        System.out.println(bp1.height);
        System.out.println(bp1.width);
        System.out.println(bp1.weight);
        System.out.println(bp1.cost);
        
        
    }
}
