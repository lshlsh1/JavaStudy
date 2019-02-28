/*===========================
	■■■ 만년달력 ■■■
============================*/

// 실행 예)
// 『연도』를 입력하세요 : 2019
// 『월』을 입력하세요 : 7
/*
	[ 2019년 7월 ]
	
 일 월 화 수 목 금 토
=======================
    1  2  3  4  5  6
 7  8  9 10 11 12 13
14 15 16 17 18 19 20
21 22 23 24 25 26 27
28 29 30 31
=======================
*/
import java.util.Scanner;

public class Test100
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int y, m;
	
		System.out.print("『연도』를 입력하세요 : ");
		y = sc.nextInt();

		System.out.print("『월』을 입력하세요 : ");
		m = sc.nextInt();
		
		
		int[] month = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int nalsu, k, w;

		if ( y%4==0 && y%100!=0 || y%400==0 )
		{
			month[1] = 29;
		}
		else 
		{
			month[1] = 28;
		}

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		for ( k=0 ; k<(m-1) ; k++ )
		{
			nalsu += month[k];
		}
		nalsu += 1;
		
		w= nalsu % 7;


		int[][] arr =new int[5][7];
		/*
		int lastDay = month[m-1];
		int[] arr2 = new int[lastDay];

		for (int i=0; i<lastDay; i++)
		{
			arr2[i] = i+1;
		}
		*/
		
		int n=1;
		//초기화
		for (int i=0 ; i<arr.length ; i++) 
		{
			for (int j=0 ; j<arr[i].length ; j++ ) 
			{

				arr[i][j] = n;
				n++;		
			}
		}
	
		//배열의 배열 요소 전체 출력
		for (int i=0 ; i<arr.length ; i++)
		{
			for (int j=0 ; j<arr[i].length ; j++ )
			{
				System.out.printf("%3d", arr[i][j]-w);
			}System.out.println();
		}
		
		
	}

	
}