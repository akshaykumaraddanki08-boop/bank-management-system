package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = sc.nextDouble();
                    bank.addAccount(new BankAccount(accNo, name, initialDeposit));
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    BankAccount depositAcc = bank.getAccount(accNo);
                    if (depositAcc != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        double amount = sc.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    BankAccount withdrawAcc = bank.getAccount(accNo);
                    if (withdrawAcc != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double amount = sc.nextDouble();
                        withdrawAcc.withdraw(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.next();
                    BankAccount balanceAcc = bank.getAccount(accNo);
                    if (balanceAcc != null) {
                        balanceAcc.displayAccountDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using the Bank Management System!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
