/*=============================
	���� �迭 ����
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻���� Ȱ��
=============================*/

// �� �ǽ� ����
// ��char���ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä���
// ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// A B C D .... W X Y Z
// ����Ϸ��� �ƹ� Ű��

public class Test081
{
	public static void main(String[] args)
	{
		/* <�� Ǯ��> �� Ʋ�� �Ф�
		char[] a = {A, B, C, D, E, F, G, H, I ,J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
		for ( i=0 ; i<a.length ; i++)
			System.out.print(a[i]+" ");
		*/

		// <������ Ǯ��>
		//��� ��
		/*
		char[] = arr;
		char[] arr = new char[26];
		
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
			:
			:
		arr[26] = 'Z';

		//��� ��
		char[] arr2 = {'A', 'B', 'C', ... ,'X','Y','Z'};
		*/

		//��� ��
		char[] arr3 = new char[26];
		for (int i=0, ch=65 ; i<arr3.length ; i++,ch++)
			arr3[i] = (char)ch;

		
		//�迭 ��� ��ü ���
		for (int i=0; i<arr3.length ; i++ )
			System.out.print(arr3[i]+" ");		

		System.out.println();

	}
}

//���� ���
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
*/