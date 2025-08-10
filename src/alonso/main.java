
package alonso;

import alonso.banking.bankingClass;
import java.util.Scanner;

public class main {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---WELCOME TO ALONSO'S SYSTEM---");
        System.out.println("What do you feel like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingClass[] bApp = new bankingClass[10];
                bApp[0] = new bankingClass();

                int response;
                do {
                    System.out.println("\n--- Banking Menu ---");
                    System.out.println("1. Register Account");
                    System.out.println("2. Sign In Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter Selection: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            System.out.print("Enter Account No.: ");
                            bApp[0].setAccountNo(sc.nextInt());
                            System.out.print("Set Account Pin: ");
                            bApp[0].setPin(sc.nextInt());
                            break;

                        case 2: 
                            System.out.print("Enter Account No: ");
                            int acc = sc.nextInt();
                            System.out.print("Enter PIN: ");
                            int pn = sc.nextInt();

                            if (bApp[0].verifyAccount(acc, pn)) {
                                System.out.println("LOGIN SUCCESS");

                                int transChoice;
                                do {
                                    System.out.println("\n--- Transactions Menu ---");
                                    System.out.println("1. Deposit");
                                    System.out.println("2. Withdraw");
                                    System.out.println("3. View Balance");
                                    System.out.println("0. Logout");
                                    System.out.print("Enter choice: ");
                                    transChoice = sc.nextInt();

                                    switch (transChoice) {
                                        case 1:
                                            System.out.print("Enter deposit amount: ");
                                            float depositAmount = sc.nextFloat();
                                            bApp[0].deposit(depositAmount);
                                            break;
                                        case 2:
                                            System.out.print("Enter withdraw amount: ");
                                            float withdrawAmount = sc.nextFloat();
                                            bApp[0].withdraw(withdrawAmount);
                                            break;
                                        case 3:
                                            bApp[0].viewBalance();
                                            break;
                                        case 0:
                                            System.out.println("Logging out...");
                                            break;
                                        default:
                                            System.out.println("Invalid choice!");
                                    }
                                } while (transChoice != 0);

                            } else {
                                System.out.println("LOGIN FAILED");
                            }
                            break;

                        case 3:
                            for (int i = 0; i < bApp.length && bApp[i] != null; i++) {
                                System.out.println("Account " + (i + 1) + ": " + bApp[i].getAccountNo());
                            }
                            break;

                        default:
                            System.out.println("INVALID SELECTION!");
                    }

                    System.out.print("\nContinue? (1 = Yes / 0 = No): ");
                    response = sc.nextInt();

                } while (response == 1);
                break;

            case 2:
                System.out.println("Shopping ni siya na part");
                break;

            case 3:
                System.out.println("Pay Bills ni siya na part");
                break;

            default:
                System.out.println("INVALID SELECTION!");
        }

        sc.close();
    }

}
