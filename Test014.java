public class Test014
{
	// �߰� ���� ����
	String strTemp;		//-- ���ڿ� ������ �ӽ� ���� ����

	// ���� �� ó��
	// ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	// ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
	strTemp = br.readLine();		//-- ���ڿ� �ӽ� ����
									//	 (���� ���������� �����)
	nMat = integer.parseInt(strTemp);	//--�ӽ����� ������ �� ��ȯ ��
										//	���� ���� ������ ��Ƴ���
	// �Էµ� �����͵��� �����Ͽ� ���� �����ϱ�
	nTot = nKor + nEng + nMat;

	//��� ���
	//System.out.println(); //����
	System.out.println("\n====[���]====");
	System.out.println("�̸� : "+ strName);
	System.out.println("���� : "+ nTot);
	System.out.println("=============")

}
