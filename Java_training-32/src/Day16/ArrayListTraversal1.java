package Day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class ArrayListTraversal1 {
        public static void main(String[] args) {
            // Create an ArrayList of Strings
            List<String> stringList = new ArrayList<>();
            stringList.add("Welcome");
            stringList.add("To");
            stringList.add("The");
            stringList.add("USA");

            // Traverse using a for loop
            System.out.println("Using for loop:");
            for (int i = 0; i < stringList.size(); i++) {
                String element = stringList.get(i);
                System.out.println(element);
            }

            // Traverse using an enhanced for loop
            System.out.println("\nUsing enhanced for loop:");
            for (String element : stringList) {
                System.out.println(element);
            }

            // Traverse using an iterator
            System.out.println("\nUsing iterator:");
            Iterator<String> iterator = stringList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Traverse using forEach
            System.out.println("\nUsing forEach:");
            stringList.forEach(System.out::println);

            // Traverse using parallel stream
            System.out.println("\nUsing parallel stream:");
            stringList.parallelStream().forEach(System.out::println);
        }
    }



