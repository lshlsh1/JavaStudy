/*================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(while)문 실습
==================================================*/

// ○ 과제
// 사용자로부터 임의의 정수를 입력받아
// 1로부터 그 수까지의 전체 합, 짝수 합, 홀수 합을 
// 결과 값으로 출력하는 프로그램을 구현한다.
//
// 실행 예)
// 임의의 정수 입력 : 276
// >> 1 ~ 276 까지 정수의 합 : xxxx
// >> 1 ~ 276 까지 짝수의 합 : xxxx
// >> 1 ~ 276 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{	
		//BufferedReader 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 생성 및 초기화
		int a=0, b=1, tot =0, even=0, odd=0;
		
		// 사용자에게 안내메세지 출력 및 입력값 담아내기
		System.out.print("임의의 정수 입력 : ");	//구문출력
		a=Integer.parseInt(br.readLine());			//입력

		
		while(b<=a)	// 1부터 입력받은 a까지 while 연산
		{
			tot += b;	//정수의 합

			if(b%2==0)	//짝수인경우
				even += b;//짝수의합
			else		//홀수인경우
				odd += b;//홀수의합

			b++;//1증가
		}

		//결과 출력
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n", a, tot);	//정수의 합 출력
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n", a, even);	//짝수의 합 출력
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n", a, odd);	//홀수의 합 출력

	}
}

//실행 결과
/*
임의의 정수 입력 : 100
>> 1 ~ 100 까지 정수의 합 : 5050
>> 1 ~ 100 까지 짝수의 합 : 2550
>> 1 ~ 100 까지 홀수의 합 : 2500
*/

