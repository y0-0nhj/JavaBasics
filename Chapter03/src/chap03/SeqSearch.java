package chap03;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i==n)
				return -1;	// 검색 실패(-1을 반환)
			if(a[i]==key)
				return i;	// 검색 성공(인덱스를 반환)
			i++;
		}
	}
	
	// Q3 풀이
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[cnt] = i;
				cnt++;
			}
		}
		
		System.out.print("idx[] = ");
		System.out.print("{"+idx[0]);
		for(int i=1; i<cnt; i++) 
			System.out.print(", "+idx[i]);
		System.out.print("}");

		return cnt;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];				// 요솟수가 num인 배열 x
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");		// 키 값 입력
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);	// 배열 x에서 키 값이  key인 요소를 검색
		
		if(idx==-1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
		System.out.println();
		
		// Q3. 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
		// 일치한 요솟수를 반환하는 메서드를 작성하라.
		// 예를 들어 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고
		// key가 9면 배열 idx에 {1, 3, 7}을 저장하고 3을 반환합니다.
		int[] idx2 = new int[num];
		System.out.println("\n배열 idx의 개수 : "+searchIdx(x, num, key, idx2));
	
		
	}
	
}
