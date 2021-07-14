package com.example.collections;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue();
        q.add(10);
        q.add(24);
        q.offer(23); //homogenous data is possible in PriorityQueue
        //get head element using element and peek.

        System.out.println(q.element());
        System.out.println(q.peek());

        //to return and remove remove and poll methods.
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.poll());

        //count each element using iterator
        Iterator itr=q.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Queue :"+q);
    }
}
