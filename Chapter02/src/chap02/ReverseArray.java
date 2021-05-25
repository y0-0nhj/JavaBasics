package chap02;

import java.util.Scanner;

public class ReverseArray {
	// 배열 요소에 값을 읽어 들여 역순으로 정렬.
	
	private static void swap(int[] a, int idx1, int idx2) {
		// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) 
			swap(a, i, a.length-i-1);
	}
	
	static void reverseProcess(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			int idx1 = i;
			int idx2 = a.length-i-1;
			System.out.println("a["+ idx1 +"]과(와) a["+ idx2 +"]를 교환합니다.");
			swap(a, idx1, idx2);
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j]+" ");
				}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
	private static int sumOf(int[] a) {
		int i=0;
		int sum =0;
		while(i<a.length) {
			sum+=a[i];
			i++;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();			// 요솟수
		
		int[] x = new int[num];			// 요솟수가 num인 배열
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);						// 배열의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] : "+x[i]);
		}
		System.out.println();
		
		
		// Q2. 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하라.
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		reverseProcess(a);
		
		// Q3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하라.
		System.out.println(sumOf(a));
		
	}
}
