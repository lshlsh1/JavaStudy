/*=============================
	■■■ 배열 ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적인 활동
=============================*/

// ○ 실습 문제
// 『char』자료형의 배열을 만들어 알파벳 대문자를 채우고
// 채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.

// 실행 예)
// A B C D .... W X Y Z
// 계속하려면 아무 키나

public class Test081
{
	public static void main(String[] args)
	{
		/* <내 풀이> → 틀림 ㅠㅠ
		char[] a = {A, B, C, D, E, F, G, H, I ,J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
		for ( i=0 ; i<a.length ; i++)
			System.out.print(a[i]+" ");
		*/

		// <선생님 풀이>
		//방법 ①
		/*
		char[] = arr;
		char[] arr = new char[26];
		
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
			:
			:
		arr[26] = 'Z';

		//방법 ②
		char[] arr2 = {'A', 'B', 'C', ... ,'X','Y','Z'};
		*/

		//방법 ③
		char[] arr3 = new char[26];
		for (int i=0, ch=65 ; i<arr3.length ; i++,ch++)
			arr3[i] = (char)ch;

		
		//배열 요소 전체 출력
		for (int i=0; i<arr3.length ; i++ )
			System.out.print(arr3[i]+" ");		

		System.out.println();

	}
}

//실행 결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
*/