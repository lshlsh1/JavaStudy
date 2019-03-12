/*=========================================
	■■■ 예외(Exception) 처리 ■■■
==========================================*/
//143과 비교하여 보기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{
	private String[] data = new String[3];

	public void proc()	//throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n =0;

		try
		{
			System.out.print("이름 입력[종료:Ctrl+z] : ");
			
			while ((str=br.readLine()) != null)
			{
				data[n++] =str;
				System.out.print("이름 입력[종료:Ctrl+z] : ");
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!!");
			System.out.println("getMessage : "+e.getMessage());
			System.out.println("toString : "+e.toString());
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println(e.toString()); //Exception toString 예외에 대한 상태내용 문자열로 반환
		}

		System.out.println("입력된 내용...");
		for (String s:data)
		{
			System.out.println(s);
		}
		System.out.println();		
	}
	public static void main(String[] args) //throws IOException try catch를 이용하면 예외를 밖으로 던지는 것이 아니기때문에 불필요
	{
		Test144 ob = new Test144();
		ob.proc();
	}
}

//실행결과
/* <ArrayIndexOutOfBoundsException e>
이름 입력[종료:Ctrl+z] : a
이름 입력[종료:Ctrl+z] : b
이름 입력[종료:Ctrl+z] : c
이름 입력[종료:Ctrl+z] : d
예외 발생~!!!!
getMessage : 3
toString : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace...
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test144.proc(Test144.java:26)
        at Test144.main(Test144.java:53)
입력된 내용...
a
b
c

*/
/* <IOException e>
이름 입력[종료:Ctrl+z] : a
이름 입력[종료:Ctrl+z] : b
이름 입력[종료:Ctrl+z] : c
이름 입력[종료:Ctrl+z] : ^Z
입력된 내용...
a
b
c

*/

