/*================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(while)문 실습
==================================================*/

// 1부터 100까지 정수의 합 : 5050
// 1부터 100까지 짝수의 합 : 2550
// 1부터 100까지 홀수의 합 : 2500
// 계속하려면 아무 키나 누르세요...

public class Test046
{
	public static void main(String[] args)
	{
		/*
		int a = 1, sum1=0, sum2=0, sum3=0;

		while(a<=100)
		{
			if(a%2==0)
			{
				sum1 += a;
			}
			else if(a%2!=0)
			{
				sum2 += a;
			}

			sum3 += a;

			a++;
		}

		//sum3 = sum1 + sum2

		System.out.println("1부터 100까지 정수의 합 : "+sum3);
		System.out.println("1부터 100까지 짝수의 합 : "+sum1);
		System.out.println("1부터 100까지 홀수의 합 : "+sum2);
		*/
		
		//선생님 풀이
		// ○ 주요 변수 선언
		//int n =1, sum=0, even=0, add=0;
		int n =1, sum, even, odd;
		sum=even=odd=0;

		// ○ 연산 및 처리(반복문 구성)
		while (n<=100)
		{
			sum += n;
			
			if(n%2==0)
				even += n;
			else
				odd += n;

			n++;
		}

		// ○ 결과 출력
		
		System.out.println("1부터 100까지 정수의 합 : "+sum);
		System.out.println("1부터 100까지 짝수의 합 : "+even);
		System.out.println("1부터 100까지 홀수의 합 : "+odd);

	}
}

//실행 결과
/*
1부터 100까지 정수의 합 : 5050
1부터 100까지 짝수의 합 : 2550
1부터 100까지 홀수의 합 : 2500
*/