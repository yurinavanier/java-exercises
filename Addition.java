import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("\nEnter second integer:");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.printf("%d + %d = %d", number1, number2, sum);

        input.close();

    }
}
