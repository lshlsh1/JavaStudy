/*=============================================
	���� ���� �帧�� ��Ʈ��(���) ����
	- if�� ~ else�� �ǽ�
===============================================*/

// �� ����
// ����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾�
// �̸� �Ǻ��Ͽ� �Է¹��� ���ĺ��� ������ ��츸
// ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ��ҹ��ڸ� ��� ������ �� �ֵ��� ó���Ѵ�.
// ����, ���ĺ� �̿��� ���ڰ� �ԷµǾ��� ���
// �Է� ������ ���� ������ ����ڿ��� �ȳ��� �� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���ĺ� �� ���� �Է� : A
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : e
// >> ���� OK~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : B
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ĺ� �� ���� �Է� : 1
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException; //IOException ��ȯ

public class Test038
{
	public static void main(String[] args) throws IOException //IOException ����
	{
		char a;		//��������
		System.out.print("���ĺ� �� ���� �Է� : "); //�޼��� ���
		a = (char)System.in.read();					//(char������ ����ȯ�Ͽ�) System.in.read�� ���� �Է¹ޱ� 


		//���� �� ��� ���
		if((a>=65 && a<=90) || (a>=97 && a<=122))	//���ĺ����� �ƽ�Ű�ڵ尪, �빮��(65~90),�ҹ���(97~122)�� 1�� ����
		{
			if(a=='a' || a=='i' || a=='u' || a=='e' || a=='o' )		// �ҹ��� ���� �Է½�
			{
				System.out.print(">> ���� OK~!!!!\n");				// �޼��� ���
			}
			else if(a=='A' || a=='I' || a=='U' || a=='E' || a=='O' )// �빮�� ���� �Է½�
			{
				System.out.print(">> ���� OK~!!!!\n");				// �޼��� ���
			}
		}
		else
		{
			System.out.print("�Է¿���~!!!!\n");					//���ĺ� �ܿ� �ٸ� �� �Է½ÿ� �޼����� ����Ѵ�
		}

	}
}