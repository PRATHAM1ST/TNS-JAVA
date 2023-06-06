package student;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderLearning {
    public static void main(String[] args) {
        // Reading input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        // Reading input using InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);
        try {
            System.out.print("Enter your age: ");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            System.out.println("You are " + age + " years old.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
