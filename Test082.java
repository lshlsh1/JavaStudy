/*=============================
	■■■ 배열 ■■■
	- 배열의 기본적인 활용
=============================*/

// ○ 실습 문제
// 사용자로부터 인원 수를 입력받고
// 이렇게 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받아
// 입력받은 내용물 전체를 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 곽한일 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 권홍비 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 김경환 010-3333-3333

// -----------------------
// 전체 학생수 : 3명
// -----------------------
// 이름		전화번호
// 곽한일	010-1111-1111
// 권홍비	010-2222-2222
// 김경환	010-3333-3333
// -----------------------
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		/*
		int a=0;
		String[] name = new String[9];
		String[] phone = new String[9];

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			a = sc.nextInt();
	
			for (int i=0; i<a ; i++)
			{
				System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",a);
				name[i]= sc.next();
				phone[i] =sc.next();
			}

			System.out.println("-----------------------");
			System.out.print("전체 학생수 :"+a);
			System.out.println();
			System.out.println("-----------------------");
			System.out.print("이름	전화번호");
			System.out.println();


				
			for (int i=0 ; i<a ; i++)
			{
				System.out.print(name[i]+"  ");
				System.out.print(phone[i]);
				System.out.println();
	
			}
			
			System.out.println();
			System.out.println("-----------------------");
		
			a++;


		}
		while (a<0 || a>11); // <-틀렸다!

		*/

		int memCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10);

		//이름 저장 배열 구성 → 입력받은 인원 수 만큼의 배열방 갯수
		String[] names = new String[memCount];

		//전화번호 저장 배열 구성 → 입력받은 인원 수 만큼의 배열방 갯수
		String[] tels = new String[memCount];

		//반복문을 활용하여 사용자의 입력 데이터를 배열에 담아내기
		for (int n=0 ; n<memCount ; n++) //memCount == names.length == tels.length
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", n+1);
			//곽한얼 010-1111-1111
			names[n] = sc.next();
			tels[n] = sc.next();
		}
		
		// 최종 결과(이름, 전화번호) 출력
			System.out.println("-----------------------");
			System.out.printf("전체 학생수 : %d명\n", memCount);
			System.out.println("-----------------------");
			System.out.print("이름	전화번호");
			System.out.println();
		
		for ( int m=0 ; m<memCount ; m++ )
		{
			System.out.printf("%3s %9s\n", names[m], tels[m]);
		}


	}
}

//실행 결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 일용이 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 이용이 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 삼용이 010-3333-3333
-----------------------
전체 학생수 : 3명
-----------------------
이름    전화번호
일용이 010-1111-1111
이용이 010-2222-2222
삼용이 010-3333-3333
*/