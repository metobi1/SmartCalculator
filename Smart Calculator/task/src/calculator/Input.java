package calculator;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner =
            new Scanner(System.in);
    private final String input;

    public Input(String input) {
        this.input = input;
    }

    public boolean emptyLine() {
        return "".equals(input);
    }

    public int[] getNumbers() {

        String[] strArray = input.split(" ");
        return convertStrArray(strArray);
    }

    private int[] convertStrArray(String[] strArray) {
        int len = strArray.length;
        int[] arrOfNums = new int[len];

        for (int i = 0; i < strArray.length; i++) {
            int num = convertStrToInt(strArray[i]);
            arrOfNums[i] = num;
        }
        return arrOfNums;
    }

    private int convertStrToInt(String str) {

        int num = 0;

        try {
            num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
        return num;
    }
}
