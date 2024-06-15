package step2;

import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int reward = 0;

        if (a == b && b == c) {     // 같은 눈 3개
            reward = 10000 + a * 1000;
        } else if (a == b){
            reward = 1000 + a * 100;
        } else if (b == c) {
            reward = 1000 + b * 100;
        } else if (a == c) {
            reward = 1000 + c * 100;
        } else {
            if(a > b && a > c) {
                reward = 100 * a;
            } else if (b > a && b > c) {
                reward = 100 * b;
            } else {
                reward = 100 * c;
            }
        }

        System.out.println(reward);
    }
}
