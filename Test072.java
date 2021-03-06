/*=======================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스 설계 실습
========================================*/

// ○ 실습 문제
// 사용자로부터 임의의 정수를 입력받아
// 1부터 입력받은 수 까지의 합을 연산한여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한 입력 처리 과정에서 BufferedReader의 readLine() 을 사용하여
// 입력 데이터가 1보다 작거나 1000보다 큰 겨우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다

// 실행 예)
// 임의의 정수 입력 (1~1000) : 1002
// 임의의 정수 입력 (1~1000) : -20
// 임의의 정수 입력 (1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Sum ob = new Sum();
		
		int sumsum;

		ob.input();
		
		sumsum = ob.sum();

		ob.print(sumsum);
	}
}

class Sum
{
	int n;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{	
			System.out.print("임의의 정수 입력 (1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>1000);		
	}

	int sum()
	{
		int m=0;
		int i;

		for(i=1; i<=n; i++)
		{
			m += i;
		}
		return m;	
	}

	void print(int a)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n",n,a);
	}
}