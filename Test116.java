/*================================
	■■■ 클래스 고급 ■■■ 
	- 인터페이스(Interface)
=================================*/

// ○ 실습 문제
//	  성적 처리 프로그램을 구현한다.
//	  단 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1-10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 1921004 이원영
// 국어 영어 수학 점수 입력	  (공백 구분) : 99 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 1921005 이재준
// 국어 영어 수학 점수 입력	  (공백 구분) : 85 70 65

// 1921004 이원영	90 100  85		275		91
//					수  수  우
// 1921005 이재준	85	70	65		220		73
//					우	미	양

// 계속하려면 아무 키나 누르세요...

// 속성만 존재하는 클래스 → 자료형 활용
import java.util.Scanner;

class Record	
{
	String hak, name;	//-- 학번, 이름
	int kor, eng, mat;	//-- 국어, 영어, 수학 점수
	int tot, avg;		//-- 총점, 평균(편의상 정수 처리)
}

//인터페이스

interface Sungjuk
{
	public void set();
	public void input();
	public void print();
}

// 문제 해결 과정에서 설계해야 할 클래스

class SungjukImpl		implements Sungjuk
{
	int num;
	Record[] rcArray;	// Record 객체를 담을 배열 선언 마치 int[] arr 처럼
	
	public void set()
	{	
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.print("인원 수 입력(1-10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);
		
		rcArray = new Record[num];
	}

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		for (int i=0 ; i<num ; i++)
		{
			rcArray[i] = new Record();	
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",i+1);
			rcArray[i].hak = sc.next();
			rcArray[i].name =  sc.next();
	
			System.out.print("국어 영어 수학 점수 입력	  (공백 구분) : ");
			rcArray[i].kor = sc.nextInt();
			rcArray[i].eng = sc.nextInt();
			rcArray[i].mat = sc.nextInt();

			rcArray[i].tot = rcArray[i].kor+rcArray[i].eng+rcArray[i].mat;

			rcArray[i].avg = rcArray[i].tot/3;
		}
	}

	public void print()
	{
		for (int i=0; i<num ; i++)
		{
			System.out.printf("%s %s %3d %3d %3d %5d %3d\n",rcArray[i].hak, rcArray[i].name,rcArray[i].kor, rcArray[i].eng, rcArray[i].mat,rcArray[i].tot,rcArray[i].avg);
			

		}



	}

}

public class Test116
{
	public static void main(String[] args)
	{
		
		Sungjuk ob = new SungjukImpl();
		//문제 해결 과정에서 작성해야 할 ob 구성
		

		ob.set();
		ob.input();
		ob.print();
	}
}