package step3;

import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();  // 총 금액
        int n = scanner.nextInt();      // 물건의 종류의 수

        int sum = 0;

        for (int i = 1; i < n + 1; i++) {
            int a = scanner.nextInt();  // 가격
            int b = scanner.nextInt();  // 개수

            sum += a * b;
        }

        System.out.println(sum == total ? "Yes" : "No");
    }
}
