package baekjoon;

import java.util.Scanner;

public class recursive_17478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        recursive(0);
    }

    public static void recursive(int n) {
        String s = "";
        System.out.print("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
        for(int i = 0 ; i < n; i++) {
            System.out.print("\"����Լ��� ������?\"\n" +
                    "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n" +
                    "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n" +
                    "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
        }
        System.out.print("\"����Լ��� ������?\"\n" +
                "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
        System.out.println("��� �亯�Ͽ���.");
    }
}
