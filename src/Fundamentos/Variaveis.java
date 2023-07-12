package Fundamentos;

public class Variaveis {
	public static void main(String[] args) {
		int x = 10;
		System.out.println (x++); //10 (11)
		System.out.println (++x); //12
		System.out.println (x--); //12 (11)
		System.out.println (--x); // 10
		x += 20;
		System.out.println ("O valor de x + 10 = " + x);
	}
}