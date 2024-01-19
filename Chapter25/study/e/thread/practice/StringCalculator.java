package lang.thegodofjava.Chapter26.e.io.practice;

import java.math.BigDecimal;
import java.util.HashSet;

public class Test {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // 두 문자열의 각 자릿수를 더하고, carry를 관리하여 계산
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;  // 다음 자릿수로의 carry
            result.insert(0, sum % 10);  // 현재 자릿수의 값을 결과에 추가
            System.out.println(result.toString());
            // 다음 자릿수로 이동
            i--;
            j--;
        }
        HashSet

        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45677";

        String sum = addStrings(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
