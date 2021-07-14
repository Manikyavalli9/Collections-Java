
package com.example.collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("emp1" + " " + "id");
        list.add(201);
        list.add(6);
        list.remove(0);
        Collections.shuffle(list);
        System.out.println("The list is:"+list);
        //for loop counting.....................
        System.out.println("reading elements using for loop approach");
        /*for (int i = 0; i <= list.size(); i++) {
            list.get(i);
            System.out.println(i);
        }*/


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(201));
        System.out.println(list.get(2));
        System.out.println("Array list is:" + list);

    }
}