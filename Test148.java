/*=========================================
	■■■ 예외(Exception) 처리 ■■■
	- 다른 예외 다시 던지기
==========================================*/
//-- 예외상황에서는 return값이 정상적으로 저장되지 않는다.

public class Test148
{
	public int getValue(int value)	throws Exception	//파란 폭탄 던지기
	{
		int a =0;

		try
		{
			a = getData(-2); 
			//-- a유형의 빨간 폭탄 잡아내기
		}
		catch (Exception e)
		{
			//ⓐ유형의 빨간 폭탄 처리
			System.out.println("printStackTrace....(getValue)");
			e.printStackTrace();

			//예외발생 -- ⓑ유형의 파란 폭탄
			throw new Exception("value가 음수입니다.");
		}
		return a;
		
	}

	public int getData(int data)	throws Exception	//빨간폭탄 던지기
	{
		if (data<0)
			throw new Exception("data가 0보다 작습니다.");
			//-- 예외 발생 ⓐ유형의 빨간 폭탄		

		return data+10;

	}
	public static void main(String[] args)
	{

		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);
			System.out.println("a : "+a);
		}
		catch (Exception e)		//파란 폭탄 잡기
		{
			System.out.println("printStackTrace....(main)");
			e.printStackTrace();
		}
	}
}

//실행결과
/*
printStackTrace....(getValue)
java.lang.Exception: data가 0보다 작습니다.
        at Test148.getData(Test148.java:34)
        at Test148.getValue(Test148.java:14)
        at Test148.main(Test148.java:48)
printStackTrace....(main)
java.lang.Exception: value가 음수입니다.
        at Test148.getValue(Test148.java:24)
        at Test148.main(Test148.java:48)
*/