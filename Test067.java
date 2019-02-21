/*================================================
	■■■ 메소드 재귀호출 (재귀 메소드) ■■■
==================================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	public static void showHi(int cnt)
	{
		System.out.println("Hi~~!!!");			
		if(cnt==1)
			return;
			showHi(--cnt);	//postfix(cnt--) 일때는 숫자의 감소가 일어나지 않는다
	}
}

//실행 결과
/*
Hi~~!!!
Hi~~!!!
Hi~~!!!
*/
