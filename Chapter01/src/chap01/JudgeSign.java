package chap01;

import java.util.Scanner;

public class JudgeSign {
	// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		int n = sc.nextInt();
		
		if(n>0) System.out.println("입력한 정수는 양수입니다.");
		else if(n<0) System.out.println("입력한 정수는 음수입니다.");
		else System.out.println("입력한 정수는 0입니다.");
		
	}
}
