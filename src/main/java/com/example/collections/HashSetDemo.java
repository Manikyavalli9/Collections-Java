package com.example.collections;
import java.util.*;

public class HashSetDemo {
    public static void main(String []args){
        HashSet hs=new HashSet();
        hs.add(1);
        hs.add(3);
        hs.add(78);
        hs.add(99);
        hs.remove(99);
        System.out.println(hs.size());
        System.out.println(hs.contains(34));
        System.out.println(hs.isEmpty());


        System.out.println("HashSet is: "+hs);
    }
}

