/*=========================================
	■■■ 자바의 기본 입출력(I/O) ■■■ 
=========================================*/

// Reader 실습
// Test166과 비교할것

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test168
{
	public static void main(String[] args)	throws IOException
	{
		int data;
		char ch;

		// System.in		 : 자바의 표준 입력 스트림 → 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
		//					 : (변환기, 번역기 역할 수행)
		// Reader			 : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader( System.in );
		//new InputStreamReader(System.in);

		//Test166을 Ctrl + V
		System.out.println("문자열 입력(종료:Ctrl+z)");
		
		//while ( ( data = System.in.read() ) != -1 )	//바이트 기반
		while ( ( data = rd.read() ) != -1 )			//문자 기반
		{
			ch = (char)data;

			//print() : 문자 스트림
			//System.out.print(ch);	//-- 한글 깨졌는데 이제 안깨짐
			//--==>>
			/*
			문자열 입력(종료:Ctrl+z)
			abcd
			abcd
			1234
			1234
			가나다라
			가나다라
			*/

			//write : OutputStream 클래스의 대표적 메소드 (→ 바이트 메소드)
			System.out.write(ch);	//--안깨졌는데 깨짐
			//--==>>
			/*
			1234
			1234
			abcd
			abcd
			가나다라
			 섆|
			*/

	}}
}