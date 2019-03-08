/*
Calendar 클래스는 날짜정보를 처리할 때 사용하기 편리하다.
Calendar 객체를 생성할 때는 getInstance() 메소드를 사용해야 한다. 
get() 메소드 : 오늘의 년, 월, 일 정보를 얻거나 또는 현재의 시, 분, 초 정보를 얻을 수 있다.
set() 메소드 : 지금 사용중인 객체의 날짜를 지정할 수 있다.


다음 프로그램은 현재 날짜와 시간정보를 얻어서 출력하고, 오늘이 포함된 달의 달력을 출력한다.
*/

import java.util.Calendar;

public class CalendarExplain 
{
    public static void main(String[] args) 
    {

        Calendar cal = Calendar.getInstance();   // Calendar 객체 생성
        
        System.out.println("올해는 " + cal.get(Calendar.YEAR));   // 년 정보 얻기
        System.out.println("이달은 " + (cal.get(Calendar.MONTH) + 1));   // 달 정보 얻기(0 ~ 11)
        System.out.println("오늘은 " + cal.get(Calendar.DATE));  // 일 정보 얻기
        System.out.println("지금 시간은 " + cal.get(Calendar.HOUR));  // 시 정보 얻기
        System.out.println("지금 분은 " + cal.get(Calendar.MINUTE));  // 분 정보 얻기
        System.out.println("지금 초는 " + cal.get(Calendar.SECOND));  // 초 정보 얻기
        if (cal.get(Calendar.AM_PM) == 0)   // 오전, 오후 정보 얻기(0 또는 1)
            System.out.println("지금은 AM");
        else
            System.out.println("지금은 PM");
        System.out.println("\n\n");
        
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        prt_cal(year, month);    // 해당 달 출력 메소드
    }
    
    // 매개변수로 주어진 년과 달에 해당하는 달력 출력 메소드
    static void prt_cal(int year, int month) {
        Calendar cal = Calendar.getInstance();

 
        cal.set(year, month, 1);   // 해당 달의 1일로 설정
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);   // 해당 달의 1일의 요일정보 얻기



        System.out.println("  ======= " + year + "년 " + (month+1) + "월 ======");
        System.out.println(" SUN MON TUE WED TUR FRI SAT");
        for(int i = 1; i <dayofweek; i++)
            System.out.print("    ");    //  1일 의 요일 이전까지는 빈칸 출력
        
        int days = cal.getActualMaximum(Calendar.DATE);   // 해당 달의 날 수 얻기
        for(int i = 1; i <= days; i++) {
            System.out.print(String.format("%4d", i));   // 4자리로 정수 출력
            if ((dayofweek + i - 1) % 7 == 0)   //  토요일까지 출력 후 줄 바꿈
                System.out.println("");
        }
        System.out.println("\n\n");
    }
}


//실행결과
/*
올해는 2019
이달은 3
오늘은 8
지금 시간은 10
지금 분은 27
지금 초는 10
지금은 AM



  ======= 2019년 3월 ======
 SUN MON TUE WED TUR FRI SAT
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
	*/