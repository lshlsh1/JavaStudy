/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 ~ else문 실습
===============================================*/

// ○ 과제(2019-02-18)
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지 평년인지 판별하여
// 결과를 출력하는 프로그램을 구현한다.
// 단, if ~ else 조건문을 활용할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000 → 윤년
// 계속하려면 아무키나

// 임의의 연도 입력 : 2012
// 2012 → 윤년
// 계속하려면 아무키나

// 임의의 연도 입력 : 2018
// 2018 → 평년
// 계속하려면 아무키나

// 임의의 연도 입력 : 2019
// 2019 → 평년
// 계속하려면 아무키나

// ※ 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나
// 400의 배수이면 윤년~!!!
// 그렇지 않으면 평년~!!!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{	
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주요 변수 선언
		int n;		 //-- 사용자로부터 입력받은 임의의 정수(데이터)를 담을 변수

		System.out.print("임의의 연도 입력 : ");	//입력 구문을 프린트한다
		n = Integer.parseInt(br.readLine());		//임의의 연도 입력받는다


		////윤년 ↓ : 연도가 4의 배수이며, 100의 배수는 윤년이 아니고 400의 배수는 윤년

		if(n%4==0 && n%100!=0 || n%400==0)
		{	
			System.out.printf(n + " → 윤년\n"); // 윤년을 입력 받았을 때 프린트한다
		}
		else
		{
			System.out.printf(n + " → 평년\n"); // 평년을 입력 받았을 때 프린트한다
		
		}
		
	}
}