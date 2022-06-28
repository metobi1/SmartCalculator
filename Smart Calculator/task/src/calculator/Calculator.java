package calculator;

public class Calculator {

    private int num1;
    private int num2;

    Calculator(int[] numbers) {

        if (numbers.length == 2) {
            this.num1 = numbers[0];
            this.num2 = numbers[1];
        } else {
            this.num1 = numbers[0];
        }
    }

    public int sum() {
        return num1 + num2;
    }

}
