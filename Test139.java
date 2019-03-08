/*============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Calendar 클래스
============================================*/

// 실습 문제
//	 오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//	 확인하여 결과를 출력하는 프로그램을 구현한다.
//	 단 Calendar 클래스를 활용하여 처리한다

// 실행 예)
// 오늘 날짜 : 2019-3-6 금요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ========[확인결과]===========
// 200일 후 : 2019-xx-xx x요일
// =============================
// 계속하려면 아무 키나 누르세요...
import java.util.Scanner;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y = cal.get(Calendar.YEAR);
		int m = (cal.get(Calendar.MONTH)+1);
		int d = cal.get(Calendar.DATE);

		System.out.print("오늘 날짜 : "+y+"-"+m+"-"+d+" ");

		String[] w = { "일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		System.out.print (w[cal.get(Calendar.DAY_OF_WEEK)-1]);
		System.out.println();

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		int n = sc.nextInt();
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ( y%4==0 && y%100!=0 || y%400==0 )
		{
			days[1] = 29;
		}
		int nalsu;
		nalsu = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400
		
		for (int i=0; i<(m-1) ; i++)
		{
			nalsu += days[i]
		}
		
		nalsu += d;

		

		
	}
}