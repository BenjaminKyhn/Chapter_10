import java.util.Scanner;

public class Exercise_10_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] myAccounts = new Account[10];

        for (int i = 0; i < myAccounts.length; i++) {
            myAccounts[i] = new Account(i, 100);
        }


        do {
            System.out.println("Enter an id: ");
            int id = input.nextInt();
            int choice;

            if (id >= 0 && id <= 9) {
                do {
                    choice = showMenu(input);
                    runTransaction(choice, myAccounts, id, input);
                } while (choice != 4);
            } else
                System.out.println("Invalid ID");
        } while (true);
    }

    // Method for handling the menu options
    public static int showMenu(Scanner input){
        System.out.println("\nMain menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.println("Enter a choice: ");
        return input.nextInt();
    }

    // Method for handling the transaction options
    public static void runTransaction(int choice, Account[] accounts, int id, Scanner input){
        switch (choice) {
            case 1:
                System.out.printf("$%.2f\n", accounts[id].getBalance());
                break;
            case 2:
                System.out.println("Enter money to withdraw: ");
                accounts[id].withdraw(input.nextInt());
                System.out.println("Balance is " + accounts[id].getBalance());
                break;
            case 3:
                System.out.println("Enter money to deposit: ");
                accounts[id].deposit(input.nextInt());
                System.out.println("Balance is " + accounts[id].getBalance());
                break;
        }
    }
}
