package com.tuesday;

import java.util.*;

public class HashClass {



        public static void main(String[] args) {
            // Create the Student class
            class Student {
                private String fname;
                private String lname;
                private double percentage;

                public Student(String fname, String lname, double percentage) {
                    this.fname = fname;
                    this.lname = lname;
                    this.percentage = percentage;
                }

                public String getFirstName() {
                    return fname;
                }

                public String getLastName() {
                    return lname;
                }

                public double getGpa() {
                    return percentage;
                }
            }

            // Create a HashMap to store students
            HashMap<String, Student> map = new HashMap<>();

            // Add students to the HashMap
            map.put("Ram", new Student("Ram", "Krishna", 3.5));
            map.put("Sai", new Student("Sai", "Priya", 3.6));
            map.put("Rakesh", new Student("Rakesh", "Raj", 3.7));
            map.put("Bhavani", new Student("Bhavani", "Nima", 3.8));
            map.put("Sai", new Student("Sai", "Cherry", 3.6));
            map.put("Sri", new Student("Sri", "Vasu", 3.4));


            // Print the HashMap using Entry Set
            System.out.println("Print using Entry Set:");
            for (Map.Entry<String, Student> entry : map.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getFirstName()
                        + " " + entry.getValue().getLastName() + ", percentage: " + entry.getValue().getGpa());
            }

            // Print the HashMap using map's forEach method
            System.out.println("\nPrint using map's forEach method:");
            map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: "
                    + value.getFirstName() + " " + value.getLastName() + ", percentage: " + value.getGpa()));

            // Print the HashMap using keySet and Iterator
            System.out.println("\nPrint using keySet and Iterator:");
            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Student student = map.get(key);
                System.out.println("Key: " + key + ", Value: " + student.getFirstName()
                        + " " + student.getLastName() + ", percentage: " + student.getGpa());
            }
        }
    }


