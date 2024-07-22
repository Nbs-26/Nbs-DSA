package OOPS.Generics;

import java.util.ArrayList;

public class Main implements GenericInterface<Integer>{
    public static void main(String[] args) {
        // CustomArrayList list=new CustomArrayList();
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // System.out.println(list);
        // System.out.println(list.getsize());
        // list.set(0,99);
        // System.out.println(list);
        // System.out.println(list.get(2));
        // System.out.println(list.remove());
        // System.out.println(list);
        // ArrayList list2=new ArrayList<>();//Raw Arraylist
        // list2.add("list2,23"); 
        // list2.add(34);
        // list2.add(45.5);
        // System.out.println(list2);

        // CustGenArrayList<Integer> list3=new CustGenArrayList<>();
        // for (int i = 0; i < 14; i++) {
        //     list3.add(2*i);
        // }
        // System.out.println(list3);

        WildCardExample<Double> list4=new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
            list4.add((double) (2*i));
        }
        System.out.println(list4);


    }
    //Overriding the display method of GeneriCInterfcae Interface.
    @Override
    public void display(Integer value) {

    }
}