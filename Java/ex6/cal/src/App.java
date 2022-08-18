import java.util.Scanner;

class cal2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");

        int number1 = input.nextInt();

        System.out.println("Enter second number");

        int number2 = input.nextInt();
        

        for (int i = number2; i<= number1; i++) {
            if(i % number2 == 0) {
                System.out.println(i + " is divsible by " + number2);
            }
        }
    }
}    