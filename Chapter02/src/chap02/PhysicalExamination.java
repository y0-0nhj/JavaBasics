package chap02;

import java.util.Scanner;

// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class PhysicalExamination {

	static final int VMAX = 21;	// 시력 분포(0.0에서 0.1단위로 21개)
	
	static class PhyscData {
		String name;	// 이름
		int height;		// 키
		double vision;	// 시력
	
		// 생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 키의 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum+=dat[i].height;
		}
		return sum / dat.length;
	}
	
	// 시력 분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0;
		for(i=0; i<dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision * 10)]++;
	}
	
	
	static class YMD {
		int year;	// 년
		int month;	// 월(1~12)
		int day;	// 일(1~31)
		
		static int isLeap(int year) {
			return (year%4==0 && year%100!=0 || year%400==0)? 1:0;
		}
		
		static int[][] mdays = {
				{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		};
		
		// 생성자
		YMD(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		
		YMD after(int n){
			if(n < 0) return(before(-n));
			YMD result = new YMD(this.year, this.month, this.day);

			result.day += n;

			while(result.day > mdays[isLeap(result.year)][result.month - 1]){
				result.day -= mdays[isLeap(result.year)][result.month - 1];
				if(++result.month > 12){
					result.year++;
					result.month = 1;
				}
			}
			return result;
			
		}
		
		YMD before(int n){
			if(n < 0) return(after(-n));
			YMD result = new YMD(this.year, this.month, this.day);

			result.day -= n;

			while(result.day < 1){
				if(--result.month < 1){
					result.year--;
					result.month = 12;
				}
				result.day += mdays[isLeap(result.year)][result.month - 1];
			}

			return result;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
		};
		
		int[] vdist = new int[VMAX];	// 시력 분포
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println(" 이름	키     시력");
		System.out.println("-----------------");
		for(int i=0; i<x.length; i++) 
			System.out.printf("%-8s%3d%5.1f\n",
					x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); 		// 시력분포를 구함
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) 
			System.out.printf("%3.1f~:%2d명\n", i/10.0, vdist[i]);
		
		
		// Q10. 기호문자 *를 시력 분포에 해당하는 사람 수만큼 반복하여 나타내라.
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~: ", i/10.0);
				for(int j=0; j<vdist[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		System.out.println();
		
		// Q11. 서기 년월일을 필드로 갖는 클래스 생성
		
		System.out.println("년월일을 입력하시오.");
		int y, m, d;
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		
		YMD days = new YMD(y,m,d);
		
		int n;
		System.out.print("n의 값 : ");
		n = sc.nextInt();
		System.out.println();
		
		YMD d1 = days.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.year, d1.month, d1.day);
		
		YMD d2 = days.before(n);
		System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일입니다.", n, d2.year, d2.month, d2.day);
		

	}

}
