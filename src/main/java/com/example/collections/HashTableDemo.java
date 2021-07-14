package com.example.collections;
import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(101,"Hello");
        ht.put(102,"April");
        ht.put(103,"World");
        System.out.println(ht.get(101));
        System.out.println(ht.containsKey(101));
        System.out.println(ht.containsValue("march"));
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println("Entry set="+" "+ht.entrySet());// returns settt

        for(Object i:ht.keySet())
        {
            System.out.println(i);
        }


        for(Object i:ht.values())
        {
            System.out.println(i);
        }

        //key with value
        for(Object i:ht.keySet()){
            System.out.println("Key-Value:"+i+"  "+ht.get(i));
        }



        System.out.println("HashMap is:"+ht);
    }
}
