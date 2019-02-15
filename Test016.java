/*============================================
	■■■ 자바의 기본 프로그래밍 ■■■
	- 자바의 기본 입출력 printf()
==========================================*/


public class Test016
{
	public static void main (String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");		//--『\n』개행

		//서식 출력 메소드
		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");		//--『\n』개행
		System.out.printf("12345678901234567890%n");	//--『%n』개행
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//--==>> AAABBBCCC
		//		 1234567890123456789012345678901234567890
		//		 12345678901234567890
		//		  10 + 20 = 30

		System.out.printf("%d\n",123);
		System.out.printf("%10d\n", 123); // 10글자안에 문자 위치
		//숫자우측정렬, 문자 좌측정렬
		System.out.printf("%010d\n", 123);
		//--==>> 123
		//		        123
		//		 0000000123

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365);
		//--==>> +365
		//		 +365

		System.out.printf("%d\n", +365);
		//--==>> 365
		
		//System.out.printf("%-d\n", 365);			//-- 런타임 에러 발생
		System.out.printf("-%d\n", 365); 
		System.out.printf("%d\n", -365);
		//--==>> -365
		//		 -365

		//★기억해두기
		System.out.printf("%(d\n", -365);
		System.out.printf("%(d\n", 365);
		//--==>> (365)
		//		  365
		
		//System.out.printf("%d\n", 'A');			//-- 런타임 에러 발생
		System.out.printf("%c\n", 'A');
		//System.out.printf("%c\n", "ABCD");		//-- 런타임 에러 발생
		System.out.printf("%s\n", "ABCD");
		//--==>> A
		//		 ABCD

		System.out.printf("%h\n", 365);				//16진수의 형태
		System.out.printf("%o\n", 24);				//8진수의 형태
		//--==>> 16d
		//		 30

		System.out.printf("%s\n", "true");
		System.out.printf("%b\n", true);
		//--==>> true
		//		 true
		
		System.out.printf("%f\n", 123.23);			//f는 기본적으로 소숫점이하 6자리숫자까지 표기
		System.out.printf("%.2f\n", 123.23);
		System.out.printf("%.2f\n", 123.236);		//check				//반올림 사용을 주의할 것
		System.out.printf("%8.2f\n", 123.236);		//check				//_ _ 1 2 3 . 2 4 //8칸안에 숫자와 점, 소숫점까지 표기
		System.out.printf("%2.2f\n", 123.1234);		//check				//원본 데이터보다 숫자가 작을 경우에는 점 앞 모두 표기
		//--==>> 123.230000
		//		 123.23
		//		 123.24
		//		  123.24
		//		 123.12

	}


}


//실행 결과
/*
AAABBBCCC
1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
       123
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
true
123.230000
123.23
123.24
  123.24
123.12
*/