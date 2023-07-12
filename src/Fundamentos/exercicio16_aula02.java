package Fundamentos;

public class exercicio16_aula02 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i = i+1) {
			for(int x = 1; x <= i; x = x+1) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
