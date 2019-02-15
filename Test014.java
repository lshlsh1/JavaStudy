public class Test014
{
	// 추가 변수 선언
	String strTemp;		//-- 문자열 데이터 임시 저장 변수

	// 연산 및 처리
	// 사용자에게 안내 메세지 출력(이름 입력 안내)
	System.out.print("수학 점수 입력 : ");

	// 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
	strTemp = br.readLine();		//-- 문자열 임시 저장
									//	 (기존 영어점수에 덮어쓰기)
	nMat = integer.parseInt(strTemp);	//--임시저장 데이터 형 변환 후
										//	수학 점수 변수에 담아내기
	// 입력된 데이터들을 종합하여 총점 산출하기
	nTot = nKor + nEng + nMat;

	//결과 출력
	//System.out.println(); //개행
	System.out.println("\n====[결과]====");
	System.out.println("이름 : "+ strName);
	System.out.println("총점 : "+ nTot);
	System.out.println("=============")

}
