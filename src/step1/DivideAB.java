package step1;

import java.util.Scanner;

public class DivideAB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double doubleA = a;
        double doubleB = b;


        System.out.println(doubleA/doubleB);
    }
}
