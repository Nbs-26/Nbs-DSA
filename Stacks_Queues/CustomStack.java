package Stacks_Queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        data=new int[size];
    }
    public boolean push(int element) throws StackException{
        if(isFull()){
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr]=element;
        return true;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

}
