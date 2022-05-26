package baekjoon;

/*import java.util.*;*/
import java.io.*;

public class ToBinary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		  ��ĳ�ʸ� ����� ��Ÿ�ӿ����� ���� �ٸ� ����� ��� 
		  Scanner sc = new Scanner(System.in); 
		  int n = sc.nextInt(); 
		  String rs = "";
		 
		 while(n>0) { rs = n%2+rs; n/=2; }
		  
		  System.out.println(rs);
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		// ������ n�� ������ �ʹ� Ŀ�� int�� �ϸ� ��Ÿ�ӿ���(NumberFormat)�� ��� long���� �ٲ��� ��!
		long n = Long.parseLong(br.readLine());
		
		String rs = "";

		while (n > 0) {
			rs = n % 2 + rs;
			n /= 2;
		}
		System.out.println(rs);
	}

}
