/*=========================================
	■■■ 예외(Exception) 처리 ■■■
	- 잡아낸 예외 다시 던지기
==========================================*/
//코드 해석 해보기

public class Test147
{
	public static void main(String[] args)
	{	
		Test147 ob = new Test147();
		
		try
		{
			int a = ob.getValue(-2);
			System.out.println(" a: "+a);
		}
		catch (Exception e)
		{
			System.out.println("printStackTrace....(getValue)");
			e.printStackTrace();
		}

	}

	public int getData(int data) throws Exception
	{
		if (data<0)
		{
			throw new Exception("data가 0보다 작습니다.");	//① 최초 예외 발생
		}
		return data+10;
	}

	//check~!!!
	public int getValue(int value)	throws Exception
	{
		int a=0;

		try
		{
			a = getData(-2); // ② 무조건 예외 발생
		}
		catch (Exception e)	// ③ 잡아낸 예외
		{
			// ④ 잡아낸 예외애 대한 처리
			System.out.println("printStackTrace....(getValue)");
			e.printStackTrace();

			throw e;	//⑤다시 던지기
			//-- 주석 처리 시(즉, 잡아낸 예외를 다시 던지지 않을 경우)
			//	 main() 메소드의 try-catch는 수행되지 않게 된다.
			//	 -> 예외가 있는지도 모르고 지나감
		}
		return a;
	}
}

