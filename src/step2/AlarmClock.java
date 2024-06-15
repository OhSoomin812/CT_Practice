package step2;

import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if (m < 45) {    //45분보다 작을 경우 h도 한시간 줄여야함

            //만약 자정일 경우 23시가 되어야함
            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }

            m = 60 - 45 + m;
        }else {
            m -= 45;
        }

        System.out.print(h + " " + m);
    }
}
