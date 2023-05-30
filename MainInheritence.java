package student;

class PersonalInfo {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public PersonalInfo(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public String getResult() {
        return result;
    }
}

public class MainInheritence {
    public static void main(String[] args) {
        AcademicInfo student = new AcademicInfo("John Doe", 20, "123 Main St", "1234567890", "A12345", "Pass");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Phone Number: " + student.getPhoneNumber());
        System.out.println("Enrollment Number: " + student.getEnrollmentNumber());
        System.out.println("Result: " + student.getResult());
    }
}
