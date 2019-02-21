/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- switch문 실습
===============================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산의 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며
// 연산 결과는 편의상 정수 형태로 처리하도록 한다.

// 실행 예)
// 첫 번째 정수 입력	: 10
// 두 번째 정수 입력	: 28
// 연산자 입력(+ - * /) : +

// >> 10 + 28 = 38
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/* 
		//내 풀이 과정
		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		//오류 : boolean cannot be converted to int switch
		/* 
		switch(op=='+')
		{
			default : System.out.printf("\n >> %d + %d = %d", a,b,a+b);
		}
		switch(op=='-')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a-b);
		}
		switch(op=='*')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a*b);
		}
		switch(op=='/')
		{
			default : System.out.printf("\n >> %d - %d = %d", a,b,a/b);
		}
		*/
		
		/* 연산 및 과정
		switch(op)
		{
			case 43 : System.out.printf("\n >> %d + %d = %d\n", a,b,a+b); break;
			case 45 : System.out.printf("\n >> %d - %d = %d\n", a,b,a-b); break;
			case 42 : System.out.printf("\n >> %d * %d = %d\n", a,b,a*b); break;
			case 47 : System.out.printf("\n >> %d / %d = %d\n", a,b,a/b); break;
		}*/

		// 선생님의 풀이
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+' : result = a+b; break;
			case '-' : result = a-b; break;
			case '*' : result = a*b; break;
			case '/' : result = a/b; break;
			//jdk1.5부터 char형도 상수화시켜 사용하는것이 가능해짐
			default : return;		//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		// ※ 『return』 : ①값의 반환
		//				   ②메소드의 종료

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);

		
	}
}

//실행결과
/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 28
연산자 입력(+ - * /) : *

>> 10 * 28 = 280
*/