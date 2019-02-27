/*=====================================================
	■■■ 메소드 중복정의(Method Overloading) ■■■
	- 메소드 오버로딩이 가능한 형태와 불가능한 형태
=======================================================*/

public class Test096
{
	public static void main(String[] args)
	{
		print();
		print(10);
		print('a');
		print(10, 20);
		print(10, 3.14);
		print(3.14, 10);
		double result = print(3.14);
		//print(3.14); ->안 됨
	}

	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}					//--(X) 매개변수 이름이 다르다고 하더라도 실행불가능
	public static void print(char i){}					//-- ※ 가능은하지만 자동형변환 규칙을 체크해야한다. char→int형으로 자동형변환되기때문에...
	public static void print(int i, int j){}			//-- 매개변수 두개라서 실행가능
	public static void print(int i, double d){}			//-- ※ 가능은하지만 자동형변환 규칙을 체크해야한다. int → double형으로 자동형변환
	public static void print(double d, int i){}			//-- ※ 가능은하지만 자동형변환 규칙을 체크해야한다. int → double형으로 자동형변환
	public static double print(double d){return 3.14;}	
	public static void print(double d){}				//--(X) check 대입연산은 나중에 처리하기때문에 컴퓨터가 인식하지 못한다.
	
}