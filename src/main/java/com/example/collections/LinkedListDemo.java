package com.example.collections;
import java.util.*;

public class LinkedListDemo {
    public static void main(String []args){
        LinkedList list=new LinkedList();
        list.add(5);
        list.add("helloooooooo");
        list.add(59);
        list.add('A');
        list.remove(0);
        list.add(1,5);
        list.addFirst(3);
        list.addLast(100);
        list.add(null);
        System.out.println(list.get(0)); ///get
        System.out.println(list.set(3,6)); //settttt
        System.out.println(list.contains(6));
        System.out.println(list.isEmpty());
        System.out.println("The size is"+" "+list.size());
        //to read data
        for(int i=0;i<list.size();i++){
            System.out.println("Ater for loopppp"+list.get(i));
        }

        System.out.println("The LinkedList is:"+list);
    }
}
