package step2;

import java.util.Scanner;

public class OvenClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int cook = scanner.nextInt();

        h += cook / 60;
        m += cook % 60;

        if (m >= 60) {  //60분이 되면 1시간이 오름
            h += 1;
            m -= 60;
        }

        if (h >= 24) {  //23시 다음은 0시
            h -= 24;
        }

        System.out.println(h + " " + m);

    }
}
