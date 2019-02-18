/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 ~ else문 실습
===============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 2의 배수인지, 3의 배수인지
// 2와 3의 배수인지, 2와 3의 배수가 아닌지 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 8
// >> 8 → 2의 배수~!!!
// 계속하려면 아무키나 누르세요

// 임의의 정수 입력 : 9
// >> 9 → 3의 배수~!!!
// 계속하려면 아무키나 누르세요

// 임의의 정수 입력 : 6
// >> 6 → 2와 3의 배수~!!!
// 계속하려면 아무키나 누르세요

// 임의의 정수 입력 : 11
// >> 11 → 2와 3의 배수 아님~!!!
// 계속하려면 아무키나 누르세요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int a;
		
		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		
		if(a%2==0 && a%3==0)
		{
			System.out.printf(">>%d → 2와 3의 배수~!!!\n",a);
		}
		else if(a%2==0)
		{
			System.out.printf(">>%d → 2의 배수~!!!\n",a);
		}
		else if(a%3==0)
		{
			System.out.printf(">>%d → 3의 배수~!!!\n",a);
		}
		else
		{
			 System.out.printf(">>%d → 2와 3의 배수 아님~!!!\n",a);
		}*/

		
		
		// 2의배수, 3의배수 조건식을 먼저 오는 경우에는 2와 3의 배수라는(공통배수) 조건식을 만족하는 데이터가 분기될 수 없다.


		int n;

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		if (n%2==0 && n%3==0)
		{
			System.out.println(">> " + n + " → 2와 3의 배수~!!");
		}
		if (n%2==0)
		{
		}
		if (n%3==0)
		{
		}
		if (n%2!=0 && n%3!=0)
		{
		}
		else
		{
			System.out.println("판독불가")
		}
	}
}