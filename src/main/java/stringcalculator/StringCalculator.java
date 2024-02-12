package stringcalculator;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        // Check for custom delimiter
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, 3);
            numbers = numbers.substring(4);
            // Allowing custom delimiter along with comma and new line
            String[] numberArray = numbers.split("[," + delimiter + "\n]");
            int sum = 0;

            for (String num : numberArray) {
                sum += Integer.parseInt(num);
            }

            return sum;
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
