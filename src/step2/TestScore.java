package step2;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        String grade = "";

        if ((score > 89) && (score < 101)){
            grade = "A";
        } else if ((score > 79) && (score < 90)) {
            grade = "B";
        } else if ((score > 69) && (score < 80)) {
            grade = "C";
        } else if ((score > 59) && (score < 70)) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
    }
}
