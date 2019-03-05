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
	//변수 선언
	int num;			//학생 수를 담을 변수를 선언한다.
	Record[] rcArray;	// Record 객체를 담을 배열 선언 마치 int[] arr 처럼
	
	@Override			//오버라이딩을 사용하여 SungjukImpl의 abstract을 없애보자
	public void set()	
	{	
		//스캐너 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		do	//인원수를 입력받는다
		{	
			System.out.print("인원 수 입력(1-10) : ");
			num = sc.nextInt();
		}
		while (num<1 || num>10);	//인원수는 1명에서 10명 사이로 제한한다.
		
		rcArray = new Record[num];	//그 인원수를 이용하여 Record배열의 크기를 정하도록 한다
	}

	@Override
	public void input()	
	{	
		// 정보를 입력받기위해 스캐너 인스턴스를 생성한다.
		Scanner sc = new Scanner(System.in);

		for (int i=0 ; i<num ; i++)	//for문을 이용하여 입력받은 인원수만큼 반복한다
		{
			rcArray[i] = new Record();	//배열이 진행되는 동안 record를 기반으로 한 배열에 정보가 입력된다.
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",i+1); //i는 0부터 시작되므로 1을 더해주자
			rcArray[i].hak = sc.next();
			rcArray[i].name =  sc.next();	//학점과 이름을 입력받는다.
	
			System.out.print("국어 영어 수학 점수 입력	  (공백 구분) : ");
			rcArray[i].kor = sc.nextInt();
			rcArray[i].eng = sc.nextInt();
			rcArray[i].mat = sc.nextInt();	//국어 영어 수학점수를 입력받는다.

			rcArray[i].tot = rcArray[i].kor+rcArray[i].eng+rcArray[i].mat;
			// 배열입력값을 모두 더하여 합계값을 계산한다

			rcArray[i].avg = rcArray[i].tot/3;
			// 세과목이므로 3으로 나누어 평균값을 구한다
		}
	}

	@Override
	public void print()
	{	
		int[] score = new int[3];	//성적을 나눌 배열 생성
		char[] grade = new char[3]; //수우미양가 등급을 나눌 배열 생성
									// 한글자이므로 char형을 이용하기로 하자

		for (int i=0; i<num ; i++)
		{	
			//성적 (국어,영어,수학)과 총점, 평균값 출력하기
			System.out.printf("%s %s \t %3d %3d %3d \t%5d %3d\n",rcArray[i].hak, rcArray[i].name,rcArray[i].kor, rcArray[i].eng, rcArray[i].mat,rcArray[i].tot,rcArray[i].avg);
			
			System.out.print("\t\t"); //띄어쓰기 맞추기 위해 공백 생성

			//등급을 판단하기위해 세 과목의 점수를 배열에 넣기
			score[0] = rcArray[i].kor;
			score[1] = rcArray[i].eng;
			score[2] = rcArray[i].mat;
			

			for (int j=0; j<grade.length; j++)
			{
				if (score[j]>89)			
					grade[j] = '수';	// 100~90 수

				else if (score[j]>79)	// 89~80 우
					grade[j] = '우';		

				else if (score[j]>69)	// 78~70 미
					grade[j] = '미';		
				
				else if (score[j]>59)	// 69~60 양
					grade[j] = '양';		
				
				else
					grade[j] = '가';	// 그 이외는 가로 처리	
			}

			// 과목별로 세번 출력하기위해 n을 3미만까지
			for (int n=0; n<3; n++)
			{
				System.out.print(grade[n] + "  "); //등급값 출력
			}System.out.println();
		
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