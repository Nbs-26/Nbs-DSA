package Stacks_Queues;

import java.util.Queue;

public class CustomQueue {
    private int[] data;
    private int end=-1;
    private static final int DEFUALT_SIZE=5;
    public CustomQueue(){
        this(DEFUALT_SIZE);
    }
    public CustomQueue(int size){
        data=new int[size];
    }
    public boolean add(int element) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        end++;
        data[end]=element;
        return true;
    }
    public boolean offer(int element) {
        if(isFull()){
            return false;
        }
        end++;
        data[end]=element;
        return true;
    }
    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];
        for (int i = 0; i < end; i++) {
            data[i]=data[i+1];
        }
        data[end]=0;
        end--;
        return removed;
    }
    public int poll() {
        if(isEmpty()){
            return -1;//return null;
        }
        int removed=data[0];
        for (int i = 0; i < end; i++) {
            data[i]=data[i+1];
        }
        data[end]=0;
        end--;
        return removed;
    }
    public int peek(){
        if(isEmpty()){
            return -1;//return null;
        }
        return data[0];
    }
    public int element() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i=0;i<=end;i++){
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }
}