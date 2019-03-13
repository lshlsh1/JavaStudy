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


public class Test158_Test	extends Menus
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
	//메뉴 출력 메소드
	public static void menuDisp()
	{
	}

	//메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
	}

	//요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
	}

	//요소 출력 메소드
	public static void dispElement()
	{
	}

	//요소 검색 메소드
	public static void findElement() throws IOException
	{
	}

	//요소 삭제 메소드
	public static void delElement()  throws IOException
	{
	}

	//요소 수정(변경) 메소드
	public static void chaElement()  throws IOException
	{
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

