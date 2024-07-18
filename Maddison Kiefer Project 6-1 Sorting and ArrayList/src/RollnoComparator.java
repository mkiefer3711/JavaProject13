// @author Maddison Kiefer

import java.util.Comparator;

// This class implements the Comparator interface to provide a custom comparison for sorting students by roll number
public class RollnoComparator implements Comparator<Student> {
    // Override the compare method to define the custom comparison logic based on student roll numbers
    @Override
    public int compare(Student s1, Student s2) {
        // Compare student roll numbers by subtracting s2.rollno from s1.rollno
        return s1.rollno - s2.rollno;
    }
}