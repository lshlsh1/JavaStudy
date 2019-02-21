/*==========================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(for)문 실습
	- 별찍기 실습
============================================================*/

// ○ 과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구분을 작성하여 프로그램을 구현한다.
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


*/

public class Test063
{
	public static void main(String[] args)
	{
		int n, m;

		for(n=0 ; n<5 ; n++)				//줄(5줄)

		{	
			//빈칸이 앞에 먼저 나와야하기때문에 빈칸이 먼저등장
			/*방법1
			for(m=5 ; m>0 ; m--)
				if(n<m)
				*/
			for(m=1 ; m<=5-n ; m++)			//빈칸이 
				System.out.print(" ");		//빈칸 출력
				/*
			1(n) -> 4
			2(n) -> 3
			3(n) -> 2
			4(n) -> 1
			5(n) -> 0
			=>
			ex) 마지막 예인 n이 5일때 m이 0이 나오는 값을 넣어보고 미지수 x를 구한다
			5 + x = 0
			=> x = - 5
			n - 5 = m
			*/
			
			for(m=1 ; m<=(2*n)+1 ; m++)		//n이 홀수개로 늘어감(2n+1)
				System.out.print("*");		//별칸 출력
			/*
			1줄 -> 1개
			2줄 -> 3개
			3줄 -> 5개
			4줄 -> 7개
			5줄 -> 9개
			*/
			System.out.println();

		}
		
		for(n=0 ; n<4 ; n++)	
		{
			
			for ( m=0 ; m < n+2 ; m++)
			{
				System.out.print(" ");	//빈칸 출력
			}
			/*
			//1줄(n=1) -> 빈칸 1번 // 
			//2줄(n=2) -> 빈칸 2번 // 
			//3줄(n=3) -> 빈칸 3번 // 
			//4줄(n=4) -> 빈칸 4번 // 
			*/
		
			for(m=7 ; m >= n*2+1 ; m--)	 
			{
				System.out.print("*");	//별칸 출력
			}
			/*
			1줄 -> 7개 (7 >= 0*2 + 1) // 1 -> 별칸 7번 반복
			2줄 -> 5개 (7 >= 1*2 + 1) // 3 -> 별칸 5번 반복
			3줄 -> 3개 (7 >= 2*2 + 1) // 5 -> 별칸 3번 반복
			4줄 -> 1개 (7 >= 3*2 + 1) // 7 -> 별칸 1번 반복
			*/

			System.out.println();
		}
		 
	}
}

//실행 결과
/*

*/