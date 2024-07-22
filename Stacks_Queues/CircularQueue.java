package Stacks_Queues;

public class CircularQueue {
    protected int[] data;
    int front=0;
    int end=0;
    int size=0;
    private static final int DEFUALT_SIZE=5;
    public CircularQueue(){
        this(DEFUALT_SIZE);
    }
    public CircularQueue(int size){
        data=new int[size];
    }
    public boolean add(int element) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        data[end]=element;
        end++;
        end=end%data.length;
        size++;
        return true;
    }
    public boolean offer(int element) {
        if(isFull()){
            return false;
        }
        data[end]=element;
        end++;
        end=end%data.length;
        size++;
        return true;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;
    }
    public int poll() {
        if(isEmpty()){
            return -1;//return null;
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            return -1;//return null;
        }
        return data[front];
    }
    public int element() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        int i=front;
        do {
            System.out.print(data[i]+"<-");
            i++;
            i=i%data.length;
        } while (i!=end);
        System.out.println("END");
}
}