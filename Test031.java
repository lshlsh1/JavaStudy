/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 실습
===============================================*/

// ○ 실습 문제
// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름 입력 : 김경환
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 김경환입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요...

// ※ 등급은 평균 점수를 기준으로 처리한다.

// 80<= avg < 90 (x) → avg >= 80 논리연산자 avg < 90 → [avg >= 80 && avg < 90]

// 90점 ~ 100점 : A		80점 ~ 89점 : B
// 70점 ~ 79점 : C		60점 ~ 69점 : D
// 60점 미만   : F

// 단, BufferedReader 의 readLine() 메소드를 통해 입력받을 수 있도록 하며
// printf() 메소드를 통해 출력할 수 있도록 한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		/*
		String name;
		int kor, eng, mat, sum, avg;
		char grade;

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		
		sum=kor+eng+mat;
		avg = sum/3;

		if(avg>=90){
			grade = 'A';}
		else if(avg>=80){
			grade = 'B';}
		else if (avg>=70){
			grade = 'C';}
		else if(avg>=60){
			grade = 'D';}
		else{
			grade = 'F';}

		System.out.printf("당신의 이름은 %s입니다.\n",name);
		System.out.printf("국어 점수는 %d,\n",kor);
		System.out.printf("수학 점수는 %d,\n",mat);
		System.out.printf("총점은 %d이고, 평균은 %d입니다\n",sum,avg);
		System.out.printf("등급은 %c입니다.\n",grade);
		*/

		String name;
		int kor, eng, mat;
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		
		// 총점 산출
		int tot = kor + eng + mat;

		// 평균 산출
		double avg = tot/3.0;

		// 등급 산출
		char grade = 'F';

		if (avg >= 90)
		{
			grade = 'A';
		}
		else if (avg >= 80)
		{
			grade = 'B';
		}
		else if (avg >= 70)
		{
			grade = 'C';
		}
		else if (avg >= 60)
		{
			grade = 'D';
		}
		/*
		else 
		{
			grade = 'F';
		}
		*/
		
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n",name);
		System.out.printf(">> 국어 점수는 %d,\n",kor);
		System.out.printf(">> 수학 점수는 %d,\n",mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다\n",tot,avg);
		System.out.printf(">> 등급은 %c입니다.\n",grade);



		
		
	}
}