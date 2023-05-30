package student;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int value1 = input.nextInt();
        System.out.print("Enter the second value: ");
        int value2 = input.nextInt();
        System.out.print("Enter the third value: ");
        int value3 = input.nextInt();

        int sum = value1 + value2 + value3;
        double average = sum / 3.0;

        System.out.println("Addition: " + sum);
        System.out.println("Average: " + average);

        if (average > 90) {
            System.out.println("Grade: A");
        } else if (average >= 80 && average <= 90) {
            System.out.println("Grade: B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
