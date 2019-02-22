/*=======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 설계 실습
========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
// Scanner 사용가능

// 실행 예)
// 임의의 두 정수 입력 (공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /)	   : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요....

import java.util.Scanner;
import java.io.IOException;

class Nap
{
	int a, b;
	char c;
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력 (공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.print("임의의 연산자 입력 (+ - * /) : ");
		c = (char)System.in.read();
	}
	
	int ifcalculate()
	{
		int result=0;
		
		if(c=='+')
			result = (a+b);
		else if(c=='-')
			result = (a-b);	
		else if(c=='*')
			result = (a*b);
		else if(c=='/')
			result = (a/b);

		return result;
	}

	void print(int d)
	{
		System.out.printf(">> %d %c %d = %d\n", a,c,b,d);
	}
}


public class Test073
{
	public static void main(String[] args)  throws IOException
	{

		Nap ob = new Nap();

		int n;

		ob.input();

		n = ob.ifcalculate();
		
		ob.print(n);
	}
}