/*========================================
	���� ������(Operator) ����
	- ���� ������ == ���� ������
========================================*/

// �۽ǽ� ����
// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������.. �������� ������� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
// ������ ���� �����ڸ� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű��...

// ������ ���� �Է� : 2011
// 2011�� �� ���
// ����Ϸ��� �ƹ� Ű��...

// �� ������ �Ǻ� ����
//	  ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//	  �Ǵ� 400�� ����̸� ����
//	  �׷��� ������ ���
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		int a;
		String b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		a = Integer.parseInt(br.readLine());
		
		b = (a%4==0 && a%100!=0 || a%400==0) ? "����" : "���"; 
		
		System.out.print("������ ���� �Է� : ");
		System.out.printf("%d �� %s\n", a, b);
	}
}