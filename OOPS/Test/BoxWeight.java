package OOPS.Test;

public class BoxWeight extends Box{
    int weight;
    public BoxWeight(){
        super();
        this.weight=-1;
    }
    public BoxWeight(int length,int width,int height,int weight){
        super(length,width,height);//It is used to call the parent class constructor
        //Used to initialise values present in parent class
        this.weight=weight;
        // this.length=length;
        // this.height=height;
        // this.width=width;
    }
    public BoxWeight(BoxWeight obj){
        super(obj); 
    }
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return "Sank";
    // }
}
