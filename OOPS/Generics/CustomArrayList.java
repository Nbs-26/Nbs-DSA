package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int data[];
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int element){
        if(isFull()){
            resize();
        }
        data[size++]=element;
    }
    public boolean isFull(){
        return this.size==data.length;
    }
    private void resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int getsize(){
        return size;
    }
    public void set(int index,int element){
        if(index<0 || index>=size){
            System.out.println("Invalid Index");
            return;
        }
        data[index]=element;
    }
    public int get(int index){

        return data[index];
    }
    public int remove(){
        return this.data[--size];
    }    
    @Override
    public String toString() {
        return Arrays.toString(this.data);
    }    
}