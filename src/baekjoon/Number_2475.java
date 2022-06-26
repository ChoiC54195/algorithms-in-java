package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int rs = 0;
        int temp = 0;

        for (int i = 0; i < 5; i++) {
            temp = Integer.parseInt(st.nextToken());
            //System.out.println(temp);
            rs += temp*temp;
        }
        int num = rs%10;
        System.out.println(num);

        br.close();
    }
}
