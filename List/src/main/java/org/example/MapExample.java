package org.example;

import java.nio.file.attribute.AclEntryType;
import java.util.*;

public class MapExample {

    public static void main(String args[]){

        Map<Integer,String> employees=new HashMap();
        employees.put(1,"Nani");
        employees.put(2,"Pallavi");
        employees.put(3,"Virat");
        employees.put(4,"Jyothi");
        System.out.println(employees);

        // If you want only keys
        Set<Integer> keys=employees.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }

// If we want only values
        Collection<String> values=employees.values();
        for(String value:values) {
            System.out.println(value);
        }
// If we want both keys and values
   for(Integer key : keys){
       System.out.println(key+ "   " + employees.get(key));
   }

   //Deletion of element from the map
//        employees.remove(2);
//        employees.remove(3,"Jyothi");

// Verification of key and values in the map
        System.out.println(employees.containsKey(2));
        System.out.println(employees.containsValue("Jyothi"));

// Updation of elements in the map
        employees.put(4,"Vamsi");
        System.out.println("UpdatedValue"+ employees);

// If we want key and values like object

        Set<Map.Entry<Integer,String>> entries=employees.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"  "+ value);
        }
    }
}
