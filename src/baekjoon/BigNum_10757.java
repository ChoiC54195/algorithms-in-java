package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigNum_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        String A = st.nextToken();
        String B = st.nextToken();

        char[] a = new char[A.length()];
        char[] b = new char[B.length()];
        int len = A.length() > B.length() ? A.length()+1: B.length()+1;
        // 같은 자리의 수를 더했을 때 더하다가 올림이 발생하여 한자리가 더 커질 수 있으므로
        int[] result = new int[len];

        // 다른 자리수를 입력 받아 더할 수 있기 때문에 따로 해줌
        for (int i = 0; i < a.length; i++) {
            a[i] = A.charAt(i);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = B.charAt(i);
        }

        /*for(int i = 0 ; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        for(int i = 0 ; i < b.length; i++){
            System.out.print(b[i]);
        }
        System.out.println();
        */

        int ai = a.length-1; // a의 인덱스 끝부터
        int bi = b.length-1; // b의 인덱스 끝부터

        for (int i = len-1; i > 0; i--) {
            //System.out.println(i+"번째 더하기 시작\n");
            if(ai>=0 && bi >=0) {
                result[i] += a[ai] + b[bi] - 96;
                //System.out.println(result[i] + " += "+(a[ai]-48) + " + "+(b[bi]-48));
                ai--;
                bi--;
            }else if(ai < 0){
                //System.out.println(result[i] + " += "+(b[bi]-48));
                result[i] += b[bi] - 48;
                bi--;
            }else if(bi < 0){
                //System.out.println(result[i] + " += "+(a[ai]-48));
                result[i] += a[ai] - 48;
                ai--;
            }
            if (result[i] > 9) {
                result[i-1] = 1;
                result[i] %= 10;
            }
        }

        for (int i = 0; i < len; i++) {
            if (result[i] == 0 && i == 0) {
                i++; // 맨 앞자리가 0일때는 출력하지 않는다.
            }
            System.out.print(result[i]);
        }

    }
}
