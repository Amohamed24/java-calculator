import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {

        // CALCULATOR
        System.out.println("Hi, please enter a name: ");
        String name = scanner.nextLine();

        while(true) {
            System.out.println("*****************************");
            System.out.println("Hi " + name + ". Select your first number (or type 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thank for playing :" + name);
                break;
            }

            int first;
            try {
                first = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                continue;
            }

            System.out.println("Now select your second number (or type 'q' to quit): ");
            String input2 = scanner.nextLine();

            if (input2.equalsIgnoreCase("q")) {
                System.out.println("Thank for playing :" + name);
                break;
            }

            int second;
            try {
                second = Integer.parseInt(input2);
            } catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'q' to quit.");
                continue;
            }

            System.out.println("Please select an operator (+, -, *, /) or type 'q' to quit: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Thank for playing :" + name);
                break;
            }

            switch (operation) {
                case "+" -> System.out.println("Outcome is: " + (first + second));
                case "-" -> System.out.println("Outcome is: " + (first - second));
                case "*" -> System.out.println("Outcome is: " + (first * second));
                case "/" -> {
                    if (second == 0) {
                        System.out.println("Error: Cannot divide by 0");
                    } else {
                        System.out.println("Outcome is: " + (first / second));
                    }
                }
                default -> System.out.println("Invalid operator. Please choose +, -, *, or ;.");
            }
        };

        scanner.close();
    }
}