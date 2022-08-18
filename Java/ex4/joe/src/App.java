 import java.util.Scanner;

 class main {
    private static int nextInt;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type an equastion ");

        int n1 = scanner.nextInt();
        String op = scanner.next();
        int n2 = scanner.nextInt();

        if (op.equals("+")) {
            int result = n1 + n2;
            System.out.println( n1 + "+" + n2 + "= " + result);
        }

        else if (op.equals("-")) {
            int result = n1 - n2;
            System.out.println(n1 + "-" + n2 + "=" + result);

        }
        
        else if (op.equals("*")) {
            int result = n1 * n2;
            System.out.println(n1 + "*" + n2 + "=" + result);
        }

        else if (op.equals("/")) {
            int result = n1 / n2;
            System.out.println(n1 + "/" + n2 + "=" + result);
        }
        
        else {
            System.out.println("the operation " + op + " is not recognized");
        }

    }
}
