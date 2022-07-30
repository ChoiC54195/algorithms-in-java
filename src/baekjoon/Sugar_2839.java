package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_2839 {
    public static void main(String[] args) throws IOException {
        /*
        *
        * 설탕 N(kg)
        * 포대는 3(kg), 5(kg)
        * 최대한 적은 개수로
        *
        */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine()); // 설탕
        int count = 0; // 가져가는 봉투의 개수

        /*
            최대한 적은 개수이므로 일단 5kg 봉투로 들 수 있는 만큼 들고 나머지를 3kg 봉투로 들면 된다
            규칙을 찾아서 묶어준다
         */
        if (sugar == 4 || sugar == 7) { // 4와 7은 나누어 떨어지지 않으므로 -1
            count = -1;
        }
        else if (sugar % 5 == 0) { // 5의 배수인 경우 5kg 봉투만 사용하면 되므로 몫
            count = sugar / 5;
        }
        /*
            설탕의 kg - 봉투의 개수
            3 - 1(3kg : 1개)
            6 - 2(5kg : 1개,3kg : 1개)
            8 - 2(5kg : 1개,3kg : 1개)
            9 - 3(5kg : 1개,3kg : 2개)
            11 - 3(5kg : 2개,3kg : 1개)
            12 - 3(5kg : 2개,3kg : 2개)
            .
            .
            나머지가 1이거나 3일 때 3kg가 하나 더 추가되고
            나머지가 2이거나 4일 때 3kg가 두개 더 추가됨

        */
        else if (sugar % 5 == 1 || sugar % 5 == 3) {
            count = (sugar / 5) + 1;
        }
        else if (sugar % 5 == 2 || sugar % 5 == 4) {
            count = (sugar / 5) + 2;
        }

        System.out.println(count);
    }
}
