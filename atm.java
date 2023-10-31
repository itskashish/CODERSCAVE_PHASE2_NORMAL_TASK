
import java.util.Scanner;

class MyATM {
    public static void main(String[] args) {
        int accountBalance = 10000;
        int withdrawal, depositAmount;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to MyATM...");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the withdrawal amount: $");
                    withdrawal = scanner.nextInt();
                    withdraw(accountBalance, withdrawal);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    depositAmount = scanner.nextInt();
                    deposit(accountBalance, depositAmount);
                    break;
                case 3:
                    printBalance(accountBalance);
                    break;
                case 4:
                    System.out.println("Thank you for using MyATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void printBalance(int balance) {
        System.out.println("Your Current Balance: $" + balance);
        System.out.println();
    }

    public static void withdraw(int balance, int withdrawalAmount) {
        System.out.println("Withdrawal Operation:");
        System.out.println("Withdrawal Amount: $" + withdrawalAmount);

        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
            System.out.println("Please collect your money and remove the card.");
            printBalance(balance);
        } else {
            System.out.println("Insufficient funds. Please try a smaller amount.");
            System.out.println();
        }
    }

    public static void deposit(int balance, int depositAmount) {
        System.out.println("Deposit Operation:");
        System.out.println("Deposit Amount: $" + depositAmount);

        balance += depositAmount;
        System.out.println("Your money has been successfully deposited.");
        printBalance(balance);
    }
}
