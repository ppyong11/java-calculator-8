package calculator;

import java.util.regex.Pattern;

public class Delimiter {

    // 구분자로 나눈 숫자 문자열 반환 메서드
    public static String[] split(String input) {
        // 콘솔에 \n 입력 시 \\n으로 바뀜
        input = input.replace("\\n", "\n");

        if (input.startsWith("//")) {
            String[] parts = input.split("\n", 2); // \n을 기준으로 구분자 정의 파트, 숫자 데이터 파트 나누기

            if (parts.length < 2) { //구분자로 나눈 문자열이 구분자 파트, 숫자 파트가 아닐 때
                throw new IllegalArgumentException("커스텀 구분자 형식이 잘못되었습니다.");
            }

            String customDelimiter = parts[0].substring(2); // //~ -> ~
            return parts[1].split(Pattern.quote(customDelimiter)); // 정규식 이스케이프 대비
        }

        return input.split(",|:"); // 기본 구분자
    }
}
