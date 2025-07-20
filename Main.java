public class Main {
    public static void main(String[] args) {
        int currentYear = 2025;

        Patient Y = new Patient(1, "John Doe", 1978, 175.5, 78.0);
        Y.displayDetails(currentYear);

        Patient X = new Patient(2, "Joe Don", 2030, -160.0, -65.0);
        X.displayDetails(currentYear);

        Patient Z = new Patient(3, "Joh jou", 1990, 160.0, 55.0, "B", "089-123-4567");
        Z.displayDetails(currentYear);
    }
}