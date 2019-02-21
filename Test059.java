/*==========================================================
	■■■ 실행 흐름의 컨트롤 ( 제어문 ) ■■■
	- 반복문(for)문 실습
	- 다중 for문 ( 반복문의 중첩 )을 활용한 구구단 출력 실습
============================================================*/

/*
2 * 1 = 2   3 * 1 = 3    4 * 1 = 4   5 * 1 = 5
2 * 2 = 4   3 * 2 = 6    4 * 2 = 8   5 * 2 = 10
2 * 3 = 6   3 * 3 = 9    4 * 3 = 12  5 * 3 = 15
2 * 4 = 8   3 * 4 = 12   4 * 4 = 16  5 * 4 = 20
	:			:			:			:
2 * 9 = 18  3 * 9 = 27   4 * 9 = 36  5 * 9 = 45

6 * 1 = 6   7 * 1 = 7    8 * 1 = 8   9 * 1 = 8
6 * 2 = 12  7 * 2 = 14   8 * 2 = 16  9 * 2 = 18
6 * 3 = 18  7 * 3 = 21   8 * 3 = 24  9 * 3 = 27
6 * 4 = 24  7 * 4 = 28   8 * 4 = 32  9 * 4 = 36
	:			:		 	:			:
6 * 9 = 54  7 * 9 = 63   8 * 9 = 68  9 * 9 = 81
*/
// 1. 반복문 두번중첩을 두번하여 해결
// 2. 반복문 세번 중첩하여 해결

public class Test059
{
	public static void main(String[] args)
	{
		//두번 중첩
		/*
		int n, i, j;
		
		for ( i=1 ; i<=9 ; i++ )
		{
				for ( n=2 ; n<=5 ; n++ )
			{
				System.out.printf("%d * %d = %2d\t",n,i,n*i);
			}
			
			System.out.println();
		}

			System.out.println();
			
				for ( i=1 ; i<=9 ; i++ )
		{	
				for ( n=6 ; n<=9 ; n++ )
			{
				System.out.printf("%d * %d = %2d\t",n,i,n*i);
			}
			
			System.out.println();
		}
		*/
		
		//세번 중첩
		/*
		int n, i, j;
		
		for ( j=2 ; j<=6 ; j+=4 )
		{
			for ( i=1 ; i<=9 ; i++ )
			{
				for ( n=j ; n<=j+3 ; n++ )
				{
					System.out.printf("%d * %d = %2d\t", n, i, n*i);				
				}
				System.out.println();
			}
			System.out.println();
		}
		*/

		// <선생님 풀이>
		
		int i, j, k;	// 루프 변수
		int g;			// 각 곱셈 연산에 대한 결과값을 담을 변수
		int dan;		// 구구단의 '단'을 처리하는 변수


		 /*중간과정
				for ( i=0 ; i<2 ; i++) // 문단구성 
		{
			for ( j=1 ; j<=9 ; j++)		//-- 곱해지는 수 구성(1~9)
			{
				for ( k=2 ; k<=9 ; k++)	//-- 단 구성 (2~9)
				{
					g = j * k;
					System.out.printf("%4d * %d = %2d", k, j, g);
				}			
				System.out.println();
			}
			System.out.println();
		}
		 */
		for ( i=0 ; i<2 ; i++) // 문단구성 //1문과 2문의 차이는 i가 달라짐
		{
			for ( j=1 ; j<=9 ; j++)		//-- 곱해지는 수 구성(1~9)
			{
				for ( k=2 ; k<=5 ; k++)	//-- ①단 구성(2~5)
				{
					dan = i * 4 + k;	//-- ②i가 0일 경우... 2,3,4,5 / i 가 1일 경우... 6,7,8,9
					g = dan * k;
					System.out.printf("%4d * %d = %2d", dan, j, g);
				}			
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
//실행 결과
/*
   2 * 1 =  2   3 * 1 =  3   4 * 1 =  4   5 * 1 =  5
   2 * 2 =  4   3 * 2 =  6   4 * 2 =  8   5 * 2 = 10
   2 * 3 =  6   3 * 3 =  9   4 * 3 = 12   5 * 3 = 15
   2 * 4 =  8   3 * 4 = 12   4 * 4 = 16   5 * 4 = 20
   2 * 5 = 10   3 * 5 = 15   4 * 5 = 20   5 * 5 = 25
   2 * 6 = 12   3 * 6 = 18   4 * 6 = 24   5 * 6 = 30
   2 * 7 = 14   3 * 7 = 21   4 * 7 = 28   5 * 7 = 35
   2 * 8 = 16   3 * 8 = 24   4 * 8 = 32   5 * 8 = 40
   2 * 9 = 18   3 * 9 = 27   4 * 9 = 36   5 * 9 = 45

   6 * 1 =  2   7 * 1 =  3   8 * 1 =  4   9 * 1 =  5
   6 * 2 =  4   7 * 2 =  6   8 * 2 =  8   9 * 2 = 10
   6 * 3 =  6   7 * 3 =  9   8 * 3 = 12   9 * 3 = 15
   6 * 4 =  8   7 * 4 = 12   8 * 4 = 16   9 * 4 = 20
   6 * 5 = 10   7 * 5 = 15   8 * 5 = 20   9 * 5 = 25
   6 * 6 = 12   7 * 6 = 18   8 * 6 = 24   9 * 6 = 30
   6 * 7 = 14   7 * 7 = 21   8 * 7 = 28   9 * 7 = 35
   6 * 8 = 16   7 * 8 = 24   8 * 8 = 32   9 * 8 = 40
   6 * 9 = 18   7 * 9 = 27   8 * 9 = 36   9 * 9 = 45
*/