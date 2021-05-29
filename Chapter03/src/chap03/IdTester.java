package chap03;
// ������� 3-2 : Ŭ���� �޼���(���� �޼���)�� �ν��Ͻ� �޼���(������ �޼���)
// static�� ������ ����


// ���̵� �ο��ϴ� Ŭ����
class Id{
	private static int cnt = 0;		// ���̵� �� �� �ο��ߴ��� ����
	private int id;					// ���̵�
	
	// ������
	public Id() { id = ++cnt; }
	
	// ���̵� ��ȯ�ϴ� �ν��Ͻ� �޼���
	public int getId() { return id; }
	
	// cnt�� ��ȯ�ϴ� Ŭ���� �޼���
	public static int getCnt() {return cnt;}
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();	// ���̵�1
		Id b = new Id();	// ���̵�2
		
		System.out.println("a�� ���̵� : " + a.getId());
		System.out.println("b�� ���̵� : " + b.getId());
		
		System.out.println("�ο��� ���̵��� ���� : " + Id.getCnt());
		
		// �ν��Ͻ� �޼��� ȣ�� �� : Ŭ������ ���� �̸�.�޼��� �̸�
		// Ŭ���� �޼��� ȣ�� �� : Ŭ���� �̸�.�޼��� �̸�
	}
}
