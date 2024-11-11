package org.example;

import java.util.*;

public class ALSorting {

    public static void main(String args[]) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(20);
        a1.add(40);
        a1.add(60);
        a1.add(10);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Nani");
        a2.add("Pallavi");
        a2.add("Virat");
        a2.add("Jyothi");
        Collections.sort(a1);
        Collections.sort(a2);

       System.out.println(a1.get(2));
       System.out.println(a2.get(0));

        System.out.println(a1);
        System.out.println(a2);
    }
}
