package chap01;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c) 
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	static int med3_2(int a, int b, int c) { // med3 �޼ҵ忡 ���� ȿ���� �������� -> 
		if((a<=b && a>=c) || (a<=c && a>=b))
			return a;
		else if ((a>b && b<c) || (a<b && c>b))
			return b;
		else return c;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("med3(a,b,c) = " + med3(a, b, c));
		System.out.println("med3_2(a,b,c) = " + med3_2(a, b, c));

	}

}
