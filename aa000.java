import java.util.Scanner;

public class aa000
{

	public static void main(String[] args)
	{
		int y, m, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	

		int sum=0;
		for ( int i=1 ; i<y  ; i++ )
		{
			if ( i%4==0 && i%100!=0 || i%400==0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}

		for ( int i=1 ; i<m ; i++ )
		{
			if (m==2)
				sum += 28;
			else if (m%2==0)
				sum += 30;
			else if (m%2!=0)
				sum += 31;
		}

		for ( int i=1 ; i<=d ; i++)
		{
			sum += i;
		} 

		int dday = sum%7;


		
		String[] daynames = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		

		System.out.println(dday);
	}

}
		
		
	