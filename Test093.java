/*==================================
	■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
===================================*/

// 실습 문제
/*
학생 별로 국어점수, 영어점수, 수학점수를 입력받아
총점, 평균을 산출하는 프로그램을 구현한다.
단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
마지막으로, 다음의 요구사항을 충족할 수 있도록 설계한다.
*/

// 프로그램을 구성하는 클래스
/*
1. Record 클래스
- 속성만 존재하는 클래스로 설계할 것

2. Sungjuk 클래스
- 인원 수를 입력받아, 입력받은 인원 수만큼 이름, 국어점수, 영어점수, 수학점수를 입력받고
총점과 평균을 산출하는 클래스로 설계할 것
- 속성: 인원 수, Record 형태의 배열
- 기능: 인원 수 입력, 상세 데이터 입력, 총점/평균 산출, 결과 출력

3. Test093 클래스
- main() 메소드가 존재하는 외부의 다른 클래스로 설계할 것
*/

// 실행 예)
/*
인원 수 입력(1~100) : 102
인원 수 입력(1~100) : 3
1 번째 학생의 이름 입력 : 트럼프
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
2 번째 학생의 이름 입력 : 김정은
국어 점수 : 82
영어 점수 : 72
수학 점수 : 62
3 번째 학생의 이름 입력 : 문재인
국어 점수 : 98
영어 점수 : 88
수학 점수 : 78

트럼프 90 80 70 240 xx.xx 2등
김정은 82 72 62 216 xx.xx 3등
문재인 98 88 78 264 xx.xx 1등
*/

import java.util.Scanner;

class Record
{
		// 학생 1명을 표현할 수 있는 속성들로 구성
		String name;
		int[] score = new int[3]; //int kor,eng,mat;
		int tot;
		double avg;
		int rank;

		/*
		private String name;
		private int[] score = new int[3];
		private int tot;
		private double avg;
		private int rank;
		*/
}

class Sungjuk
{
	Record[] rc = new Record
	int num;
	Scanner sc = new Scanner(System.in);

	void input()
	{

	do
	{
		System.out.print("인원 수 입력(1~100) : ");
		num = sc.nextInt();
	}
	while (num<1 || num>100);

	}

	
	

	for ( int i=0 ; i<num ; i++ )
	{
		
		System.out.printf("%d 번째 학생의 이름 입력 : ", i+1);
		sc.next();
	

	}

	


	}
}

public class Test093
{
	public static void main(String[] args)
	{

		Sungjuk sj = new Sungjuk();
		sj.input();


	}
}