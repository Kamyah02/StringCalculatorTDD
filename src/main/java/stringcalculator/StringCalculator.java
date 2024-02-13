package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
            return addWithCustomDelimiter(numbers, delimiter);
        }

        // Default delimiter (comma and new line)
        return addWithCustomDelimiter(numbers, "[,\n]");
    }

    private int addWithCustomDelimiter(String numbers, String delimiter) {
        String[] numberArray = numbers.split(delimiter);
        int sum = 0;

        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : numberArray) {
            int parsedNum = Integer.parseInt(num);
            if (parsedNum < 0) {
                negativeNumbers.add(parsedNum);
            }
            if (parsedNum <= 1000) {
                sum += parsedNum;
            }
        }

        handleNegativeNumbers(negativeNumbers);

        return sum;
    }

    private void handleNegativeNumbers(List<Integer> negativeNumbers) {
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negativeNumbers);
        }
    }
}
