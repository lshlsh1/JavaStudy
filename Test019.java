/*==========================================
	�����ڹ��� �⺻ ���α׷��֡���
 - �ڹ��� �⺻ ����� : java.util.Scanner
===========================================*/

// �� java.util.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ� ���ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//	  �ٸ� ������ ������ ��ȯ�� �� �ִ�.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		// �� �ֿ� ���� ����
		String name;
		int kor, eng, mat, tot;

		// �� ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(��,������) : ");
		//-- �̽���, 70, 80, 90

		//sc = new Scanner(sc.next()).useDelimiter("���ڿ��� ���ڿ� ������ , ");
		//sc = new Scanner(sc.next()).useDelimiter("\\s* �� \\s* ������ , ");	//������ ���ڿ� ��� = \\s*
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//			     ---------					 --
		// ���ڿ�����--"�̽���, 70, 80, 90"			������ ���ڿ��� ���ڿ��� 
		//											����� ���� �����ڸ� ���� ����

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		// ���� ����
		tot = kor + eng + mat;

		// �� ��� ���
		System.out.println();
		System.out.printf("�̸� : %s%n", name);
		System.out.printf("���� : %d%n", tot);
	}

}

//���� ���
/*
�̸�,����,����,���� �Է�(��,������) : �̽���,70,80,90

�̸� : �̽���
���� : 240
*/