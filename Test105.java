/*=====================================
	■■■ 정렬(Sort) 알고리즘 ■■■
=======================================*/

// ○ 실습 문제
//	  사용자로부터 여러 학생의 성적 정보를 정수 형태로 입력받아
//	  점수가 높은 순으로 등수를 부여하여 결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1) : 나주영 90
// 이름 점수 입력(2) : 남상현 80
// 이름 점수 입력(3) : 유진석 85
// 이름 점수 입력(4) : 윤희진 75
// 이름 점수 입력(5) : 이기승 95

//====================
// 1등 이기승 95
// 2등 나주영 90
// 3등 유진석 85
// 4등 남상현 80
// 5등 윤희진 75
//====================

import java.util.Scanner;

public class Test105
{
	public static void main(String[] args)
	{
		//입력
		Scanner sc =new Scanner(System.in);
		int num;
		System.out.print("인원 수 입력 : ");
		num = sc.nextInt();
		
		
		//스트링생성
		String[] name = new String[num];
		int[] score = new int[num];


		int n=0;
		do
		{
			
			System.out.printf("이름 점수 입력(%d) : ", n+1);
			name[n] = sc.next();
			score[n] = sc.nextInt();
			n++;
		}
		while (n<num);

		//pass값과 flag를 생성한다.
		int pass=0;
		boolean flag;

		String[] tmp = new String[num];
		
		/*Bubble Sort
		for (int i=1 ; i<score.length ; i++ )
		{
			for (int j=0 ; j<score.length-i ; j++ )
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					tmp[j] = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp[j];
				}
			}
		}*/

		//향상된 Bubble Sort
		do
		{
			flag=false;
			pass++;
			for (int j=0 ; j<score.length-pass ; j++ )
			{
				if (score[j]<score[j+1])
				{
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];

					tmp[j] = name[j];
					name[j] = name[j+1];
					name[j+1] = tmp[j];

					flag=true;
				}
			}
		}
		while (false);

		int[] rank = new int[num];
		int k=1;
	

		System.out.println("====================");
		
		for (int m=0 ; m<num ; m++)
		{
			
			rank[m] += k;
			System.out.printf("%3d등 %5s %3d",rank[m],name[m],score[m]);
			System.out.println();
			k++;
		}

		System.out.println("====================");
	
	}
}