package student;

class PersonalInfo {
    protected String name;
    protected int age;
    protected String address;
    protected String phoneNumber;

    public PersonalInfo(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}

class AcademicInfo extends PersonalInfo {
    private String enrollmentNumber;
    private String result;

    public AcademicInfo(String name, int age, String address, String phoneNumber, String enrollmentNumber, String result) {
        super(name, age, address, phoneNumber);
        this.enrollmentNumber = enrollmentNumber;
        this.result = result;
    }
}

public class MainInheritence {
    public static void main(String[] args) {
        AcademicInfo student = new AcademicInfo("John Doe", 20, "123 Main St", "1234567890", "A12345", "Pass");

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Address: " + student.address);
        System.out.println("Phone Number: " + student.phoneNumber);
        System.out.println("Enrollment Number: " + student.enrollmentNumber);
        System.out.println("Result: " + student.result);
    }
}
