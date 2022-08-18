import java.util.Scanner;

class Main {
    
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        for (int i = 1; i <= 10l; i++) {
            int result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}

