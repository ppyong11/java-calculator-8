package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberParse {
    public static List<Integer> parse(String input){
        String[] numbers= Delimiter.split(input);

        try{
            return Arrays.stream(numbers)
                    .map(Integer::parseInt)
                    .peek(NumberParse::validateNumber)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
        }
    }
    private static void validateNumber(int num){
        if(num < 0) throw new IllegalArgumentException("음수값은 허용되지 않습니다");
    }
}
