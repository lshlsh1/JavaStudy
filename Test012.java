/*================================= =========================
				�����ڹ� �⺻ ���α׷��֡���
					  -������ �ڷ���
		   -�ڹ��� �⺻ ����� : BufferedReader Ŭ����
				         Test012.java
==========================================================*/

// ����ڷκ��� �������� �Է¹޾�
// �� �Է¹��� �������� ����
// ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ������ �Է� : 120
// ���� : xxxxx.xx
// �ѷ� : xxxxx.xx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{	
		// BudderedReader Ŭ���� �ν��Ͻ� ���� -> ��ǻ�� ��ü�� Ű���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		// �ֿ� ���� ����
		int r;			// ������
		double a, b;	// ����, �ѷ�

		// ���� �� ó��
		// 1. ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
		
		// 2. ����ڰ� �Է��� ��(���ڿ�)�� 
		// ������(������) ���� ��ȯ�� �� -> Integer.parseInt()
		// ������ ���� r�� ��Ƴ���
		r=Integer.parseInt(br.readLine());

		// 3. ���� �� �ѷ� ����
		a = r*r*3.141592;
		b = r*2*3.141592;

		// ��� ���
		//System.out.println(">> ���� : "+a);
		//System.out.println(">> �ѷ� : "+b);
		System.out.printf(">> ���� : %.2f\n>> �ѷ� : %.2f\n",a,b);
		//-- ��%f�� 10���� �Ǽ����� ��Ƴ��� �ɼǹ���
		//-- ��%.2f�� �� �Ҽ��� ���� ��°�ڸ����� ǥ���ϰڴٴ� �ǹ��� �߰� �ɼ�
	}
}
//���� ���
/*
���� ������ �Է� : 120
>> ���� : 45238.92
>> �ѷ� : 753.98
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/