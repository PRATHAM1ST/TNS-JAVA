package student;
import java.util.Scanner;

public class ATM {
    static double balance = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to withdraw, 2 to deposit: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the amount to withdraw: ");
            double amount = input.nextDouble();
            withdraw(amount);
        } else if (choice == 2) {
            System.out.print("Enter the amount to deposit: ");
            double amount = input.nextDouble();
            deposit(amount);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
}

