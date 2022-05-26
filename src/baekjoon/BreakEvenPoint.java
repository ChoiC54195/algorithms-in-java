package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws IOException {
		// 백준1712:손익분기점
		/*
		 * 월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이
		 * 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
		 * 
		 * 예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총
		 * 1,700만원이 든다.
		 * 
		 * 노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총
		 * 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN
		 * POINT)이라고 한다.
		 * 
		 * A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
		 */
		
		// A는 고정비용, B는 가변비용, C는 상품가격
		// N개를 생산하여 판매하였을 때 C*n > A+B*n이 되어야 손익분기점을 넘은 것
		// 즉, N+1을 구하는 문제
		// C*n = A+B*n -> n = A/(C-B) 이건 비용과 수익이 같아진 지점이므로 +1을 해줘야 한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		
		if(b>=c) { 
			// b=c일 때는 c-b가 분모가 0이므로 나눌 수 없고 b>c면 분모가 음수이므로 이익이 발생하지 않는다.
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);	
		}
	}

}
