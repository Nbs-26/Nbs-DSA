package OOPS.Test;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost=-1;
    } 
    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }
    BoxPrice(int length,int height,int width,int weight,double cost){
        super(length, width, height, weight);
        this.cost=cost;
    }
}
