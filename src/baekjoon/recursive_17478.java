package baekjoon;

import java.util.Scanner;

public class recursive_17478 {
    static String line = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
        recursive(n);
        sc.close();
    }

    public static void recursive(int n) {
        String tap = line;
        if (n == 0) {
            System.out.print(tap+"\"����Լ��� ������?\"\n");
            System.out.print(tap+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
            System.out.println(tap+"��� �亯�Ͽ���.");
            return; // ����
        }
        System.out.print(tap+"\"����Լ��� ������?\"\n");
        System.out.print(tap+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
        System.out.print(tap+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
        System.out.print(tap+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");

        line += "____";
        recursive(n-1);
        System.out.println(tap+"��� �亯�Ͽ���.");


    }
}
