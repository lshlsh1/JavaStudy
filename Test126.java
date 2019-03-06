/*============================================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Wrapper Ŭ����
============================================*/

//java.sun.com API���� �뵵 ã�ƺ��� 

public class Test126
{
	public static void main(String[] args)
	{
		boolean bi = true;
		//�ν��Ͻ� ����
		Boolean wrapBi = new Boolean(bi);
		Boolean wBi = bi;	//-- ���� �ڽ�

		int n = 300;
		Integer wrapN = new Integer(n);
		int n2 = wrapN;		//-- ���� ��ڽ�

		float f = 300.3f;
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());	//--==>> true
		System.out.println(wrapN.toString());	//--==>> 300
		System.out.println(wrapF.toString());	//--==>> 300.3

		System.out.println(wrapBi);				//--==>> true
		System.out.println(wrapN);				//--==>> 300
		System.out.println(wrapF);				//--==>> 300.3

		System.out.println(wBi);				//--==>> true
		System.out.println(n2);					//--==>> 300

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();

		// Integer Ŭ����
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  12

		ni = Integer.parseInt("0101",2);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :   5
		// 2����

		ni = Integer.parseInt("12",8);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10

		ni = Integer.parseInt("A",16);
		System.out.printf("ni : %3d\n", ni);
		//--==>> ni :  10

		sn = Integer.toBinaryString(20);
		System.out.printf(" sn : %s\n", sn);
		//--==>> sn : 10100
		// 2������ ���ڿ� ���·� ��ȯ��

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 1f
		
		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>> sn : 37

		Integer num = new Integer(50);
		System.out.println(num.toString());
		//--==>> 50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4);
		//--==>> 345

	}
}