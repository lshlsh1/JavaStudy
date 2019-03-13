/*========================================
	■■■ 컬렉션 (Collection) ■■■
	- Vector
========================================*/

// ○ 실습 문제
// 현재 작성중인 Test158 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)
	
	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 

	1번째 요소 입력 : 곽한얼
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : y
	
	2번째 요소 입력 : 권홍비
	2번쨰 요소 입력 성공~!!!!
	요소 입력 계속(Y/N)? : n

	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 2

	[벡터 전체 출력]
		곽한얼
		권홍비
	벡터 전체 출력 완료~!!!!

	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 3

	검색할 요소 입력 : 곽한얼

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 4
	
	삭제할 요소 입력 : 김경환
	
	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 5
	
	변경할 대상 입력 : 권홍비
	수정할 내용 입력 : 김선아

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1.요소 추가
	2.요소 출력
	3.요소 검색
	4.요소 삭제
	5.요소 변경
	6.종료
	>> 메뉴 선택(1-6) : 6

	프로그램 종료
	계속하시려면 아무 키나....
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Vector;
import java.io.InputStreamReader;

class Menus
{	
	public static final int E_ADD=1;		//요소 추가
	public static final int E_DISP=2;		//요소 출력
	public static final int E_FIND=3;		//요소 검색
	public static final int E_DEL=4;		//요소 삭제
	public static final int E_CHA=5;		//요소 변경
	public static final int E_EXIT=6;		//종료
}

public class Test158	extends Menus
{	
	// 주요 속성 구성 -- 완성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- 선택 값
	private static String con;				//-- 계속 여부
	
	//static 초기화 블럭 -- 완성
	static 
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		//BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		//사용자 입력값 초기화
		sel = 1;
		con = "Y";
		
	}
	/*
	public void setCon(String con)
	{
		this.con = con;
	}
	public String getCon();
	{
		return con;
	}
	public void setSel(Integer sel)
	{
		this.sel = sel;
	}
	public Integer getSel()
	{
		return sel;
	}*/

	//메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("[메뉴 선택]");
		System.out.println("1.요소 추가");
		System.out.println("2.요소 출력");
		System.out.println("3.요소 검색");
		System.out.println("4.요소 삭제");
		System.out.println("5.요소 변경");
		System.out.println("6.종료");
	}

	//메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		System.out.print(">> 메뉴 선택(1-6) : ");
		sel = Integer.parseInt(br.readLine());
	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case E_ADD : addElement(); break;
			case E_DISP : dispElement(); break;
			case E_FIND : findElement(); break;
			case E_DEL : delElement(); break;
			case E_CHA : chaElement(); break;
			case E_EXIT : exit(); break;
		}
	}

	//요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		int n=0;
		do
		{
			n++;
			System.out.printf("%d번째 요소 입력 : ",n);
			
			vt.add(br.readLine());
			System.out.printf("%d번째 요소 입력 성공~!!!\n2",n);

			System.out.printf("요소 입력 계속(Y/N)? : ");
			con = br.readLine();
		
			if (!con.equals("y") && !con.equals("Y"))
					break;
		}
		while (true);
	}
	
	//요소 출력 메소드
	public static void dispElement()
	{
		System.out.println("[벡터 전체 출력]");
		for (Object str : vt)
			System.out.println(str + " ");
		
		System.out.println("[벡터 출력완료]");

	}

	//요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.print("검색할 요소 입력 : ");
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			System.out.println("항목이 존재합니다.");
		}
		else
		{
			System.out.println("항목이 존재하지않습니다.");
		}
	}
	
	//요소 삭제 메소드
	public static void delElement()  throws IOException
	{
		System.out.print("삭제할 요소 입력 : ");
		
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			vt.remove(s1);
			System.out.println("항목을 삭제했습니다");
		}
		else
		{
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");}
	}
	
	//요소 수정(변경) 메소드
	public static void chaElement()  throws IOException
	{
		System.out.print("변경할 대상 입력 : ");
		String s1 = br.readLine();
		if (vt.contains(s1))
		{
			vt.remove(s1);
			System.out.print("수정할 내용 입력 : ");
			vt.add(br.readLine());
		}
		else
		{
			System.out.println("항목이 존재하지 않아 변경할 수 없습니다.");
		}
	}

	//프로그램 종료 메소드 -- 완성
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료~!!!!");
		System.exit(-1);
	}

	//main()메소드 -- 완성
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}