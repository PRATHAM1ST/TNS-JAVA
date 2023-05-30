package student;

class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String empName, int year, double empSalary, String empAddress) {
        name = empName;
        yearOfJoining = year;
        salary = empSalary;
        address = empAddress;
    }

    void display() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t\t" + address);
    }
}

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, 5000, "64C- WallsStreet");
        Employee emp2 = new Employee("Sam", 2000, 6000, "68D- WallsStreet");
        Employee emp3 = new Employee("John", 1999, 5500, "26B- WallsStreet");

        System.out.println("Name\t\tYear of Joining\t\tAddress");
        emp1.display();
        emp2.display();
        emp3.display();
    }
}