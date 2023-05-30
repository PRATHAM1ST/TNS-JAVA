package student;
import java.util.Scanner;

class Student1 {
    String name;
    int id;
    int age;
    String mobileNo;

    void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextInt();
        System.out.print("Enter age: ");
        age = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.print("Enter mobile number: ");
        mobileNo = input.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.getData();
        student1.display();
    }
}
