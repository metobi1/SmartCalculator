package calculator;

import java.util.Scanner;

public class RunCalculatorApp {

    private static final Scanner scanner =
            new Scanner(System.in);

    protected static void runApp() {

        while (true) {
            String inputStr = getInput();
            if ("/exit".equals(inputStr)) {
                System.out.println("Bye!");
                break;
            }

            Input input = new Input(inputStr);
            if (input.emptyLine()) continue;

            int[] inputNumbers = input.getNumbers().clone();
            Calculator calculator = new Calculator(inputNumbers);
            int result = calculator.sum();
            displayResult(result);
        }
    }

    private static String getInput() {
        return scanner.nextLine();
    }

    private static void displayResult(int result) {
        System.out.println(result);
    }
}
