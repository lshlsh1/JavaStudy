/*========================================
	■■■ 클래스와 인스턴스 ■■■
========================================*/

// ○ 실습 문제
// 원의 넓이와 둘레 구하기

// 원의 넓이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다.
// (클래스명 : CircleTest) → CircleTest.java

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

// 실행 예)
// 반지름 입력 : xxx //(정수)

// >> 넓이 : xxx.xx
// >> 둘레 : xxx.xx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException //수류탄 건물밖으로 던지기
	{
		/*
		CircleTest ob = new CircleTest();

		ob.intput();

		double areA = ob.area();
		double lengtH = ob.length();

		ob.print(areA, lengtH);
		*/

		//<선생님 풀이>

		CircleTest ob = new CircleTest();

		ob.input();	//-- 수류탄이 문밖으로 나옴

		double area = ob.calArea();
		double length = ob.calLength();

		ob.print(area, length);


	}
}

//실행 결과
/*
반지름 입력 : 10

>> 반지름이 10인 원의
>> 넓이 : 314.16
>> 둘레 : 62.83
*/