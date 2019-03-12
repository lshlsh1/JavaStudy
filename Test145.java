/*=========================================
	■■■ 예외(Exception) 처리 ■■■
==========================================*/
//146.java와 비교~!!!
//Demo 클래스는 앞으로 많이 보게될거니까 익혀둡시다

class Demo
{
	private int value;		//전역변수
	
	//setter 값 설정하기
	public void setValue(int value)
	{
		if (value <=0)
		{
			return;	//-- 메소드 종료
		}
		this.value = value;
	}

	//getter 값 받아오기
	public int getValue()
	{
		return value;
	}
}

public class Test145
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}

//실행 결과
//0