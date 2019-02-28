/*========================================
	■■■ 클래스와 인스턴스 ■■■
========================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx //(정수)

// >> 반지름이 xxx인 원의
// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CircleTest
{
	/*
	int a;	// 전역 변수
			
	void intput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		a = Integer.parseInt(br.readLine());
	}

	double area()
	{
		//반지름 * 반지름 * 3.141592
		double aRea;
		aRea = a * a * 3.141592;
		return aRea;
	}
	
	double length()
	{
		// 원의 둘레 = 반지름 * 2 * 3.141592
		return a * 2 * 3.141592;
	}
		void print(double s, double t)
		{
			System.out.printf("\n>>반지름이 %d인 원의\n",a);
			System.out.println(">> 넓이 : "+s);
			System.out.println(">> 둘레 : "+t);
		}
	*/

	
	//선생님 풀이
	
	int r;
	final double PI = 3.141592; //final 추가하여 상수화
	
	void input() throws IOException	//수류탄 문밖으로 던지기
	{	
		//클래스 구문 바로 밑에 BufferedReader위치 시킬 수 있으나 바람직하지 않다.
		//사용하지 않는 상황에서도 메모리를 소비하게되기때문
		//기능이나 행위가 필요한 메소드 영역 안에서 정의하도록 하자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	double calArea()
	{
		double result;
		result = r * r * PI;
		return result;
	}

	double calLength()
	{
		double result;
		result = r * 2 * PI;
		return result;
	}

	void print(double a, double l)
	{
		System.out.printf("\n>> 반지름이 %d인 원의 \n", r);
		System.out.printf(">> 넓이 : %.2f\n",a);
		System.out.printf(">> 둘레 : %.2f\n",l);
	}

}