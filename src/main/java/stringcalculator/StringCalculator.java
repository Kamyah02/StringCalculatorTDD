package stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Allowing new line as well as comma as delimiters
        String[] numberArray = numbers.split("[,\n]");
        int sum = 0;

        for (String num : numberArray) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}
