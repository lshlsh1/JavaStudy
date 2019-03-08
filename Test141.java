/*============================================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Random 클래스
============================================*/

/*
○ java.util.Random 클래스는

	여러 형태의 난수를 발생시켜 제공하는 클래스이다
	Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야 한다
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램을 구현한다.
//로또번호 45개 한줄 6개

// 실행 예)
// 2 39 40 41 42 45
// 1 2 8 16 28 42
// 4 9 10 13 14 28
// 20 24 31 33 37 41
// 5 7 8 11 36 40
// 계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	//배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6개
	
	private int[] num = new int[6];

		// getter(int[] num이 private라서)
		public int[] getNum()
		{
			return num;
		}

		//6개의 난수를 발생시키는 메소드 정리
		public void start()
		{
			int cnt = 0;
			Random rd = new Random();
			int n;


			jump:
			while (cnt<6)	//cnt → 0 1 2 3 4 5
			{
				n = rd.nextInt(45) + 1; // 1 ~ 45
			
				for (int i=0 ; i<cnt ; i++)
				{
					if (num[i] == n)
					{
						continue jump;
					}
				}
				num[cnt++] = n;	
			}

			sorting();
		}

		//정렬 메소드
		public void sorting()
		{
			Arrays.sort(num);
		}
}
	


public class Test141
{
	public static void main(String[] args)
	{	
		/*
		for (int m=0; m<6 ; m++)
		{
			int[] lotto = new int[6];
		
		int i, j;

		for ( i=0 ; i<lotto.length  ; i++ )
		{
			lotto[i] = (int)(Math.random()*45)+1;
			System.out.print(lotto[i]+" ");

			for ( j=0 ; j<lotto.length ; j++)
			{
				if(lotto[i] == lotto[j])
		{
			i--;
			break;
		}

				
				if (lotto[i]>lotto[j])
				{
					lotto[i] = lotto[i]^lotto[j];
					lotto[j] = lotto[j]^lotto[i];
					lotto[i] = lotto[i]^lotto[j];
				}					
			}
		}
							
		
		System.out.println();
		
		}
		*/

		//lotto 클래스 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5개입
		for (int i=1 ; i<=5 ; i++ )
		{
			lotto.start();

			//결과 출력
			for (int n: lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}

