/*==========================================
	■■■ 주민등록번호 유효성 검사 ■■■
============================================*/

/*
○ 주민등록번호 검증 공식

   ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	  123456-1234567(주민번호)
	  ****** ******
	  234567 892345 각자리에 곱해질 수	

   ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
   	   * * * * * *   * * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5 
   ---------------------------------
   → 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15 == 217
	   
   ③ 더해진 결과물을 11로 나누어 『나머지』를 구한다
   	  나머지가 두 자리면 나머지를 10으로 나눈다.
  	  11 은 주민번호 마지막 숫자 0
	  10 은 주민번호 마지막 숫자 1

		 19
	  --------
   11 | 217
   		11
	  -------
	    107
		 99
	 --------
	 	  8	→ 나머지

   ④ 11에서 나머지를 뺀 결과값을 구한다
   	  
	  11 - 8

   ⑤ ④에서 처리한 연산 결과가 주민번호를 구성하는 마지막 숫자와 일치하는지 비교한다

		  			  일치
	  11 - 8 연산결과 3 == 주민번호 마지막 숫자 3

   ※ 마지막 숫자와 같은 경우 유효한 주민등록번호~!!!!
  

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력갯수 초과
// >> 입력오류~!!!
// 계속하려면 아무키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456 → 입력갯수 부족
// >> 입력오류~!!!

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-1234567 → 유효한 주민번호
// >> 정확한 주민번호~!!!

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-1234567 → 유효하지 않은 주민번호
// >> 잘못된 주민번호~!!!

 ※ 문자열.length() → 문자열의 길이 반환
	문자열.substring() → 문자열 추출
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test101
{
	public static void main(String[] args)	throws IOException
	{
		/*
		//테스트
		String strTemp = "동해물과백두산이 마르고닳고록";
		System.out.println(strTemp.length());
		//--==>> 15

		//테스트
		System.out.println("남산위의 저 소나무".length()); 
		//--==>> 10
		
		// 테스트
		System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 5));	//인덱스 0부터 셈. //인덱스 3부터 5전까지
		//--==>> de
		
		// 테스트
		//System.out.println("abcdefghijklmnopqrstuvwxyz".substring(3, 50)); 
		//--==>>java.lang.StringIndexOutOfBoundsException
		//		문자열의 영역을 벗어나면 에러
		
		// 테스트
		System.out.println("봄이오니졸려죽겠네".substring(4, 9));
		//--==>>졸려죽겠네

		//테스트
		System.out.println("졸려도좀참자".substring(3));		//인덱스 3부터 문자열length(끝)까지
		System.out.println("졸려도좀참자".substring(3, "졸려도좀참자".length()));
		System.out.println("졸려도좀참자".substring(3 ,6));
		//--==>>좀참자
		//		좀참자
		//		좀참자
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;

		do
		{
			System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
			num = br.readLine();

				if (num.length()!=14)
			{
				System.out.println(">> 입력오류~!!!");	
			}
					
		}
		while (num.length()!=14);
		
		int sum=0;
		int sum2=0;
		int sum3=0;
		/*
		sum = Integer.parseInt(num.substring(0, 1))*2 + Integer.parseInt(num.substring(1, 2))*3 + Integer.parseInt(num.substring(2, 3))*4 + Integer.parseInt(num.substring(3, 4))*5 +
				Integer.parseInt(num.substring(4, 5))*6 + Integer.parseInt(num.substring(5, 6))*7 +
				Integer.parseInt(num.substring(7, 8))*8 + Integer.parseInt(num.substring(8, 9))*9 + Integer.parseInt(num.substring(9, 10))*2 + 
				Integer.parseInt(num.substring(10, 11))*3 + Integer.parseInt(num.substring(11, 12))*4 + Integer.parseInt(num.substring(12, 13))*5;
				*/

		int[] arr1 = new int[13];
		int[] arr2 = {2 ,3 ,4, 5, 6, 7, 0, 8, 9, 2, 3 ,4, 5};

		for (int i=0 ; i<6 ; i++)
		{
			sum += Integer.parseInt(num.substring(i, i+1))*arr2[i];
		}

		for ( int i=7 ; i<13 ; i++)
		{
			sum2 += Integer.parseInt(num.substring(i, i+1))*arr2[i];
		}

		sum3 = sum+sum2;
		
		//System.out.println(sum);
		//System.out.println(sum3);
		
		
		int namuji, end;
		namuji = sum3%11;

		if (namuji>=10)
		{
			if (namuji%10==0)
			{
				end = 1;
			}
			else if (namuji%10==1)
			{
				end = 0;
			}
		}

		end = 11-namuji;

		if (end==Integer.parseInt(num.substring(13, 14)))
		{
			System.out.println(">> 정확한 주민번호~!!!");
		}
		else
		{
			System.out.println(">> 잘못된 주민번호~!!!");
		}

	}
}

//실행 결과
/*
주민번호 입력(xxxxxx-xxxxxxx) : 750615-1862133
>> 정확한 주민번호~!!!
*/