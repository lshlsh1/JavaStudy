/*========================================
	■■■ 연산자(Operator) ■■■
	- 비트 단위 연산자4
========================================*/

// 비트 shift 연산자

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
		System.out.printf("x << 32 = %d\n", x<<32); // 원래 자기가 가지고 있던 숫자

	}
}

/*
	128		→	00000000 00000000 00000000 10000000
	
	128<<3	→	00000000 00000000 00000100 00000000

	128>>3	→  00000000 00000000 00000000 00010000

	128<<24	→	10000000 00000000 00000000 00000000 => -2147483648


*/