/*==============================================================
	컬렉션(Collection)
==============================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test155{

	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args){
		// 벡터 자료구조 생성
		Vector<String> v = new Vector<String>();

		// v라는 벡터 자료구조에 colors 요소 추가
		for (String str : colors)
			v.add(str);

		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("마지막 요소 : " + v.lastElement());
		System.out.println("요소의 갯수 : " + v.size());
		
		// 첫 번째 요소를 "하양"으로 변경
		v.set(0, "하양");
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 갯수 : " + v.size());

		// 첫 번째 요소에 "주황" 추가
		v.insertElementAt("주황", 0);
		System.out.println("첫 번째 요소 : " + v.firstElement());
		System.out.println("두 번째 요소 : " + v.get(1));
		System.out.println("요소의 갯수 : " + v.size());

		// 전체 출력
		System.out.print("전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		// 오름차순 정렬
		Collections.sort(v);
		System.out.print("오름차순 정렬 후 전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		// 실제 인덱스도 변경됨.

		// 검색
		// Collections.binarySearch()
		// 검색 기능 수행. 단, 오름차순 정렬된 자료만 사용 가능.
		// 검색 결과가 존재하지 않을 경우... 음수를 반환한다.
		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);

		int idxnavi = Collections.binarySearch(v, "남색");
		System.out.printf("남색 : %d 번째 인덱스에 위치하고 있다.\n", idxnavi);

		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();
		idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);

		
		idxBlue = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.printf("파랑 : %d 번째 인덱스에 위치하고 있다.\n", idxBlue);
	}
}