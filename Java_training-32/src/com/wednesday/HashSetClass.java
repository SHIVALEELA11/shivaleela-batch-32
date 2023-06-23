package com.wednesday;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

    public static void main(String[] args) {
            HashSet<String> stringHashSet = new HashSet<>();

            // Add 10 strings to the HashSet
            stringHashSet.add("Ram");
            stringHashSet.add("Sai");
            stringHashSet.add("Priya");
            stringHashSet.add("Kiran");
            stringHashSet.add("Hema");
            stringHashSet.add("Joe");
            stringHashSet.add("Shiva");
            stringHashSet.add("Sri");
            stringHashSet.add("Cherry");
            stringHashSet.add("Raj");

            // Iterate over the HashSet using Iterator
            System.out.println("Iterating using Iterator:");
            Iterator<String> iterator = stringHashSet.iterator();
            while (iterator.hasNext()) {
                String item = iterator.next();
                System.out.println(item);
            }

            // Iterate over the HashSet using ForEach
            System.out.println("\nIterating using ForEach:");
            for (String item : stringHashSet) {
                System.out.println(item);
            }

            // Iterate over the HashSet using Streams ForEach
            System.out.println("\nIterating using Streams ForEach:");
            stringHashSet.stream().forEach(System.out::println);
        }
    }


