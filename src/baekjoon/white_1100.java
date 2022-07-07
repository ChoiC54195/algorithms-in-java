package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class white_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String[][] map = new String[8][8];

        for(int i = 0 ; i < map.length; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0 ; j<map[0].length; j++){
                map[i][j]=arr[j];
            }
        }

        for(int i = 0 ; i < map.length; i++){
            for(int j = 0 ; j<map[0].length; j++){
                if((i+j)%2 == 0 && map[i][j].equals("F")){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
