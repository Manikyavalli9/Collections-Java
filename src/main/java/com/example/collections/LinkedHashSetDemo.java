package com.example.collections;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {//allows heterogenous data......
    public static void main(String[] args) {
        LinkedHashSet lset=new LinkedHashSet();
        lset.add("hello");
        lset.add(10);
        lset.add(10);
        lset.add("Java");

        System.out.println("The list is:"+lset);
        LinkedHashSet lset1=new LinkedHashSet();
        lset1.add("world");
        lset1.add(20);
        lset1.add(30);
        System.out.println("The list 2:"+lset1);
        //union
        lset.addAll(lset1);
        System.out.println(lset);

        //intersection
        lset.retainAll(lset1);
        System.out.println(lset);

        //difference
        lset.removeAll(lset1);
        System.out.println(lset);
    }

}
