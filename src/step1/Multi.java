package step1;

import java.util.Scanner;

public class Multi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] num2_digits = new int[3];
        num2_digits[0] = num2 % 10; // 일의 자리
        num2_digits[1] = (num2 / 10) % 10;  // 10의 자리
        num2_digits[2] = num2 / 100;    // 100의 자리

        int result1 = num1 * num2_digits[0];
        int result2 = num1 * num2_digits[1];
        int result3 = num1 * num2_digits[2];
        int result4 = num1*num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
