package OOPS.Generics;

import java.util.Arrays;

public class CustGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustGenArrayList(){
        // this.data=new T[DEFAULT_SIZE];//Gives an error
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T element){
        if(isFull()){
            resize();
        }
        data[size++]=element;
    }
    public boolean isFull(){
        return this.size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int getsize(){
        return size;
    }
    public void set(int index,T element){
        if(index<0 || index>=size){
            System.out.println("Invalid Index");
            return;
        }
        data[index]=element;
    }
    public T get(int index){
        return (T)(data[index]);//Type Casting
    }
    public T remove(){
        T removed=(T)(this.data[--size]);
        return removed;
    }    
    @Override
    public String toString() {
        return Arrays.toString(this.data);
    } 
}
