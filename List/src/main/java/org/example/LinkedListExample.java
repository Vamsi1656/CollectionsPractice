package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String args[]){

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(35);
        ll1.add(56);
        ll1.add(10);
        ll1.add(68);
        ll1.add(20);

        Collections.sort(ll1);

        System.out.println(ll1);
    }
}
