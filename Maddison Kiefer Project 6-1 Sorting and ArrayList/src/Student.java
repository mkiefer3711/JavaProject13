// @author Maddison Kiefer

// This class represents a Student with basic information
public class Student {
    // Attributes to store student information
    // Roll number of the student
    int rollno;
    // Name of the student
    String name;
    // Address of the student
    String address;
    
    // Constructor to initialize a new Student object with the given parameters
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    
    // Override the toString() method to provide a custom string representation of the Student object
    @Override
    public String toString() {
        return "Student [rollno = " + rollno + ", name = " + name + ", address = " + address + "]\n";
    }
}
