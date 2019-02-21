/*================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(while)문 실습
==================================================*/

// ○ 과제
// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 프로그램을 종료해버릴 수 있도록 처리한다

// 실행
// 원하는 단(구구단) 입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//   :
// 7 * 9 = 63
// 계속하려면 아무 키나...

// 원하는 단 (구구단) 입력 : 11
// 1부터 9까지의 정수만 입력 가능합니다.
// 계속하려면 아무 키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args)  throws IOException
	{	
		//BufferedReader 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 변수 생성 및 초기화
		int n, i = 1;

		// 사용자에게 안내메세지 출력 및 입력값 담아내기
		System.out.print("원하는 단 (구구단) 입력 : ");	//구문출력
		n=Integer.parseInt(br.readLine());				//입력
		
		if(n<1 || n>9)	//1~9단이 아니면 오류메세지 출력
		{
			System.out.println("1부터 9까지의 정수만 입력 가능합니다.");	//구문 출력
			
		}
		else	//1~9단이라면 구구단 출력
		{
			// while문 생성
			while( i <= 9)	//i값을 1~9까지 입력한다
			{
				//결과 출력
				System.out.printf("%d x %d = %d\n", n,i,n*i);	//입력된 n값에(1~9)값을 곱한값이 출력될 수 있도록 식 생성
				i++;	//i에 1을 더한다1
			}
		}
	}
}

//실행 결과
/*
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
*/
/*
원하는 단 (구구단) 입력 : 11
1부터 9까지의 정수만 입력 가능합니다.
*/
/*
원하는 단 (구구단) 입력 : 0
1부터 9까지의 정수만 입력 가능합니다.
*/