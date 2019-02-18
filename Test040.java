/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- switch문 실습
===============================================*/

/*
○ 다중 선택 문이라 하며, switch문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1 : 문장1; [break;]
	   case 상수2 : 문장2; [break;]
			  :
	   [default : 문장n+1;] [break;]
	}
	
	switch문의 『수식』과 case의 『상수』는
	byte, short, int, long 형이어야 한다.

	case 문 뒤에 『break;』이 없는 형태인 경우
	다음 case 문의 문장을 계속해서 수행하게 된다. (기본 모델)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test040
{
	public static void main(String[] args)	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("이름 입력 : ");
		String name = br.readLine();
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		int mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		double avg = tot/3.0;
		char grade = 'F';
		
		switch((int)avg/10)
		{
			case 10 : case 9 : grade ='A'; break;
			case 8 : grade ='B'; break;
			case 7 : grade ='C'; break;
			case 6 : grade ='D'; break;
			default : grade ='F'; break;
		}

		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n",name);
		System.out.printf(">> 국어 점수는 %d,\n",kor);
		System.out.printf(">> 수학 점수는 %d,\n",mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다\n",tot,avg);
		System.out.printf(">> 등급은 %c입니다.\n",grade);
	
	}
}

//실행 결과
/*
이름 입력 : 이승희
국어 점수 : 70
영어 점수 : 80
수학 점수 : 90

>> 당신의 이름은 이승희입니다.
>> 국어 점수는 70,
>> 수학 점수는 90,
>> 총점은 240이고, 평균은 80.00입니다
>> 등급은 B입니다.
*/