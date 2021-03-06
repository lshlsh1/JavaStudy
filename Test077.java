/*=======================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)
========================================*/

public class Test077
{
	int val1;
	double val2;

	Test077()
	{
		val1 = 0;
		val2 = 0;
		System.out.println("매개변수 없는 생성자 호출~!!!");
	}

	Test077(int x)
	{
		val1 = x;
		val2 = 0;
		System.out.println("int 형 매개변수를 넘겨받는 생성자 호출~!!!");
	}

	Test077(double y)
	{
		val1 = 0;
		val2 = y;

		System.out.println("double형 매개변수 넘겨받는 생성자 호출~!!!");
	}

	Test077(int x,double y)
	{
		val1 = x;
		val2 = y;
		System.out.println("int와 double형 매개변수 넘겨받는 생성자 호출~!!!");
	}
	public static void main(String[] args)
	{
		Test077 ob1 = new Test077();
		Test077 ob2 = new Test077(4);
		Test077 ob3 = new Test077(4.0);
		Test077 ob4 = new Test077(4, 4.0);

		System.out.println(ob1.val1 + ", " + ob1.val2);
		System.out.println(ob2.val1 + ", " + ob2.val2);
		System.out.println(ob3.val1 + ", " + ob3.val2);
		System.out.println(ob4.val1 + ", " + ob4.val2);

	}
}

//실행 결과
/*
매개변수 없는 생성자 호출~!!!
int 형 매개변수를 넘겨받는 생성자 호출~!!!
double형 매개변수 넘겨받는 생성자 호출~!!!
int와 double형 매개변수 넘겨받는 생성자 호출~!!!
0, 0.0
4, 0.0
0, 4.0
4, 4.0
*/
