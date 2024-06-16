package step3;

import java.io.*;
import java.util.StringTokenizer;

public class FastAB {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());

        for(int i = 1; i < t + 1; i++) {
            String ab = bf.readLine();
            StringTokenizer ab_token = new StringTokenizer(ab);

            int a = Integer.parseInt(ab_token.nextToken());
            int b = Integer.parseInt(ab_token.nextToken());

            bw.write((a + b) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
