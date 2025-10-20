package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        try {
            System.out.println("덧셈할 문자열을 입력해 주세요.");
            String input = Console.readLine();
            int result = StringCalculator.calculate(input);
            System.out.println("결과 : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("에러 발생: " + e.getMessage());
            throw new IllegalArgumentException(e);
        } finally {
            Console.close();
        }
    }
}
