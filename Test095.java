/*=====================================================
	■■■ 메소드 중복정의(Method Overloading) ■■■
=======================================================*/

/*
 ○ 메소드 중복정의 개요
	빵, 우유, 빵우유 받는 같은 이름의 메소드 이야기
	메소드 중복정의(Method Overloading)란 
	메소드가 처리하는 기능은 같고(혹은 매우 유사하고)
	메소드 괄호 속에 넘겨주게 되는 인수(인자, 매개변수, 파라미터)의 갯수가 다르거나
	자료형(data Type)이 다른경우
	매소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
	문법적으로 허용하게 되는데
	이를 메소드 오버로딩(Method Overloading) 이라고 한다.
*/

/*
public class Test095 → 실행불가
{
	public static void main(String[] args)		//클래스 메소드
	{
		drawline();
	}

	//선을 그리는 메소드 정의
	public void drawline()						//인스턴스 메소드 ㅁ
	{
		System.out.println("====================");	//20개
		
	}
}
*/

public class Test095
{
	public static void main(String[] args)		
	{
		drawline();

		//drawline2("*",20) → 불편해~!

		drawline('-');
		
		drawline('+');

		drawline('>',80);

		drawline('*',50);
	}

	//선을 그리는 메소드 정의
	public static void drawline()						
	{
		System.out.println("====================");	//20개
		
	}

	//선의 형태를 바꾸어 그리는 메소드 정의
	//public static void drawline2(char c)
	public static void drawline(char c)
	{
		for ( int i=0 ; i<20 ; i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

	//선의 형태와 길이를 바꾸어 그리는 메소드 정의
	//public static void drawline3(char c, int n)
	public static void drawline(char c, int n)
	{
		for (int i=0 ; i<n ; i++ )
		{
			System.out.print(c);
		}System.out.println();
	}



}



//실행 결과
/*
====================
--------------------
++++++++++++++++++++
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
**************************************************
*/

