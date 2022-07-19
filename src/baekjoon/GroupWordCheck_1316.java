package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupWordCheck_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0 ; i < N; i++) {
            if(isGroupWord()){
                count++;
            }
        }
        System.out.println(count);

    }

    static boolean isGroupWord() throws IOException {
        boolean[] check = new boolean[26];
        int preChar = 0;
        String str = br.readLine();

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            if (ch != preChar) {
                if (!check[ch - 'a']) {
                    check[ch - 'a'] = true;
                    preChar = ch;
                }else{
                    return false;
                }
            }else {
                continue;
            }
        }
        return true;
    }

}
