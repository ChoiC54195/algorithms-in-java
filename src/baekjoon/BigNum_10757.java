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
        // ���� �ڸ��� ���� ������ �� ���ϴٰ� �ø��� �߻��Ͽ� ���ڸ��� �� Ŀ�� �� �����Ƿ�
        int[] result = new int[len];

        // �ٸ� �ڸ����� �Է� �޾� ���� �� �ֱ� ������ ���� ����
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

        int ai = a.length-1; // a�� �ε��� ������
        int bi = b.length-1; // b�� �ε��� ������

        for (int i = len-1; i > 0; i--) {
            //System.out.println(i+"��° ���ϱ� ����\n");
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
                i++; // �� ���ڸ��� 0�϶��� ������� �ʴ´�.
            }
            System.out.print(result[i]);
        }

    }
}
