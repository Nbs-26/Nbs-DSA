package Stacks_Queues;


public class DynamicCircularQueue extends CircularQueue{
    public DynamicCircularQueue(){
        super();
    }
    public DynamicCircularQueue(int size){
        super(size);
    }
    @Override
    public boolean add(int element) throws Exception{
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }            
        return super.add(element);
    }
}
