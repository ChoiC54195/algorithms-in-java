package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {

	public static void main(String[] args) throws IOException {
		// ����1712:���ͺб���
		/*
		 * �������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�. ��Ʈ�� �Ǹ� ����� ������� �ų� �Ӵ��, ��꼼, �����, �޿� �� A������ ���� �����
		 * ���, �� ���� ��Ʈ���� �����ϴ� ������ ����� �ΰǺ� �� �� B������ ���� ����� ��ٰ� �Ѵ�.
		 * 
		 * ���� ��� A=1,000, B=70�̶�� ����. �� ��� ��Ʈ���� �� �� �����ϴ� ���� �� 1,070������ ���, �� �� �����ϴ� ���� ��
		 * 1,700������ ���.
		 * 
		 * ��Ʈ�� ������ C�������� å���Ǿ��ٰ� �Ѵ�. �Ϲ������� ���� ����� �÷� ���� ���� ��� ���� �� ����(�Ǹź��)�� ��
		 * ���(=�������+�������)���� �������� �ȴ�. ���ʷ� �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб���(BREAK-EVEN
		 * POINT)�̶�� �Ѵ�.
		 * 
		 * A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		// A�� �������, B�� �������, C�� ��ǰ����
		// N���� �����Ͽ� �Ǹ��Ͽ��� �� C*n > A+B*n�� �Ǿ�� ���ͺб����� ���� ��
		// ��, N+1�� ���ϴ� ����
		// C*n = A+B*n -> n = A/(C-B) �̰� ���� ������ ������ �����̹Ƿ� +1�� ����� �Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		
		if(b>=c) { 
			// b=c�� ���� c-b�� �и� 0�̹Ƿ� ���� �� ���� b>c�� �и� �����̹Ƿ� ������ �߻����� �ʴ´�.
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);	
		}
	}

}
