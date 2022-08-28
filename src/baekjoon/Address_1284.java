package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Address_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while(!input.equals("0")) {
            int rs = 1;
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);
                if(temp=='0'){
                    rs += 5;
                } else if (temp=='1') {
                    rs += 3;
                } else  {
                    rs += 4;
                }
            }
            System.out.println(rs);
            input = br.readLine();
        }
    }
}
