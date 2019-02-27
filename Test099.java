/*========================
	■■■ 배열 ■■■
	- 배열의 복사
=========================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예)
// 2 3 7 10 11 6 14
// 게속하려면 아무 키나 누르세요....

class Cl
{
	int num;
	int[] a = {2, 3, 7, 10, 11, 15};;
	int[] b = {3, 6, 10, 14};

	void cal
	{
		for ( int i=0 ; i<a.length ; i++ )
		{
			for ( int j=0 ; j<b.length ; j++ )
			{
				if (a[i]==b[j])
				{
					a[i] =b[j]
				}
			}
			
		}
		
	}

	void print()
	{
		
	}

	



	
}

public class Test099
{
	public static void main(String[] args)
	{
		Cl ob = new Cl();

		ob.input1();
	}
}