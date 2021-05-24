package chap02;

import java.util.Scanner;

public class PracticeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("띄어쓰기가 없는 문장이나 단어를 입력하세요.");
		String s = sc.next();
		int n = s.length();
		String copy = "";
		System.out.print("문장의 구성 : [");
		for(int i=0; i<n; i++) {
			s.charAt(i);
			
			if(i<n-1) System.out.print(s.charAt(i)+"+");
			if(i==n-1) System.out.print(s.charAt(i)+"]");
			copy += s.charAt(i);
		}
		System.out.println();
		System.out.println("=> " + copy);
		if(s.equals(copy)) System.out.println("문장의 구성 글자를 모두 합친 것이 입력한 문장과 일치합니다.");
	}
}
