public class Main{
    public static void main(String[] args) {
        // Create and test student records
        Patient student1 = new Patient(120, 50.0, "A", "123-456-7890");
        Patient student2 = new Patient(55, 45.0, "B", "987-654-3210");
        Patient student3 = new Patient(180, 60.0, "O", "12-123-12-12-1");

        // Display individual records
        student1.displayDetails(); // Expected: 120
        student2.displayDetails(); // Expected: 55
        student3.displayDetails(); // Expected: 100 (default, as 180 is invalid)

        // Display class statistics
        Patient.displayClassDetails(); // Expected: tallest=120, shortest=55
    }
}