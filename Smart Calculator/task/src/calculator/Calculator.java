package calculator;

public class Calculator {

    private int[] numbers;

    /*private int num1;
    private int num2;*/

    Calculator(int[] numbers) {

        this.numbers = numbers;
    }

    public int sum() {

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
