import java.util.Scanner;



class WeekDay
{
	// 주요 변수 선언(속성 구성)
	private int y, m, d;	//-- 사용자가 입력한 년, 월, 일을 담을 변수
		
	// 메소드 정의(입력받기)
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();

	}

	// 메소드 정의(요일 산출하기)
	//void week()
	String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 요일명에 대한 배열 구성
		String[] weekNames = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};


		// 날수를 종합할 변수, 루프 변수, 요일 변수
		int nalsu, i, w;

		// 윤년에 따른 2월의 날 수 계산

		// 윤년이라면... 2월의 마지막 날짜를 29일로 설정 → months[1] = 29
		// 평년이라면... 2월의 마지막 날짜를 28일로 설정 → months[1] = 28

		if (y%4==0 && y%100!=0 || y%400==0)	// 윤년이라면 
		{
			//2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}
		else //평년이라면
		{
			//2월의 마지막 날짜를 28일로 설정
			months[1] = 28;
		}

		// ① 1년 1월 1일부터 입력받은 년도의 이전 년도 12월 31일 까지의 날 수 계산
		
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		//테스트
		//System.out.println(nalsu);	//--==>> 737059 (1.1.1~2018.12.31의 날 수)
		

		// ② 입력받은 월의 이전 월 까지의 날 수 계산 후 
		//	  1번 결과에 더하는 연산
		for ( i=0 ; i<(m-1) ; i++ )
			nalsu += months[i];

		//테스트
		//System.out.println(nalsu);	//--==>> 737240 (1.1.1~2019.6.30의 날 수)

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//	  2번 결과에 더하는 연산
		nalsu += d;						//--==>> 737258 (1.1.1~2019.7.18의 날 수)



		//-------------------------------------------------여기까지 날 수 연산 끝~!!!



		
		// 무슨 요일인지 확인하기 위한 연산
		w = nalsu % 7;	// 전체 날 수%7 == 0 → 일요일 , 1 → 월요일, ... , 7 → 토요일
		
		//테스트
		//System.out.println(w);	//--==>> 4 목요일

		return weekNames[w];
	}
	
	// 메소드 정의(결과 출력하기)
	void print(String day)
	{
		System.out.printf("\n>> %d년 %d월 %d일 → %s\n",y,m,d,day);
	}

}



public class Test091_A
{
	public static void main(String[] args)
	{
		WeekDay wd = new WeekDay();

		wd.input();						//-- 입력 메소드 호출
	
		//wd.week();

		String result = wd. week();		//-- 요일 산출 메소드 호출

		wd.print(result);				//-- 결과 출력 메소드 호출
		
	
	}
}


//실행 결과
/*
년 월 일 입력(공백구분) : 2019 7 18

>> 2019년 7월 18일 → 목요일
*/
