package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체검사 데이터 배열에서 이진 검색하기
public class PhysExamSearch {

	// 신체검사 데이터 정의
	static class PhyscData {
		private String name;	// 키
		private int height;		// 이름
		private double vision;	// 시력
		
		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
		
		// 문자열을 반환하는 메서드(정보 확인용)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER 
		= new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return  (d1.height>d2.height) ?  1 :
						(d1.height<d2.height) ? -1 : 0;
			}
		}
		
		// 내림차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> VISION_ORDER
		= new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return  (d1.vision>d2.vision) ?  1 :
						(d1.vision<d2.vision) ? -1 : 0;
			}
		}
		
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = {	// 키의 오름차순으로 정렬되어 있습니다.
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 1.5),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		System.out.print("몇 cm인 사람을 찾고있낭 ? : ");
		int height = sc.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
		);
		
		if(idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]);
		}
		
		// Q7. 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램을 작성하라.
		
		
	}
	

	

}
