/*========================================
	���� ������(Operator) ����
	- ��Ʈ ���� ������4
========================================*/

// ��Ʈ shift ������

public class Test026
{
	public static void main(String[] args)
	{
		int x = 128;

		System.out.printf("x << 3 = %d\n", x<<3);
		System.out.printf("x * 8 = %d\n", x*8);
		System.out.printf("x >> 3 = %d\n", x>>3);
		System.out.printf("x / 8 = %d\n", x/8);

		System.out.printf("x << 24 = %d\n", x<<24);
		System.out.printf("x << 25 = %d\n", x<<25);
		System.out.printf("x << 31 = %d\n", x<<31);
		System.out.printf("x << 32 = %d\n", x<<32); // ���� �ڱⰡ ������ �ִ� ����

	}
}

/*
	128		��	00000000 00000000 00000000 10000000
	
	128<<3	��	00000000 00000000 00000100 00000000

	128>>3	��  00000000 00000000 00000000 00010000

	128<<24	��	10000000 00000000 00000000 00000000 => -2147483648


*/