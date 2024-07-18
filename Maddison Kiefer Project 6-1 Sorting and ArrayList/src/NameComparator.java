// @author Maddison Kiefer

import java.util.Comparator;

// This class implements the Comparator interface to provide a custom comparison for sorting students by name
public class NameComparator implements Comparator<Student> {
    // Override the compare method to define the custom comparison logic based on student names
    @Override
    public int compare(Student s1, Student s2) {
        // Compare student names using the compareTo method of the String class
        return s1.name.compareTo(s2.name);
    }
}
