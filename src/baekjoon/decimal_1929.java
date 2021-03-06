package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class decimal_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[N+1];

        for(int i = 2; i <= N; i++){
            for(int j = 2; i*j <= N ; j++){
                check[i*j] = true;
            }
        }

        for(int i = M; i <= N; i++){
            if(check[i] != true && i != 1){
                System.out.println(i);
            }
        }
    }
}
