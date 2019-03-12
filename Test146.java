/*=========================================
	■■■ 예외(Exception) 처리 ■■■
==========================================*/
//145.java와 비교~!!!

class Demo2
{	
	//주요 속성 구성
	private int value;

	//setter
	public void setValue(int value)	throws Exception
	{
		if (value<=0)
			throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
			//-- 새로운 예외 발생~!!!
			//unreported exception Exception; must be caught or declared to be thrown
	        //     throw new Exception("value는 0보다 작거나 같을 수 없습니다.");
			//br.readLine()과 비슷한 구조
		this.value = value;
	}
	
	//getter
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String[] args) //throws Exception
	{
		Demo2 ob = new Demo2();

		try
		{
				ob.setValue(-10);
				int result = ob.getValue();
				System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}
}

//실행결과
/*- main에서 throws 했을 때
Exception in thread "main" java.lang.Exception: value는 0보다 작거나 같을 수 없습니다.
        at Demo2.setValue(Test146.java:15)
        at Test146.main(Test146.java:36)
*/

//try catch를 사용했을때
//java.lang.Exception: value는 0보다 작거나 같을 수 없습니다.