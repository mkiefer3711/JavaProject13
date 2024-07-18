// @author Maddison Kiefer

import java.util.ArrayList;

// Main class for the program
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store instances of the Student class
        ArrayList<Student> students = new ArrayList<>();
        
        // Add student objects to the ArrayList with different information
        students.add(new Student(1, "Bob", "Los Angeles"));
        students.add(new Student(3, "Evan", "Chicago"));
        students.add(new Student(5, "Alice", "New York"));
        students.add(new Student(2, "David", "Houston"));
        students.add(new Student(4, "Charlie", "Miami"));
        students.add(new Student(6, "Kaylee", "Detroit"));
        students.add(new Student(8, "John", "Plymouth"));
        students.add(new Student(7, "Adam", "Austin"));
        students.add(new Student(9, "Taylor", "Orlando"));
        students.add(new Student(10, "Sam", "San Diego"));

        // Display the original list of students
        System.out.println("Original List:");
        System.out.println(students);

        // Sort the list of students by name using the NameComparator
        System.out.println("\nSorted by Name:");
        SelectionSort.sort(students, new NameComparator());
        System.out.println(students);

        // Sort the list of students by roll number using the RollnoComparator
        System.out.println("\nSorted by Roll Number:");
        SelectionSort.sort(students, new RollnoComparator());
        System.out.println(students);
    }
}
