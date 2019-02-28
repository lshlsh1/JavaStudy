/*========================
	■■■ 배열 ■■■
	- 배열의 복사
=========================*/

// ○ 실습 문제
// 임의의 배열(a, b)에 들어있는 숫자들의 합집합을 출력하는 프로그램을 구현한다.
// 단, 중복이 제거된 상태의 합집합을 출력할 수 있도록 한다.
// 또한, 배열 복사 개념을 적용시켜 처리할 수 있도록 한다.

// ex) 임의의 두 배열
// int[] a = {2, 3, 7, 10, 11}
// int[] b = {3, 6, 10, 14}

// 실행 예)
// 2 3 7 10 11 6 14
// 게속하려면 아무 키나 누르세요....

public class Test099_A
{
	public static void main(String[] args)
	{
		//임의의 두 배열
		int[] a = {2, 3, 7, 10, 11};
		int[] b = {3, 6, 10, 14};

		//방법 ①
		/*
		// - 집합 a의 전체 요소 출력
		for (int i=0 ; i<a.length ; i++)	// a출력

			System.out.printf("%3d",a[i]);
		// - 집합 b의 요소 출력
		// 단, 집합b는 집합a의 요소와 중복되는 데이터를 
		// 제거하면서 출력

		for (int i=0 ; i<b.length ; i++)	//4회전 //웅웅거리면서 b를 기준으로 a를 비교(b출력-선택적 출력)
		{
			boolean flag = false;	//중복되지 않았다는것을 전제

			for (int j=0; j<a.length ; j++)	//5회전
			{
				if (b[i] == a[j])	//중복된 값을 발견했다면
				{
					flag = true;	//-- 중복 확인
					break;			//-- 멈춘다. 그리고 빠져나간다.(j 반복문 탈출)
				}
			}

			if (flag)				//flag가 true라면 ...(중복되면)
				continue;			//뒷부분 무시하고 계속한다
			System.out.printf("%3d", b[i]);	// 뒷부분
		}
		System.out.println();
		//실행결과
		//  2  3  7 10 11  6 14
		*/


		// 방법 ②
		//배열
		//1.동질 성격요소를 취해야한다.
		//2.어떤 형태로든 길이를 변화시킬 수 없다
		// - 임시 배열을 만들고
		//int[] temp = new int[????];
		int[] temp = new int[a.length + b.length];

		// - 만들어진 임시배열에 중복되지 않은 배열 요소를 채운 다음
		int n;	//-- 변수 선언 위치 중요~!!!! check~!!!!
		for (n=0 ; n<a.length ; n++)
		{
			temp[n] = a[n];			// n : 0 1 2 3 4 --------- 5
		}

		for (int k=0 ; k<b.length ; k++)
		{
			boolean flag = false;	//중복되지 않았다는것을 전제

			for (int m=0; m<a.length ; m++)	
			{
				if (b[k] == a[m])	//중복된 값을 발견했다면
				{
					flag = true;	//-- 중복 확인
					break;			//-- 멈춘다. 그리고 빠져나간다.(m 반복문 탈출)
				}
			}

			if (flag)				//flag가 true라면 ...(중복되면)
				continue;			//뒷부분 무시하고 계속한다
			temp[n] = b[k];			// n => 5 뒷부분
			n++;
			
		}

		// - 그렇게 구성된 임시 배열을 출력한다.
		for (int h=0 ; h<n ; h++)
		{
			System.out.printf("%3d",temp[h]);
		}System.out.println();
					
		
	}//end main
}

//실행 결과
//  2  3  7 10 11  6 14