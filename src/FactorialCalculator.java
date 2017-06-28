import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        System.out.println("Welcome to the Factorial Calculator!");
        System.out.println();

        Scanner entry = new Scanner(System.in);
        char keepGoing = 'y';
        int userNumber = 0;

        while(keepGoing == 'y') {
            System.out.print("Enter an integer that's greater than 0 but less than 10: ");
            userNumber = entry.nextInt();

            int factorial = 1;

            for (int i = 1; i <= userNumber; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + userNumber + " is " + factorial + ".");


            System.out.println();
            System.out.print("Continue? (y/n)");

            keepGoing = entry.next().charAt(0);

            System.out.println();
        }
        System.out.println("Bye!");
    }
}
