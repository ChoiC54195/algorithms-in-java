package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 첫번째 문자열 입력
        int l = s.length();
        int cnt = 0; // 크로아티아 문자의 개수
        for (int i = 0; i < l; i++) {
            if (i != l - 1) {
                // 마지막 글자가 크로아티아 문자가 아닐때 IndexOutOfBoundsException 발생 다음 글자가 없기 때문에
                //i++ --> 오류 생김 --> 마지막 글자일 때는 밖으로 나가준다.
                if (s.charAt(i) == 'c') {
                    if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                        i++; // 한글자 건너뛴다
                    }
                } else if (s.charAt(i) == 'd') {
                    if (s.charAt(i + 1) == '-') {
                        i++;
                    } else if (s.charAt(i + 1) == 'z') {
                        if ((i + 1) == l - 1) {
                            cnt+=2;// 반례 : 마지막 글자가 dz일때
                            break;
                        } else {
                            if (s.charAt(i + 2) == '=') {
                                i += 2; // 세글자이기 때문에 이 글자만 +2
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
            cnt++; // 알파벳 숫자 세주기
        }
        System.out.println(cnt);
    }
}
