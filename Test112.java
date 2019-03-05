/*================================
	■■■ 클래스 고급 ■■■ 
	- 인터페이스(Interface)
=================================*/
/*
	핸드폰 충전기와 핸드폰 이야기
	오디오 컴포넌트 그림

 ○ 인터페이스(Interface)란
	완전히 미완성인 채로 남겨져
	인터페이스 안에 존재하는 그 어떤 메소드도
	몸체(정의부)가 없기 때문에 실행 부분이 존재하지 않는다.
	클래스를 위한 템플릿으로써의 기능을 수행하는
	추상 클래스의 한 종류이다.

 ○ 인터페이스는 클래스와 달리 다중 상속이 가능하며
	인터페이스 자체도 상속된다.
	기존의 c++ 언어 등에서 지원되는 다중 상속이
	사용 과정에서 많은 문제점을 노출시켰기 때문에
	자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
	인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다,

 ○ 인터페이스는 상수와 추상 메소드만 가질 수 있으며
	인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
	『public』으로 설정되어 클래스에서 구현(implements)함으로써
	 바로 접근이 이루어질 수 있다.

 ○ 특징
 	- 추상 클래스의 일종으로 선언만 있고 정의가 없다.
	- final 변수는 가질 수 있다. (상수의 개념) . 변수는 가질 수 없다.
	- 인터페이스를 『public static final』상수만 만들 수 있다. - 상수화된 변수
	- 인터페이스를 구현하기 위해서는 『extends』대신에 『implements』를 이용한다.
	- 하나 이상의 인터페이스를 implements할 수 있다.
	- 인터페이스를 implements한 클래스는
	  인터페이스의 모든 메소드를 Overriding해야 한다. 
	  그렇게 해야 해당 클래스를 기반으로 한  인스턴스생성이 가능하다.
	- 인터페이스가 다른 인터페이스를 상속받을 수 있으며
	  이 때, 『extends』키워드를 사용한다.
	  또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.

Interface A
{
	메소드a();

	메소드b();

	메소드c();
}

class B		implements A
{
	메소드a();
	{.......;}
	메소드b();
	{.......;}
	메소드c();
	{.......}
}

class c
	main()
	{
		B ob = new B();
	}
*/


//인터페이스
interface Demo
{
	public static final double PI = 3.141592;

	// 인터페이스의 멤버 변수는 『static final』을 별도로 명시하여 붙이지 않아도
	// 자동으로 『static final』인 상태
	//public static final int a=10;
	public int a = 10;	//-- 가능

	/*메소드 정의 불가
	public void print()
	{
		System.out.println("인터페이스 print() 메소드...");
	}*/

	// 인터페이스의 메소드는 선언만 가능(정의 불가)
	// 자동으로 『abstract』인 상태
	// public abstract void print();
	public void print();
}

// 클래스
// class DemoImpl
//		↓
// Demo 인터페이스를 구현하는 추상 클래스
// abstract class DemoImpl			implements Demo
//		↓
class DemoImpl						implements Demo
{
	//추가적인 메소드 정의가능
	public void write()
	{
		System.out.println("클래스에 정의된 메소드...");
	}
		
	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의...");
	}
}

//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test112
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();
		//-- 인터페이스를 대상으로 인스턴스 생성 불가~!!!!

		DemoImpl obTemp = new DemoImpl();
		//-- Demo 인터페이스의 모든 메소드를 재정의한 DemoImpl 클래스는
		//	 인스턴스 생성 가능~!!!!

		//Demo ob = (Demo)obTemp;
		// 상위 = 하위 → 가능
		// 업 캐스팅
		
		// 인터페이스 객체는 상위 객체 
		Demo ob = new DemoImpl();	
		// 가능
		// 업캐스팅

		ob.print();
		//--==>> 인터페이스 메소드 재정의...

		//ob.write();
		//--==>> 에러 발생

		((DemoImpl)ob).write();		//-- 다운 캐스팅
		//--==>>클래스에 정의된 메소드...

		System.out.println(Demo.PI);//-- static 이기 때문에...
		//--==>> 3.141592
		
		System.out.println(Demo.a);	//-- static 이기 때문에...
		//--==>> 10

		//Demo.a =30;				//-- final 이기 때문에
		//--==>> 에러 발생
		
	}
}

//실행 결과
/*
인터페이스 메소드 재정의...
클래스에 정의된 메소드...
3.141592
10
*/