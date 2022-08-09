package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] basic = new int[6];
        int[] input = new int[6];

        basic[0] = 1;
        basic[1] = 1;
        basic[2] = 2;
        basic[3] = 2;
        basic[4] = 2;
        basic[5] = 8;


        for(int i = 0; i < 6; i++){
            input[i] = Integer.parseInt(st.nextToken());
            System.out.print((basic[i] - input[i])+" ");
        }

    }
}
