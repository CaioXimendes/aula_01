package Fundamentos;

public class exercicio17_aula_03 {
	public static void main(String[] args) {
		double soma1 = 0;
		double soma2 = 0;
		for(int x = 1; x < 21; x = x + 1) {
			if (x%3 == 0) {
				soma1 = soma1 + x;
			}
			if (x%5 == 0) {
				soma2 = soma2 + x;
			}
			}
		System.out.println("soma dos multiplos de 3 foram: " + soma1);
		System.out.println("soma dos multiplos de 5 foram: "+ soma2);
		double somatotal = 0;
		somatotal = soma1+soma2;
		System.out.println("A soma entre os multiplos de 3 e 5 foi: "+somatotal);
		}
}