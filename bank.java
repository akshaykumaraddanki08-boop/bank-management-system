package src;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created successfully for " + account.getAccountHolderName());
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void displayAllAccounts() {
        System.out.println("\n--- All Accounts ---");
        for (BankAccount account : accounts.values()) {
            account.displayAccountDetails();
        }
    }
}
