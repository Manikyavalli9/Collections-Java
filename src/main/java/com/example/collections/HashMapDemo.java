package com.example.collections;
import java.util.*;

public class HashMapDemo {

    public static void main(String []args){
        HashMap hm=new HashMap();
        // HashMap <Integer,String> hm=new HashMap<Integer, String>();
        hm.put(101,"January");
        hm.put(102,"Ferbruary");
        hm.put(103,"March");
        System.out.println(hm.get(101));
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("march"));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println("Entry set="+" "+hm.entrySet());// returns settt



        for(Object i:hm.keySet())
        {
            System.out.println(i);
        }


        for(Object i:hm.values())
        {
            System.out.println(i);
        }

        //key with value
        for(Object i:hm.keySet()){
            System.out.println("Key-Value:"+i+"  "+hm.get(i));
        }



        System.out.println("HashMap is:"+hm);
    }
}
