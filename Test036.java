/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 ~ else문 실습
===============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 작성한다.

// 실행 예)
// 첫 번째 정수 입력 : 4
// 두 번째 정수 입력 : 8
// 세 번째 정수 입력 : 73

// >> 정렬 결과 : 4 8 73
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b, c;		//-- 사용자가 입력하는 임의의 정수를 담을 변수
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		/*
		if(a<=b && b<=c)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,b,c);
		}
		else if(a<=c && c<=b)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,c,b);
		}
		else if(b<=a && a<=c)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",b,a,c);
		}
		else if(b<=c && c<=a)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",b,c,a);
		}
		else if(c<=a && a<=b)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",c,a,b);
		}
		else if(c<=b && b<=a)
		{
			System.out.printf("\n>> 정렬 결과 : %d %d %d\n",c,b,a);
		}
		else
		{
			System.out.println("판독 불가");
			*/

		int a, b, c;		//-- 사용자가 입력하는 임의의 정수를 담을 변수
		int temp;			//-- 임시 저장 변수(빈 컵)
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// 2 2 2 | 3 2 1 | 2 1 3 | 3 1 2 | 1 3 2 | 1 2 3
		//		 | 2 3 1 | 1 2 3 | 1 3 2 | 1 2 3
		//		 | 2 1 3 |		 | 1 2 3 |
		//		 | 1 2 3 |

		if(a>b)		// ① 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			// 두 정수의 자리를 바꾼다.
			temp = a;
			a = b;
			b = temp;
		}
		if(a<b)		// ② 두 번째 정수가 세 번째 정수보다 크다면...
		{
			// 두 정수의 자리를 바꾼다.
			temp = b;
			b = c;
			c = temp;
		}
		if(a>b)		// ③ 첫 번째 정수가 두 번째 정수보다 크다면...
		{
			// 두 정수의 자리를 바꾼다.
			temp = a;
			a = b;
			b = temp;
		}//else if 사용하면 안됨
				
		
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,b,c);	
	
	}
}

//실행 결과
/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
세 번째 정수 입력 : 5

>> 정렬 결과 : 5 10 20

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 10
세 번째 정수 입력 : 50

>> 정렬 결과 : 10 10 50
*/