/*================================= =========================
			���� �ڹ� �⺻ ���α׷��� ����
					 -������ �ڷ���
		   -�ڹ��� �⺻ ����� : BufferedReader 
==========================================================*/

// ����ڷκ��� �̸��� ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ������
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

//===[���]===
// �̸� : �ѽ¿�
// ���� : 240
//=============
//����Ϸ��� �ƹ� Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ֿ� ���� ����
		String name;		//�̸� 
		int sub1,sub2,sub3,total;  //���� ���� ���� ����

		//���� �� ���
		System.out.print("�̸��� �Է��ϼ��� : ");
		// 1. �̸��� �Է¹޴´�.
		name = br.readLine();
		System.out.print("���� ���� �Է� : ");
		// 2. ���������� �Է¹޴´�.
		sub1 = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		// 3. ���������� �Է¹޴´�.
		sub2 = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		// 4. ���������� �Է¹޴´�.
		sub3 = Integer.parseInt(br.readLine());
		
		// 5. ������ ����Ѵ�.
		total=sub1+sub2+sub3;
		
		// 6. ���
		System.out.println("\n===[���]===");
		System.out.printf("�̸� : %s\n���� : %d\n=============\n",name,total);
		*/

		//����� Version
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		//�ֿ� ���� ����
		String strName;				//--�̸� ����
		int nKor,nEng,nMat,nTot;	//--����,����,����,����


	}
}

//������
/*
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

===[���]===
�̸� : ������
���� : 240
=============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/