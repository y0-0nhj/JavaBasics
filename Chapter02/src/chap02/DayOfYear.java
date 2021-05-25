package chap02;

import java.util.Scanner;

public class DayOfYear {

	private static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 윤년
	};
	
	// 서기 year년은 윤년인가 (윤년 : 1 / 평년 : 0)
	private static int isLeap(int year) {
		return (year%4==0 && year%100 !=0 || year%400==0) ? 1: 0;
	}
	
	// 서기 y년 m월 d일의 그 해 경과 일 수를 구함
	private static int dayOfYear(int y, int m, int d) {
		/*
		int days = d;		// 일 수
		
		for(int i=1; i<m; i++)
			days += mdays[isLeap(y)][i-1];
		return days;
		*/
		
		// Q8 메소드
		int cnt = 1;
		while(cnt<m) {
			d += mdays[isLeap(y)][m-1];
			cnt++;
		}
		return d;
	}
	
	private static int leftDayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1; i<m; i++) 
			days += mdays[isLeap(y)][i-1];
			
		if(isLeap(y)==1) return 366-days;
		else return 365-days;
		
	}

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int retry;	// retry 다시한번?
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year  = sc.nextInt();	// 년
			System.out.print("월 : "); int month = sc.nextInt();	// 월
			System.out.print("일 : "); int day  = sc.nextInt();	// 일
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/ 0.아니오.) : ");
			retry = sc.nextInt();
			
		} while(retry==1);
		System.out.println();
		
		
		// Q8. 메서드 dayOfYear를 변수 i와 days없이 구현하세요. while문을 사용하시오.
		
		
		// Q9. y년 m월 d일의 그 해 남은 일 수(12월 31일이면 0, 12월 30일이면 1)를 구하는 아래 메서드를 작성하세요.
		// static int leftDayOfYear(int y, int m, int d)
		System.out.println("그 해 남은 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year  = sc.nextInt();	// 년
			System.out.print("월 : "); int month = sc.nextInt();	// 월
			System.out.print("일 : "); int day  = sc.nextInt();	// 일
			
			System.out.printf("그 해 %d일째 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예/ 0.아니오.) : ");
			retry = sc.nextInt();
			
		} while(retry==1);
	}

}
