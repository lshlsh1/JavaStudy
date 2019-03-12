/*=========================================
	■■■ 예외(Exception) 처리 ■■■
==========================================*/
//코드 분석 해보기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{

	private String[] data = new String[3];

	public void proc()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		System.out.print("이름입력[종료:ctrl+z] :");
		
		while ((str=br.readLine()) != null)
		{
			data[n++]=str;
			System.out.print("이름입력[종료:ctrl+z] :");
		}

		System.out.println("입력된 내용...");
		for (String s : data)
		{
			if (s != null)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		Test143 ob = new Test143();
		ob.proc();
		
	}
}

//실행결과
/*
이름입력[종료:ctrl+z] :a
이름입력[종료:ctrl+z] :b
이름입력[종료:ctrl+z] :c
이름입력[종료:ctrl+z] :^Z
입력된 내용...
a
b
c
*/
/*
이름입력[종료:ctrl+z] :a
이름입력[종료:ctrl+z] :b
이름입력[종료:ctrl+z] :c
이름입력[종료:ctrl+z] :d
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test143.proc(Test143.java:25)
        at Test143.main(Test143.java:42)
*/
