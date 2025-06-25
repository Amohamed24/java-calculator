import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        // CALCULATOR
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Hi, please enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ". Select your first number: ");
        int first = scanner.nextInt();

        System.out.println("Now select your second number: ");
        int second = scanner.nextInt();

        int sum = first + second;
        int diff = first - second;
        int times = first * second;
        int divide = first / second;


        System.out.println("Outcome is :" + sum);
        System.out.println("Outcome is :" + diff);
        System.out.println("Outcome is :" + times);
        System.out.println("Outcome is :" + divide);

        String operator = scanner.nextLine();

        if (Objects.equals(operator, "+")){

            System.out.println(sum);
        }
        scanner.close();
    }
}