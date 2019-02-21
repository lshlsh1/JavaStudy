/*================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(while)문 실습
==================================================*/

// 1/2 + 2/3 + 3/4 + ... + 9/10

// 실행 예)
// 연산 결과 : xxxxx ← 형태??

public class Test048
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언 및 초기화
		int n=1;
		double sum = 0;

		// ○ 연산 및 처리
		while(n<10)
		{	
			//증감식의 구성 → 최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠
			sum += n/(n+1.0); //= (n*1.0/(n+1)); // (double)n/(n+1);
			//-- 정수 기반의 나눗셈 연산은 몫을 반환하기 때문에
			//	 실수 기반의 연산을 수행할 수 있도록 만들기 위해
			//	 나눗셈 연산자를 중심으로 피연산자 중 하나를
			//	 실수 형태로 만들어주는 것이 중요하다.
			n++;
		}
		
		// ○ 결과 출력
		//System.out.println("연산 결과 : "+sum);
		System.out.printf("연산 결과 : %f\n", sum);


		/*
		// ○ 주요 변수 선언 및 초기화
		int n=0;
		double sum = 0;

		// ○ 연산 및 처리
		while(n<9)
		{
			n++;
			sum += n/(n+1.0);
		}
		
		// ○ 결과 출력
		System.out.printf("연산 결과 : %f\n", sum);
		*/

	}
}

//실행 결과
/*
연산 결과 : 7.071032
*/
