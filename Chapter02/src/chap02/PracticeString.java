package chap02;

import java.util.Scanner;

public class PracticeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���Ⱑ ���� �����̳� �ܾ �Է��ϼ���.");
		String s = sc.next();
		int n = s.length();
		String copy = "";
		System.out.print("������ ���� : [");
		for(int i=0; i<n; i++) {
			s.charAt(i);
			
			if(i<n-1) System.out.print(s.charAt(i)+"+");
			if(i==n-1) System.out.print(s.charAt(i)+"]");
			copy += s.charAt(i);
		}
		System.out.println();
		System.out.println("=> " + copy);
		if(s.equals(copy)) System.out.println("������ ���� ���ڸ� ��� ��ģ ���� �Է��� ����� ��ġ�մϴ�.");
	}
}
