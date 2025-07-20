public class Patient {
    private int id;
    private String name;
    private  int birthyear;
    private  double  height;
    private  double weight;
    private String bloodGroup;
    private String phoneNumber;

    public  Patient (int id , String name ,int birthyear,
                    double height , double weight ){
        this.id = id;
        this.name = name;
        if(birthyear <= 2025)
            this.birthyear = birthyear;
        else
            this.birthyear = 2000;


        if (height >= 30 && height <= 300)
            this.height = height;
        else {
            System.out.println("Invalid height. Using default 170.0 cm.");
            this.height = 170.0;
        }

        if (weight >= 0.5 && weight <= 500)
            this.weight = weight;
        else {
            System.out.println("Invalid weight. Using default 60.0 kg.");
            this.weight = 60.0;


        }
        this.bloodGroup = "Unknown";
        this.phoneNumber = "Unknown";
    }

    public Patient(int id, String name, int birthyear, double height, double weight, String bloodGroup, String phoneNumber) {
        this(id, name, birthyear, height, weight);
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public double getBMI() {
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }


    public int getId() {
        return this.id;
    }

    public String getName(){
        return  this.name;
    }

    public int getBirthyear (){
        return this.birthyear;
    }

    public double getHeight () {
        return  this.height;
    }

    public double getWeight (){
        return  this.weight;
    }

    public double getAge (int currentYear) {
       if (currentYear >= birthyear)
        return  currentYear - birthyear;
       return  0;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.printf("Patient BMI: %.2f%n", getBMI());
        System.out.println("Blood Group: " + getBloodGroup());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
}
