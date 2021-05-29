package chap03;
// 보충수업 3-2 : 클래스 메서드(정적 메서드)와 인스턴스 메서드(비정적 메서드)
// static의 유무의 차이


// 아이디를 부여하는 클래스
class Id{
	private static int cnt = 0;		// 아이디를 몇 개 부여했는지 저장
	private int id;					// 아이디
	
	// 생성자
	public Id() { id = ++cnt; }
	
	// 아이디를 반환하는 인스턴스 메서드
	public int getId() { return id; }
	
	// cnt를 반환하는 클래스 메서드
	public static int getCnt() {return cnt;}
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();	// 아이디1
		Id b = new Id();	// 아이디2
		
		System.out.println("a의 아이디 : " + a.getId());
		System.out.println("b의 아이디 : " + b.getId());
		
		System.out.println("부여한 아이디의 개수 : " + Id.getCnt());
		
		// 인스턴스 메서드 호출 시 : 클래스형 변수 이름.메서드 이름
		// 클래스 메서드 호출 시 : 클래스 이름.메서드 이름
	}
}
