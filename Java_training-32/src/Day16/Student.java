package Day16;

import java.util.ArrayList;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }
}

 class Main {
    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 4.0));
        students.add(new Student("Bob", "Johnson", 2.8));
        students.add(new Student("Alice", "Williams", 3.2));

        // Calculate the average GPA
        double totalGpa = 0.0;
        for (Student student : students) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / students.size();

        // Remove students with GPA less than the average using a for loop
        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            if (student.getGpa() < averageGpa) {
                students.remove(i);
            }
        }

        // Print the remaining students
        System.out.println("Remaining students:");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}
