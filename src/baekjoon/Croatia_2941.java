package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // ù��° ���ڿ� �Է�
        int l = s.length();
        int cnt = 0; // ũ�ξ�Ƽ�� ������ ����
        for (int i = 0; i < l; i++) {
            if (i != l - 1) {
                // ������ ���ڰ� ũ�ξ�Ƽ�� ���ڰ� �ƴҶ� IndexOutOfBoundsException �߻� ���� ���ڰ� ���� ������
                //i++ --> ���� ���� --> ������ ������ ���� ������ �����ش�.
                if (s.charAt(i) == 'c') {
                    if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                        i++; // �ѱ��� �ǳʶڴ�
                    }
                } else if (s.charAt(i) == 'd') {
                    if (s.charAt(i + 1) == '-') {
                        i++;
                    } else if (s.charAt(i + 1) == 'z') {
                        if ((i + 1) == l - 1) {
                            cnt+=2;// �ݷ� : ������ ���ڰ� dz�϶�
                            break;
                        } else {
                            if (s.charAt(i + 2) == '=') {
                                i += 2; // �������̱� ������ �� ���ڸ� +2
                            }
                        }
                    }
                } else if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                } else if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            cnt++; // ���ĺ� ���� ���ֱ�
        }
        System.out.println(cnt);
    }
}
