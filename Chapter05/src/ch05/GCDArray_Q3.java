package ch05;

import java.util.Scanner;

// Q3. 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하라.
public class GCDArray_Q3 {
	static int GCDArray(int[] a, int n) {
		int x = a[0];
		for(int i=0;i<n-1;i++) {
			int y = a[i+1];
			int num;
			while(y!=0) {
				num = y;
				y = x%y;
				x = num;	// swap기법 활용한 x 자리바꿈.
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length;i++) {
			System.out.print("요소 : ");
			a[i] = sc.nextInt();
		}
		System.out.println("배열의 모든 요소의 최대 공약수는 "+ GCDArray(a, n) +"입니다.");
		
	}

}
