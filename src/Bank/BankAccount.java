package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    double accountBalance;
    String holderName;
    static int accountNumber;

    public static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hello! Welcome to the Yusuf Bank!\nAre you an existing customer?(-1 to exit)\n1. Yes\n2. No");
            int existingCustomer = scanner.nextInt();
            if (existingCustomer == 1) {
                BankAccount.mainMenu(accounts);
            } else if (existingCustomer == 2) {
                System.out.println("Let's make a new account");
                System.out.println("What is the name for the account?");
                scanner.nextLine();
                String newName = scanner.nextLine();
                System.out.println("What is the beginning balance for your account?");
                int newBalance = scanner.nextInt();
                System.out.println("Your account added successfully with a name of " + newName + " with a balance of " + newBalance);
                accounts.add(new BankAccount(newBalance, newName, accounts.size()));
                System.out.println("Your account number is " + (accounts.size() - 1));
            } else if (existingCustomer == -1) {
                break;
            }
        }
    }

    public BankAccount(int accountBalance, String customerName, int accountNumber) {
        this.accountBalance = accountBalance;
        this.holderName = customerName;
        BankAccount.accountNumber = accountNumber;
    }

    public void deposit(double depositAmount) {
        accountBalance = accountBalance + depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        accountBalance = accountBalance - withdrawalAmount;
    }

    public static void transfer(BankAccount list, double transferAmount) {
        accounts.get(accountNumber).deposit(transferAmount);
        list.withdrawal(transferAmount);
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getHolderName() {
        return holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static void mainMenu(ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your account number");
        int accountNumber = scanner.nextInt();
        if (accountNumber == accounts.get(accountNumber).getAccountNumber())
            System.out.println("Welcome " + accounts.get(accountNumber).getHolderName());
        System.out.println("Welcome to the Main Menu, what would you like to do today?\n1. To check account balance\n2. To make a withdraw\n3. To make a deposit\n4. To make a transfer to another account\n5. To exit");

        int menuInput = scanner.nextInt();
        switch (menuInput) {
            case 1 ->
                    System.out.println(accounts.get(accountNumber).getHolderName() + ", Your account balance is : " + accounts.get(accountNumber).getAccountBalance());
            case 2 -> {
                System.out.println("How much do you want to withdraw?");
                int withdrawalAmount = scanner.nextInt();
                accounts.get(accountNumber).withdrawal(withdrawalAmount);
                System.out.println("Great! You withdrew " + withdrawalAmount + " and now your remaining balance is : " + accounts.get(accountNumber).getAccountBalance());
            }
            case 3 -> {
                System.out.println("How much do you want to deposit?");
                int depositAmount = scanner.nextInt();
                accounts.get(accountNumber).deposit(depositAmount);
                System.out.println("Great! You deposited " + depositAmount + " and now your remaining balance is : " + accounts.get(accountNumber).getAccountBalance());
            }
            case 4 -> {
                System.out.println("Please enter the account number to transfer to");
                int transferNumber = scanner.nextInt();
                System.out.println("Please enter the amount to transfer");
                double transferAmount = scanner.nextDouble();
                transfer(accounts.get(transferNumber - 1), transferAmount);
                System.out.println("The name on the account is: " + accounts.get(accountNumber).getHolderName() + " and they have a balance of $" + accounts.get(accountNumber).getAccountBalance());
                System.out.println("The name on the account is: " + accounts.get(transferNumber).getHolderName() + " and they have a balance of $" + accounts.get(transferNumber).getAccountBalance());
            }
            case 5 -> System.out.println("Program exited");
        }
    }
}





