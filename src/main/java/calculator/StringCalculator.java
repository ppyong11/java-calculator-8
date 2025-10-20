package calculator;

import java.util.List;

public class StringCalculator {
    public static int calculate(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        List<Integer> numbers = NumberParse.parse(input);

        return numbers.stream().reduce(0, Integer::sum);
    }
}
