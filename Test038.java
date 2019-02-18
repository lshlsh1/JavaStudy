/*=============================================
	■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- if문 ~ else문 실습
===============================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음일 경우만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

import java.io.IOException; //IOException 소환

public class Test038
{
	public static void main(String[] args) throws IOException //IOException 설정
	{
		char a;		//변수설정
		System.out.print("알파벳 한 문자 입력 : "); //메세지 출력
		a = (char)System.in.read();					//(char형으로 형변환하여) System.in.read를 통해 입력받기 


		//연산 및 결과 출력
		if((a>=65 && a<=90) || (a>=97 && a<=122))	//알파벳글자 아스키코드값, 대문자(65~90),소문자(97~122)를 1차 범위
		{
			if(a=='a' || a=='i' || a=='u' || a=='e' || a=='o' )		// 소문자 모음 입력시
			{
				System.out.print(">> 모음 OK~!!!!\n");				// 메세지 출력
			}
			else if(a=='A' || a=='I' || a=='U' || a=='E' || a=='O' )// 대문자 모음 입력시
			{
				System.out.print(">> 모음 OK~!!!!\n");				// 메세지 출력
			}
		}
		else
		{
			System.out.print("입력오류~!!!!\n");					//알파벳 외에 다른 값 입력시에 메세지를 출력한다
		}

	}
}
