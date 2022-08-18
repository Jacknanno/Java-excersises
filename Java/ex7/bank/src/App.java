import java.util.Scanner;

class bank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double accountBalance = 100.0;

        System.out.println("Current balance is " + accountBalance);

        while (accountBalance > 0) {
            System.out.println("Enter 1 for withdraw or 2 for deposit");

            int operation = input.nextInt();

            if (operation == 1) {
                System.out.println("What is the amount you wish to draw?");

                double amount = input.nextDouble();

                accountBalance -= amount;

                System.out.println(amount + " was withdrawn successfully, current balance is " + accountBalance);

            } else if (operation == 2) {
                System.out.println("What si the amount you wish to deposit?");

                double amount = input.nextDouble();
                
                accountBalance += amount;

                System.out.println(amount + " was desposited successfully, current balance is " + accountBalance);
            } else {
                System.out.println("Invalid input, please try transaction again ...");
            }
        }

        System.out.println("You are now in your overdraft, program stopped!");
    }


}

