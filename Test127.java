/*============================================
	¡á¡á¡á ÀÚ¹ÙÀÇ ÁÖ¿ä(Áß¿ä) Å¬·¡½º ¡á¡á¡á
	- Wrapper Å¬·¡½º
============================================*/


import java.math.BigInteger;


public class Test127
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//long b1 = 123456789123456789l;
		//long c1 = 123456789123456789123456789l;

		//System.out.println(a1);
		//System.out.println(b1);
		//--==>> 123456789123456789
		//System.out.println(c1);

		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789132456789");

		//BigInteger c = a+b;
		//System.out.println(c)

		// ¡Ø ÀÏ¹ÝÀûÀÎ »ê¼ú¿¬»êÀÚ¸¦ ÅëÇÑ ¿¬»ê ºÒ°¡´É
		
		// ´õÇÏ±â 
		BigInteger c = a.add(b);
		System.out.println("µ¡¼À °á°ú : "+c);
		//--==>> µ¡¼À °á°ú : 246913578255913578

		//»©±â
		BigInteger d = a.subtract(b);
		System.out.println("»¬¼À °á°ú : "+d);
		//--==>>

		//°öÇÏ±â
		BigInteger e = a.multiply(b);
		System.out.println("°ö¼À °á°ú : "+e);
		//--==>> °ö¼À °á°ú : 15241578781784789617733731851190521

		//³ª´©±â
		BigInteger f = a.divide(b);
		System.out.println("³ª´°¼À °á°ú : "+f);
		//--==>>

		//Áö¼ö½Â
		BigInteger g = new BigInteger("2");
		System.out.println("2ÀÇ 3½Â : "+g.pow(3));
		//--==>>2ÀÇ 3½Â : 8
		
	}
}