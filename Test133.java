/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- StringBuffer Ŭ����
============================================*/

/*
�� StringBuffer Ŭ������
	���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
	String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
	StringBuffer Ŭ������ ���ڿ��� ����� ��
	���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִٴ� ���̴�.

	��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
	��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	���� ������ ���� ũ�⸦ �ٲ� �� �ִ� ����� �����ϴ� ���̴�
	
	����, JDK 1.5 ���ĺ��ʹ�
	���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�
	StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	���� ū �������� multi - thread unsafe ��� ���̴�
	��, Syncronization�� ���� ������
	StringBuffer���� ������ ���ü�(����ȭ) ������ ���ٸ�
	StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.

	Buffer �ӽ��������
	multi - thread unsafe ���߻���ڰ� �۾��ϴ� ��
*/

public class Test133
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);	//--==>>false
		// string���� == �ּҺ�
		System.out.println(sb1.equals(sb2));//--==>>false
		// string�� equals ���ں�
	
		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true
		// StringBuffer toString => StringBuffer�� String���� �ٲ���
		// string equals() �޼ҵ� �������̵� [�ּҰ� ��-> ���ڿ� �� ��]

		StringBuffer sb3 = new StringBuffer();

		//-- StringBuffer �⺻ ������ ȣ�� ��(�ν��Ͻ� ���� ����)
		//	 �⺻������ �����Ǵ� ���� ũ��� ��16��

		System.out.println("���� ũ�� : "+sb3.capacity());
		//--==>>���� ũ�� : 16

		///////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��


		sb3.append("seoul"); // sb3 += "seoul";
		sb3.append("korea"); 
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		//--==>>seoulKorea�츮������ѹα�
		// ���ڿ��� �߰��� ���̴� �޼ҵ� append, append() �̿�� �߰��Ǵ� ���ڿ��� �ڿ� �ٴ´�

		System.out.println(sb3.toString());
		//--==>>seoulKorea�츮������ѹα�

		System.out.println("���� ũ�� : "+sb3. capacity());
		//--==>>���� ũ�� : 34

		/////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>>JAVA AND ORACLE
		
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp1.toLowerCase());
		//--==>>java and oracle

		//System.out.println(sb3.toUpperCase());
		//String���� toUpperCase()�� �������� �ʴ´�.
		// toLowerCase()�� ���������̴�.

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		System.out.println(temp3.toLowerCase());
		//--==>>SEOULKOREA�츮������ѹα�
		//		seoulkorea�츮������ѹα�

		System.out.print(sb3.toString().toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�
		//�̷��� ����� �� ������ sb3�� ���� �ٲ���� �ƴ϶�°��� ����

		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �տ�
		//	  ���ѱ����̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�"); // �ε���, �߰����ڿ�
		System.out.println("seoul �տ� ���ѱ����߰� : "+sb3.toString());
		//seoul �տ� ���ѱ����߰� : �ѱ�seoulKorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �ڿ�
		//	  ������� ���ڿ� �߰�
		//	  �� ��� ���ڿ��� �ε����� ���� Ȯ������ ����...
		

		// step 1
		System.out.println(sb3.toString());
		
		// step2 
		//sb3.insert(7, "���");
		//System.out.println("seoul �ڿ� ��������߰� : "+sb3.toString());
		
		//step3
		//sb3.indexOf("seoul");
		System.out.println(sb3.indexOf("seoul"));
		//--==>>

		//step4
		sb3.insert(sb3.indexOf("seoul"), "���");
		System.out.println(sb3.toString());
		//--==>>

		//step5
		//sb3.Insert(sb3.indexOf("seoul")+5. "���");
		//System.out.println(sb3.toString());

		//stp6
		//sb3.insert(sb3.indexOf("seoul")+("seoul"�� ����), "���");
		//System.out.println(sb3.toString());
	
		//step7
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(), "���");
		System.out.println(sb3.toString());
		//--==>>�ѱ����seoul���Korea�츮������ѹα�
		
		// �� �츮���� ���ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>>�ѱ����seoul���Kor������ѹα�

		//sb3.delete(16,20);
		//System.out.println(sb3);
		//--==>>�ѱ����seoul���Korea���ѹα�

		//sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		//System.out.println(sb3);
		//--==>> �ѱ����seoul���Korea���ѹα�
		
		// �� ��� ���ڿ�(sb3)����
		//	  ��korea������ ���ڿ� ����(korea ����)
		// �ѱ����seoul���Korea���ѹα�
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3.toString());
		
		
		// �� ��� ���ڿ�(sb3)����
		// ����������� ���ڿ� ���� (��� ����)

		sb3.delete(sb3.indexOf("���"), sb3.length());
		System.out.println(sb3.toString());


		////////////////////////////////////////////////////////

		//���� ũ�� Ȯ��
		System.out.println("���� ũ�� :"+sb3.capacity());
		//--==>> ���� ũ�� : 34

	
		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : "+sb3.length());
		//--==>> ���ڿ��� ���� : 

		// ���� ũ�� ���� �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...

		sb3.trimToSize();
		
		// ���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : "+sb3.capacity());
		

		
	}
}