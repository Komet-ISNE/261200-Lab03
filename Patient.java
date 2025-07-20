public class Patient {
    // Instance field
    private int height;  // student's height in centimeters

    // Constants (static final)
    private static final int MIN_PERMITTED_HEIGHT = 50;
    private static final int MAX_PERMITTED_HEIGHT = 175;
    private static final int DEFAULT_HEIGHT = 100;
    private String bloodGroup;
    private String phoneNumber;
    private double weight;

    // TODO: Initialize appropriately
    // Class-level tracking (static)
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;

    public  Patient (int height){
        setHeight(height);
    }

    public Patient(int height, double weight, String bloodGroup, String phoneNumber) {
        setHeight(height);
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public int getHeight() {
        return this.height;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBMI() {
        double heightInMeters = height / 100.0;
        if (heightInMeters <= 0) {
            return 0;
        }
        return weight / (heightInMeters * heightInMeters);
    }

    public void setHeight(int height) {

        // TODO: Validate height is within permitted range
        if (height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT) {
            this.height = height;
        } else {
            this.height = DEFAULT_HEIGHT;
        }

        // TODO: Update tallest and shortest heights
        if (this.height > tallestHeight) {
            tallestHeight = this.height;
        }
        if (this.height < shortestHeight) {
            shortestHeight = this.height;
        }
    }

    public static int getTallestHeight() {
        return tallestHeight;
    }
    public static int getShortestHeight() { return  shortestHeight;}
    public void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
        System.out.println("Weight (kg): " + weight);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.printf("BMI: %.2f%n", getBMI());
    }

    public static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
    }
}

