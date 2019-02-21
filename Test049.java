/*================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(while)문 실습
==================================================*/

// 실행 예)
// 연산 결과 : xxxx

// 1 * 2 * 3 * 4 * .... * 10

public class Test049
{
	public static void main(String[] args)
	{
		/*
		int n=1, m=1;
		
		while(n<=10)
		{
			m *= n;
			n++;
		}

		System.out.println("연산 결과 : "+m);
		*/
		
		//선생님 풀이

		int n=0, result=1;		// check
								// 누적 곱을 담을 변수는 1로 초기화하자~!!!
		while(n<10)
		{
			n++;
			result *= n;		// 누적 곱 연산
		}
		System.out.println("연산 결과 : "+result);
	}
}


//실행 결과
/*
연산 결과 : 3628800
*/