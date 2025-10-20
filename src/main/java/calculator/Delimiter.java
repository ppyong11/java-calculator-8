package calculator;

public class Delimiter {

    //구분자로 나눈 숫자 문자열 반환 메서드
    public static String[] split(String input){
        return input.split(",|:"); //기본 구분자
    }
}
