/*===========================================================
	���� Ŭ������ �ν��Ͻ� ����
	- ������(Constructor)�� �ʱ�ȭ ��(Initialized Block)
===========================================================*/

public class Test078
{
	int n;
	int m;
		
	//int n=10;	����� ���ÿ� �ʱ�ȭ�� ����
	//int m=20;

	//n=10;		class���� ������� �Ұ���
	//m=20;

	//������1(Constructor)
	Test078()
	{
		n=100;
		m=200;
		System.out.println("������ ����...");
	}

	//������2(Constructor)
	Test078(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("������ ����...");
	}

	//�ʱ�ȭ ��(Initialized Block)
	{
		n=10;
		m=20;
		System.out.println("�ʱ�ȭ �� ����...");
	}

	// �� ������ ��� �����ڰ� ���߿� ����ȴ�. �ʱ�ȭ������ �����ڰ� �� �߿�

	//��� �޼ҵ� ����
	void write()
	{
		System.out.println("n : "+n+",m : "+m);
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//--==>> �ʱ�ȭ �� ����...
		//		 ������ ����...
		//		 n : 100,m : 200
		Test078 ob2 = new Test078(1234,5678);
		ob2.write();
	}
}
//���� ���
/*
�ʱ�ȭ �� ����...
������ ����...
n : 100,m : 200
�ʱ�ȭ �� ����...
������ ����...
n : 1234,m : 5678
*/