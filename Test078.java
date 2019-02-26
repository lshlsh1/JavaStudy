/*===========================================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)와 초기화 블럭(Initialized Block)
===========================================================*/

public class Test078
{
	int n;
	int m;
		
	//int n=10;	선언과 동시에 초기화는 가능
	//int m=20;

	//n=10;		class에서 연산수행 불가능
	//m=20;

	//생성자1(Constructor)
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}

	//생성자2(Constructor)
	Test078(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("생성자 실행...");
	}

	//초기화 블럭(Initialized Block)
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}

	// → 순서가 어떻든 생성자가 나중에 실행된다. 초기화블럭보다 생성자가 더 중요

	//출력 메소드 정의
	void write()
	{
		System.out.println("n : "+n+",m : "+m);
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...
		//		 n : 100,m : 200
		Test078 ob2 = new Test078(1234,5678);
		ob2.write();
	}
}
//실행 결과
/*
초기화 블럭 실행...
생성자 실행...
n : 100,m : 200
초기화 블럭 실행...
생성자 실행...
n : 1234,m : 5678
*/