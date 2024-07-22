package OOPS.Test;

public class Box{
    int length;
    int width;
    int height;
    Box(){
        // super(); //Object Class
        this.length=-1;
        this.width=-1;
        this.height=-1;
    }
    //Cube
    Box (int side){
        this.length=side;
        this.width=side;
        this.height=side;
    }
    //Cuboid
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    Box(Box old){//Copy Constructor
        this.height=old.height;
        this.length=old.length;
        this.width=old.width;
    }

    public void displayInfo(){
        System.out.println("Running the box");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sai";
    }
}